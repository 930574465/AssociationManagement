package com.yumazhe.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.TokenHelper;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yumazhe.pojo.Permission;
import com.yumazhe.pojo.Position;
import com.yumazhe.pojo.User;
import com.yumazhe.service.PermissionService;
import com.yumazhe.service.PositionService;
import com.yumazhe.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User> {
	private static final long serialVersionUID = -4579213431058754417L;
	
	private File icon;
	private String iconFileName;
	private String iconContentType;
	
	private User user = new User();
	private UserService userService;
	private Map<String, Object> session;
	private HttpServletRequest request;
	
	private PermissionService permissionService;
	private PositionService positionService;
	
	private Integer positionId;
	private String permission;
	
	private int start = 0;
	private int size = 10;
	
	public UserAction() {
		session = ActionContext.getContext().getSession();
		request = ServletActionContext.getRequest();
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
	
	public void setPermissionService(PermissionService permissionService) {
		this.permissionService = permissionService;
	}
	
	public void setPositionService(PositionService positionService) {
		this.positionService = positionService;
	}
	
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	
	public void setPermission(String permission) {
		this.permission = permission;
	}

	@Override
	public User getModel() {
		return user;
	}
	
	public void load() {
		try {
			Map<String, Object> application = ActionContext.getContext().getApplication();
			if (application.get("permissionList") == null) {
				List<Permission> permissionList = permissionService.queryAll();
				application.put("permissionList", permissionList);
			}
			if (application.get("positionList") == null) {
				List<Position> positionList = positionService.queryAll();
				application.put("positionList", positionList);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
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
				request.setAttribute("loginError", true);
				return "fail";
			}
			
			if (loginedUser != null) {
				session.put("loginedUser", loginedUser);
			} else {
				request.setAttribute("loginError", true);
				return "fail";
			}
		} else {
			request.setAttribute("loginError", true);
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
		load();
		
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
		if (icon!=null && iconFileName!=null) {
			String guid = TokenHelper.generateGUID();
			String iconFiles = "../iconFiles/" + guid.charAt(0);
			//指定文件存放目录 
			String path = ServletActionContext.getServletContext().getRealPath(iconFiles);
			File file = new File(path);
			if (!file.exists()) {
				file.mkdirs();
			}
			icon.renameTo(new File(file, guid+"_"+iconFileName));  //剪切临时文件到指定目录
			path = iconFiles + "/" + guid + "_" + iconFileName;
			user.setPhotoPath(path);
		} else {
			flag = false;
		}
		
		if (user.getPayState() == null) {
			user.setPayState("1");
		}
		
		if (positionId != null) {
			user.setPosition(positionService.queryById(positionId));
		}
		if (permission != null) {
			String[] split = permission.split(", ");
			for (int i=0; i<split.length; i++) {
				user.getPermissions().add(permissionService.queryById(Integer.parseInt(split[i])));
			}
		}
		
		if (flag) {
			try {
				userService.register(user);
				request.setAttribute("registerResult", true);
			} catch (Exception e) {
				e.printStackTrace();
				request.setAttribute("registerResult", false);
				return "fail";
			}
			if (positionId!=null || permission!=null) {
				return "addSuccess";
			} else {
				return "registerSuccess";
			}
		} else {
			request.setAttribute("registerResult", false);
			return "fail";
		}
	}
	
	public String nullify() {
		load();
		try {
			User dbUser = userService.query(user.getNumber());
			userService.nullify(dbUser);
			request.setAttribute("nullifyResult", true);
			return SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
			return "fail";
		}
	}
	
	public String modify() {
		load();
		User dbUser = userService.query(user.getNumber());
		if (dbUser != null) {
			if (user.getClasses()!=null && !user.getClasses().trim().equals("")) {
				user.setClasses(user.getClasses().trim());
			}
			if (user.getContactWay()!=null && !user.getContactWay().trim().equals("")) {
				user.setContactWay(user.getContactWay().trim());
			}
			if (user.getName()!=null && !user.getName().trim().equals("")) {
				user.setName(user.getName().trim());
			}
			if (user.getNumber()!=null && !user.getNumber().trim().equals("")) {
				user.setNumber(user.getNumber().trim());
			} 
			if (user.getPassword()!=null && !user.getPassword().trim().equals("")) {
				user.setPassword(user.getPassword().trim());
			} 
			if (icon!=null && iconFileName!=null) {
				String guid = TokenHelper.generateGUID();
				String iconFiles = "../iconFiles/" + guid.charAt(0);
				//指定文件存放目录 
				String path = ServletActionContext.getServletContext().getRealPath(iconFiles);
				File file = new File(path);
				if (!file.exists()) {
					file.mkdirs();
				}
				icon.renameTo(new File(file, guid+"_"+iconFileName));  //剪切临时文件到指定目录
				path = iconFiles + "/" + guid + "_" + iconFileName;
				user.setPhotoPath(path);
			} 
			
			if (positionId != null) {
				user.setPosition(positionService.queryById(positionId));
			}
			if (permission != null) {
				String[] split = permission.split(", ");
				for (int i=0; i<split.length; i++) {
					user.getPermissions().add(permissionService.queryById(Integer.parseInt(split[i])));
				}
			}
			
			try {
				userService.modify(user);
				if (session.get("loginedUser") != null) {
					request.setAttribute("modifyResult", true);
					return SUCCESS;
				} else {
					return "fail";
				}
			} catch (Exception e) {
				e.printStackTrace();
				return "fail";
			}
		} else {
			return "fail";
		}
	}
	
	public String queryByPage() {
		load();
		List<User> userList = userService.queryByPage(start, size);
		if (userList!=null) {
			session.put("userList", userList);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String queryByNumber() {
		User dbUser = null;
		if (user.getNumber() != null) {
			dbUser = userService.query(user.getNumber());
		} else {
			dbUser = (User) session.get("loginedUser");
		}
		if (dbUser != null) {
			request.setAttribute("queryUser", dbUser);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String accept() {
		load();
		if (user.getNumber() != null) {
			try {
				userService.accept(user);
				request.setAttribute("acceptResult", true);
				return SUCCESS;
			} catch (Exception e) {
				e.printStackTrace();
				return "fail";
			}
		} else {
			return "fail";
		}
	}
	
	public String getIcon() throws IOException {
		String photoPath = null;
		if (user.getNumber() == null) {
			User loginedUser = (User) session.get("loginedUser");
			photoPath = loginedUser.getPhotoPath();
		} else {
			User dbUser = userService.query(user.getNumber());
			photoPath = dbUser.getPhotoPath();
		}
		String path = ServletActionContext.getServletContext().getRealPath(photoPath);
		File iconFile = new File(path);
		FileInputStream fis = new FileInputStream(iconFile);
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
