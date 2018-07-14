package com.yumazhe.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.TokenHelper;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yumazhe.pojo.AssociationInfo;
import com.yumazhe.pojo.KeyEvent;
import com.yumazhe.pojo.User;
import com.yumazhe.service.KeyEventService;
import com.yumazhe.service.UserService;

public class KeyEventAction extends ActionSupport implements ModelDriven<KeyEvent> {

	private static final long serialVersionUID = -1329125150881898149L;
	private KeyEvent keyEvent = new KeyEvent();
	private KeyEventService keyEventService;
	private UserService userService;
	
	private java.io.File upload;
	private String uploadFileName;
	private String uploadContentType;
	
	private HttpServletRequest request;
	private Map<String, Object> session;
	
	public KeyEventAction()  {
		request = ServletActionContext.getRequest();
		session = ActionContext.getContext().getSession();
	}
	
	@Override
	public KeyEvent getModel() {
		return keyEvent;
	}

	public void setKeyEventService(KeyEventService keyEventService) {
		this.keyEventService = keyEventService;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public void setUpload(java.io.File upload) {
		this.upload = upload;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String add() {
		boolean flag = true;
		if (keyEvent.getContent()!=null && !keyEvent.getContent().trim().equals("")) {
			keyEvent.setContent(keyEvent.getContent().trim());
		} else {
			flag = false;
		}
		if (keyEvent.getHappenedDate() == null) {
			flag = false;
		}
		if (keyEvent.getTitle()!=null && !keyEvent.getTitle().trim().equals("")) {
			keyEvent.setTitle(keyEvent.getTitle().trim());
		} else {
			flag = false;
		}
		
		if (session.get("loginedUser") != null) {
			User dbUser = userService.query(((User)session.get("loginedUser")).getNumber());
			keyEvent.setAuthor(dbUser);
		} else {
			flag = false;
		}
		if (uploadFileName==null || upload==null) {

		} else {
			String guid = TokenHelper.generateGUID();
			String files = "../keyEventPhotos/" + guid.charAt(0);
			//指定文件存放目录 
			String path = ServletActionContext.getServletContext().getRealPath(files);
			java.io.File file1 = new java.io.File(path);
			if (!file1.exists()) {
				file1.mkdirs();
			}
			upload.renameTo(new java.io.File(file1, guid+"_"+uploadFileName));  //剪切临时文件到指定目录
			path = files + "/" + guid + "_" + uploadFileName;
			keyEvent.setPhotoPath(path);
		}
		
		if (flag) {
			try {
				keyEventService.add(keyEvent);
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
		boolean flag = true;
		KeyEvent dbKeyEvent = null;
		if (keyEvent.getId() != null) {
			dbKeyEvent = keyEventService.queryById(keyEvent.getId());
		} else {
			flag = false;
		}
		
		if (dbKeyEvent != null) {
			try {
				keyEventService.remove(dbKeyEvent);
			} catch (Exception e) {
				e.printStackTrace();
				flag = false;
			}
		} else {
			flag = false;
		}
		
		if (flag) {
			request.setAttribute("removeResult", true);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String queryAll() {
		List<KeyEvent> keyEventList = null;
		try {
			keyEventList = keyEventService.queryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (keyEventList != null) {
			try {
				session.put("keyEventList", keyEventList);
				return SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
				return "fail";
			}
		} else {
			return "fail";
		}
	}
	
	public String getEventPhoto() throws IOException {
		String photoPath = null;
		if (keyEvent.getId() != null) {
			KeyEvent dbAssociationInfo = keyEventService.queryById(keyEvent.getId());
			photoPath = dbAssociationInfo.getPhotoPath();
		} 
		String path = ServletActionContext.getServletContext().getRealPath(photoPath);
		File photoFile = new File(path);
		FileInputStream fis = new FileInputStream(photoFile);
		ServletOutputStream sos = ServletActionContext.getResponse().getOutputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		while ((len=fis.read(buffer)) != -1) {
			sos.write(buffer, 0, len);
		}
		sos.flush();
		fis.close();
		return NONE;
	}
}
