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
import com.yumazhe.pojo.User;
import com.yumazhe.service.AssociationInfoService;

public class AssociationInfoAction extends ActionSupport implements ModelDriven<AssociationInfo> {
	
	private static final long serialVersionUID = -3954090341262234769L;
	private AssociationInfo associationInfo = new AssociationInfo();
	private AssociationInfoService associationInfoService;
	
	private java.io.File upload;
	private String uploadFileName;
	private String uploadContentType;
	
	private HttpServletRequest request;
	private Map<String, Object> session;
	
	public AssociationInfoAction()  {
		request = ServletActionContext.getRequest();
		session = ActionContext.getContext().getSession();
	}

	public void setAssociationInfoService(AssociationInfoService associationInfoService) {
		this.associationInfoService = associationInfoService;
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

	@Override
	public AssociationInfo getModel() {
		return associationInfo;
	}

	public String add() {
		boolean flag = true;
		if (associationInfo.getName()!=null && !associationInfo.getName().trim().equals("")) {
			associationInfo.setName(associationInfo.getName().trim());
		} else {
			flag = false;
		}
		if (uploadFileName==null || upload==null) {
			flag = false;
		} else {
			String guid = TokenHelper.generateGUID();
			String files = "../associationInfoFiles/" + guid.charAt(0);
			//指定文件存放目录 
			String path = ServletActionContext.getServletContext().getRealPath(files);
			java.io.File file1 = new java.io.File(path);
			if (!file1.exists()) {
				file1.mkdirs();
			}
			upload.renameTo(new java.io.File(file1, guid+"_"+uploadFileName));  //剪切临时文件到指定目录
			path = files + "/" + guid + "_" + uploadFileName;
			associationInfo.setPhotoPath(path);
		}
		
		if (flag) {
			try {
				associationInfoService.add(associationInfo);
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
		AssociationInfo dbAssociationInfo = null;
		try {
			dbAssociationInfo = associationInfoService.queryById(associationInfo.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (dbAssociationInfo != null) {
			try {
				associationInfoService.remove(dbAssociationInfo);
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
	
	public String modify() {
		boolean flag = true;
		if (associationInfo.getId() == null) {
			flag = false;
		}
		if (associationInfo.getName()!=null && !associationInfo.getName().trim().equals("")) {
			associationInfo.setName(associationInfo.getName().trim());
		} else {
			flag = false;
		}
		if (uploadFileName==null || upload==null) {
			
		} else {
			String guid = TokenHelper.generateGUID();
			String files = "../associationInfoFiles/" + guid.charAt(0);
			//指定文件存放目录 
			String path = ServletActionContext.getServletContext().getRealPath(files);
			java.io.File file1 = new java.io.File(path);
			if (!file1.exists()) {
				file1.mkdirs();
			}
			upload.renameTo(new java.io.File(file1, guid+"_"+uploadFileName));  //剪切临时文件到指定目录
			path = files + "/" + guid + "_" + uploadFileName;
			associationInfo.setPhotoPath(path);
		}
		
		if (flag) {
			try {
				associationInfoService.modify(associationInfo);
				request.setAttribute("modifyResult", true);
				return SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
				return "fail";
			}
		} else {
			return "fail";
		}
	}
	
	public String queryAll() {
		List<AssociationInfo> associationInfoList = null;
		try {
			associationInfoList = associationInfoService.queryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (associationInfoList != null) {
			session.put("associationInfoList", associationInfoList);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String queryById() {
		if (queryAll().equals("fail")) {
			return "fail";
		}
		
		AssociationInfo dbAssociationInfo = null;
		try {
			dbAssociationInfo = associationInfoService.queryById(associationInfo.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (dbAssociationInfo != null) {
			session.put("associationInfo", dbAssociationInfo);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String getInfoPhoto() throws IOException {
		String photoPath = null;
		if (associationInfo.getId() != null) {
			AssociationInfo dbAssociationInfo = associationInfoService.queryById(associationInfo.getId());
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
