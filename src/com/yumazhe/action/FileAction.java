package com.yumazhe.action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.TokenHelper;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yumazhe.pojo.File;
import com.yumazhe.pojo.User;
import com.yumazhe.service.FileService;
import com.yumazhe.service.UserService;

public class FileAction extends ActionSupport implements ModelDriven<File> {
	private static final long serialVersionUID = -2851973590590612543L;
	private File file = new File();
	
	private FileService fileService;
	private UserService userService;
	
	private java.io.File upload;
	private String uploadFileName;
	private String uploadContentType;
	
	private HttpServletRequest request;
	private Map<String, Object> session;
	
	private int page = 0;
	private int size = 10;
	
	public InputStream inputStream; 
    public String fileName;
	
	public FileAction() {
		request = ServletActionContext.getRequest();
		session = ActionContext.getContext().getSession();
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public File getModel() {
		return file;
	}
	
	public void setFileService(FileService fileService) {
		this.fileService = fileService;
	}

	public java.io.File getUpload() {
		return upload;
	}

	public void setUpload(java.io.File upload) {
		this.upload = upload;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String add() {
		boolean flag = true;
		if (file.getType() == null) {
			flag = false;
		}
		if (uploadFileName==null || upload==null) {
			flag = false;
		} else {
			String guid = TokenHelper.generateGUID();
			String files = "../files/" + guid.charAt(0);
			//指定文件存放目录 
			String path = ServletActionContext.getServletContext().getRealPath(files);
			java.io.File file1 = new java.io.File(path);
			if (!file1.exists()) {
				file1.mkdirs();
			}
			upload.renameTo(new java.io.File(file1, guid+"_"+uploadFileName));  //剪切临时文件到指定目录
			path = files + "/" + guid + "_" + uploadFileName;
			file.setFilePath(path);
		}
		
		if (session.get("loginedUser") != null) {
			User dbUser = userService.query(((User)session.get("loginedUser")).getNumber());
			file.setAuthor(dbUser);
		} else {
			flag = false;
		}
		file.setDate(new Date());
		file.setDowloadNumber(0);
		
		if (flag) {
			try {
				fileService.add(file);
				request.setAttribute("addResult", true);
				file.setType(null);
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
		try {
			File dbFile = fileService.queryById(file.getId());
			fileService.remove(dbFile);
			request.setAttribute("removeResult", true);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
	}
	
	public String queryByPage() {
		//解决Action转发而产生的问题
		if (ActionContext.getContext().getActionInvocation().getProxy().getActionName().equals("queryByPageFile")) {
			file.setType(null);
		}
		
		
		List<File> fileList = fileService.queryByPage(page, size, file);
		if (fileList != null) {
			request.setAttribute("fileList", fileList);
			request.setAttribute("currPage", page+1);
			if (file.getType() == null) {
				request.setAttribute("countNumber", fileService.getCount());
			} else {
				request.setAttribute("countNumber", fileService.getCountByType(file));
			}
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String download() throws FileNotFoundException, UnsupportedEncodingException {
		String filePath = null;
		if (file.getId() != null) {
			filePath = fileService.queryById(file.getId()).getFilePath();
		} else {
			return NONE;
		}
		
		//增加点击量
		if (file.getDowloadNumber() == null) {
			file.setDowloadNumber(0);
		}
		file.setDowloadNumber(file.getDowloadNumber()+1);
		try {
			fileService.modify(file);
		} catch (Exception e) {
			e.printStackTrace();
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
