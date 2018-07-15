package com.yumazhe.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.yumazhe.pojo.User;

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
}
