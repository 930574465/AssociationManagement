package com.yumazhe.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yumazhe.pojo.Permission;
import com.yumazhe.pojo.User;
import com.yumazhe.service.PermissionService;

public class HomeAction extends ActionSupport {

	private static final long serialVersionUID = -6780491594196850294L;
	private NoticeAction noticeAction;
	private FileAction fileAction;
	
	public void setNoticeAction(NoticeAction noticeAction) {
		this.noticeAction = noticeAction;
	}
	
	public void setFileAction(FileAction fileAction) {
		this.fileAction = fileAction;
	}
	
	public String execute() {
		return SUCCESS;
	}
	
	public String queryNoticeAndFile() {
		User user = (User) ActionContext.getContext().getSession().get("loginedUser");
		if (user != null) {
			
		} else {
			noticeAction.getModel().setPermission("0");
		}
		
		if (noticeAction.queryByPage().equals("success") && fileAction.queryByPage().equals("success")) {
			return SUCCESS;
		} else if (noticeAction.queryByPage().equals("notLogin")) {
			return "notLogin";
		}
		else {
			return "fail";
		}
	}
	
	public String queryPermissions() {
		try {
			User user = (User) ActionContext.getContext().getSession().get("loginedUser");
			ServletActionContext.getRequest().setAttribute("permissionSet", user.getPermissions());
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
	}
}
