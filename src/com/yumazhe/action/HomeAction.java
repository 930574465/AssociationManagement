package com.yumazhe.action;

import com.opensymphony.xwork2.ActionSupport;

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
		if (noticeAction.queryByPage().equals("success") && fileAction.queryByPage().equals("success")) {
			return SUCCESS;
		} else {
			return "fail";
		}
	}
}
