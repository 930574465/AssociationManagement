package com.yumazhe.action;

import java.io.File;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.TokenHelper;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yumazhe.pojo.User;
import com.yumazhe.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private static final long serialVersionUID = -4579213431058754417L;
	
	private File icon;
	private String iconFileName;
	private String iconContentType;
	
	private User user = new User();
	private UserService userService;
	private Map<String, Object> session;
	
	public UserAction() {
		session = ActionContext.getContext().getSession();
	}

	public void setIcon(File icon) {
		this.icon = icon;
	}

	public void setIconFileName(String iconFileName) {
		this.iconFileName = iconFileName;
	}

	public void setIconContentType(String iconContentType) {
		this.iconContentType = iconContentType;
	}
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public User getModel() {
		return user;
	}
	
	public String login() {
		if (user.getNumber()!=null && user.getPassword()!=null && !user.getNumber().trim().equals("") && !user.getPassword().trim().equals("")) {
			user.setNumber(user.getNumber().trim());
			user.setPassword(user.getPassword().trim());
			
			User loginedUser = null;
			try {
				loginedUser = userService.login(user);
			} catch (Exception e) {
				e.printStackTrace();
				return "fail";
			}
			
			if (loginedUser != null) {
				session.put("loginedUser", loginedUser);
			} else {
				return "fail";
			}
		} else {
			return "fail";
		}
		return SUCCESS;
	}
	
	public String logout() {
		if (session.get("loginedUser") != null) {
			session.remove("loginedUser");
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String register() {
		boolean flag = true;
		if (user.getClasses()!=null && !user.getClasses().trim().equals("")) {
			user.setClasses(user.getClasses().trim());
		} else {
			flag = false;
		}
		if (user.getContactWay()!=null && !user.getContactWay().trim().equals("")) {
			user.setContactWay(user.getContactWay().trim());
		} else {
			flag = false;
		}
		if (user.getName()!=null && !user.getName().trim().equals("")) {
			user.setName(user.getName().trim());
		} else {
			flag = false;
		}
		if (user.getNumber()!=null && !user.getNumber().trim().equals("")) {
			user.setNumber(user.getNumber().trim());
		} else {
			flag = false;
		}
		if (user.getPassword()!=null && !user.getPassword().trim().equals("")) {
			user.setPassword(user.getPassword().trim());
		} else {
			flag = false;
		}
		if (icon!=null || iconFileName==null) {
			String guid = TokenHelper.generateGUID();
			String iconFiles = "iconFiles/" + guid.charAt(0);
			//指定文件存放目录 
			String path = ServletActionContext.getServletContext().getRealPath(iconFiles);
			File file = new File(path);
			if (!file.exists()) {
				file.mkdirs();
			}
			icon.renameTo(new File(file, guid+"_"+iconFileName));  //剪切临时文件到指定目录
			path = "iconFiles" + "/" + guid + "_" + iconFileName;
			user.setPhotoPath(path);
		} else {
			flag = false;
		}
		
		if (flag) {
			try {
				userService.register(user);
			} catch (Exception e) {
				e.printStackTrace();
				flag = false;
			}
			return SUCCESS;
		} else {
			return "fail";
		}
	}
}
