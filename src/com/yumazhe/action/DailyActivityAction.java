package com.yumazhe.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yumazhe.pojo.DailyActivity;
import com.yumazhe.service.DailyActivityService;

public class DailyActivityAction extends ActionSupport implements ModelDriven<DailyActivity> {
	private static final long serialVersionUID = 9095631122040316402L;
	private DailyActivity dailyActivity = new DailyActivity();
	private DailyActivityService dailyActivityService;
	
	private HttpServletRequest request;
	private Map<String, Object> session;
	
	public DailyActivityAction() {
		request = ServletActionContext.getRequest();
		session = ActionContext.getContext().getSession();
	}

	@Override
	public DailyActivity getModel() {
		return dailyActivity;
	}
	
	public void setDailyActivityService(DailyActivityService dailyActivityService) {
		this.dailyActivityService = dailyActivityService;
	}
	
	public String add() {
		boolean flag = true;
		if (dailyActivity.getContext()!=null && !dailyActivity.getContext().trim().equals("")) {
			dailyActivity.setContext(dailyActivity.getContext().trim());
		} else {
			flag = false;
		}
		if (dailyActivity.getTitle()!=null && !dailyActivity.getTitle().trim().equals("")) {
			dailyActivity.setTitle(dailyActivity.getTitle().trim());
		} else {
			flag = false;
		}
		
		if (flag) {
			try {
				dailyActivityService.add(dailyActivity);
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
		DailyActivity dbDailyActivity = null;
		try {
			dbDailyActivity = dailyActivityService.queryById(dailyActivity.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (dbDailyActivity != null) {
			try {
				dailyActivityService.remove(dbDailyActivity);
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
	
	public String queryAll() {
		try {
			List<DailyActivity> dailyActivityList = dailyActivityService.queryAll();
			session.put("dailyActivityList", dailyActivityList);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
	}
}
