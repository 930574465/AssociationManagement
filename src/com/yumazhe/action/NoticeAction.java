package com.yumazhe.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.TokenHelper;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yumazhe.pojo.Notice;
import com.yumazhe.pojo.User;
import com.yumazhe.service.NoticeService;
import com.yumazhe.service.UserService;

public class NoticeAction extends ActionSupport implements ModelDriven<Notice> {
	private static final long serialVersionUID = 7486167082500744919L;
	private Notice notice = new Notice();
	private NoticeService noticeService;
	private UserService userService;
	private HttpServletRequest request;
	
	private File appendFile;
	private String appendFileFileName;
	private String appendFileContentType;
	
	public InputStream inputStream; //框架有bug，变量名不能为in
    public String fileName;
	
	private int page = 0;
	private int size = 10;
	
	private Map<String, Object> session = ActionContext.getContext().getSession();
	
	public NoticeAction() {
		request = ServletActionContext.getRequest();
	}
	
	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public File getAppendFile() {
		return appendFile;
	}

	public void setAppendFile(File appendFile) {
		this.appendFile = appendFile;
	}

	public String getAppendFileFileName() {
		return appendFileFileName;
	}

	public void setAppendFileFileName(String appendFileFileName) {
		this.appendFileFileName = appendFileFileName;
	}

	public String getAppendFileContentType() {
		return appendFileContentType;
	}

	public void setAppendFileContentType(String appendFileContentType) {
		this.appendFileContentType = appendFileContentType;
	}
	

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setPage(int page) {
		this.page = page;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public Notice getModel() {
		return notice;
	}
	
	public String queryByPage() {
		//解决Action转发而产生的问题
		if (ActionContext.getContext().getActionInvocation().getProxy().getActionName().equals("queryByPageNotice")) {
			notice.setPermission(null);
		}
		
		//notice.getPermission()的值为空代表获取所有的公告，1代表获取内部公告，需要先登录
		if (session.get("loginedUser")==null && (notice.getPermission()==null || notice.getPermission().equals("1"))) {
			return "notLogin";
		}
		
		List<Notice> noticeList = noticeService.queryByPage(page*size, size, notice);
		if (noticeList!=null) {
			session.put("noticeList", noticeList);
			if (notice.getPermission() == null) {
				request.setAttribute("countNumber", noticeService.getCount());
			} else {
				request.setAttribute("countNumber", noticeService.getCountByPermission(notice));
			}
			request.setAttribute("currPage", page+1);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String queryById() {
		Notice dbNotice = null;
		try {
			dbNotice = noticeService.queryById(notice.getId());
			dbNotice.setClicks(dbNotice.getClicks()+1);
			//增加点击量
			noticeService.modify(dbNotice);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (dbNotice != null) {
			session.put("queryNotice", dbNotice);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String add() {
		boolean flag = true;

		if (notice.getContent()!=null && !notice.getContent().trim().equals("")) {
			notice.setContent(notice.getContent().trim());
		} else {
			flag = false;
		}
		if (notice.getTitle()!=null && !notice.getTitle().trim().equals("")) {
			notice.setTitle(notice.getTitle().trim());
		} else {
			flag = false;
		}
		if (notice.getPermission() != null) {
			notice.setPermission(notice.getPermission());
		} else {
			flag = false;
		}
		
		if (session.get("loginedUser") != null) {
			User dbUser = userService.query(((User)session.get("loginedUser")).getNumber());
			notice.setAuthor(dbUser);
		} else {
			flag = false;
		}
		notice.setDate(new Date());
		notice.setClicks(0);
		
		if (appendFile!=null && appendFileFileName!=null) {
			String guid = TokenHelper.generateGUID();
			String iconFiles = "../appendFiles/" + guid.charAt(0);
			//指定文件存放目录 
			String path = ServletActionContext.getServletContext().getRealPath(iconFiles);
			File file = new File(path);
			if (!file.exists()) {
				file.mkdirs();
			}
			appendFile.renameTo(new File(file, guid+"_"+appendFileFileName));  //剪切临时文件到指定目录
			path = iconFiles + "/" + guid + "_" + appendFileFileName;
			notice.setFilePath(path);
		}
		
		if (flag) {
			try {
				noticeService.add(notice);
				request.setAttribute("addResult", true);
				return SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
				return "fail";
			}
		} else {
			return "fail";
		}
	}
	
	public String remove() {
		Notice dbNotice = null;
		try {
			dbNotice = noticeService.queryById(notice.getId());
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
		if (dbNotice != null) {
			try {
				noticeService.remove(dbNotice);
				request.setAttribute("removeResult", true);
				return SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
				return "fail";
			}
		} else {
			return "fail";
		}
	}
	
	public String getFile() throws IOException {
		String filePath = null;
		if (notice.getId() != null) {
			filePath = noticeService.queryById(notice.getId()).getFilePath();
		} else {
			return NONE;
		}
		//1.给输入流赋值
        String realPath = ServletActionContext.getServletContext().getRealPath(filePath);
        inputStream = new FileInputStream(realPath);

        //截取path中的文件名
        String realFileName = FilenameUtils.getName(realPath);
        fileName = realFileName.substring(realFileName.indexOf('_')+1);
        //有中文时需要进行编码
        fileName = URLEncoder.encode(fileName, "utf-8");
        //2.返回SUCCESS
        return SUCCESS;
        //3.交给stream结果类型处理
	}
	
}
