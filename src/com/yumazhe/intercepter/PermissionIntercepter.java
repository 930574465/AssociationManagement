package com.yumazhe.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.yumazhe.pojo.Permission;
import com.yumazhe.pojo.User;

/**
 * @author 赵国庆
 *		登录拦截器
 */
public class PermissionIntercepter extends MethodFilterInterceptor{
	
	private static final long serialVersionUID = 8175529986176755824L;

	@Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		String ret = null;

        User user = (User) ActionContext.getContext().getSession().get("loginedUser");
        if (user != null) {
        	boolean flag = false;
        	String actionName = invocation.getProxy().getActionName();
    		for (Permission permission: user.getPermissions()) {
    			//用户管理
    			if (permission.getId() == 1) {
    				switch (actionName) {
    					case "registerUser":
	            			flag = true;
	            			break;
	            		case "addUser":
	            			flag = true;
	            			break;
	            		case "nullifyUser":
	            			flag = true;
	            			break;
	            		case "loginUser":
	            			flag = true;
	            			break;
	            		case "logoutUser":
	            			flag = true;
	            			break;
	            		case "modifyUser":
	            			flag = true;
	            			break;
	            		case "modifyUser2":
	            			flag = true;
	            			break;
	            		case "queryByPageUser":
	            			flag = true;
	            			break;
	            		case "queryByNumberUser":
	            			flag = true;
	            			break;
	            		case "acceptUser":
	            			flag = true;
	            			break;
	            		case "tranfer":
	            			flag = true;
	            			break;
	            		case "getIconUser":
	            			flag = true;
	            			break;
    				}
    			} else if (permission.getId() == 2) {
    				//资金管理
    				switch (actionName) {
	            		case "queryByPageMoney":
	            			flag = true;
	            			break;
	            		case "addincomeOrPayout":
	            			flag = true;
	            			break;
	            		case "removeincomeOrPayout":
	            			flag = true;
	            			break;
    				}
    			} else if (permission.getId() == 3) {
    				//公告管理
    				switch (actionName) {
	            		case "queryByPageNotice":
	            			flag = true;
	            			break;
	            		case "addNotice":
	            			flag = true;
	            			break;
	            		case "removeNotice":
	            			flag = true;
	            			break;
	            		case "queryByPageNotice2":
	            			flag = true;
	            			break;
	            		case "queryByIdNotice":
	            			flag = true;
	            			break;
	            		case "getFileNotice":
	            			flag = true;
	            			break;
    				}
    			} else if (permission.getId() == 4) {
    				//文件管理
    				switch (actionName) {
	            		case "addFile":
	            			flag = true;
	            			break;
	            		case "removeFile":
	            			flag = true;
	            			break;
	            		case "queryByPageFile":
	            			flag = true;
	            			break;
	            		case "queryByPageAndTypeFile":
	            			flag = true;
	            			break;
	            		case "downloadFile":
	            			flag = true;
	            			break;
    				}
    			} else if (permission.getId() == 5) {
    				//其他
    				switch (actionName) {
	            		case "queryAllDailyActivity":
	            			flag = true;
	            			break;
	            		case "addDailyActivity":
	            			flag = true;
	            			break;
	            		case "removeDailyActivity":
	            			flag = true;
	            			break;
	            		case "queryDailyActivity":
	            			flag = true;
	            		case "addAssociationInfo":
	            			flag = true;
	            			break;
	            		case "removeAssociationInfo":
	            			flag = true;
	            			break;
	            		case "modifyAssociationInfo":
	            			flag = true;
	            			break;
	            		case "queryAllAssociationInfo":
	            			flag = true;
	            			break;
	            		case "queryByIdAssociationInfo":
	            			flag = true;
	            			break;
	            		case "getInfoPhoto":
	            			flag = true;
	            			break;
	            		case "addContactActiion":
	            			flag = true;
	            			break;
	            		case "removeContactActiion":
	            			flag = true;
	            			break;
	            		case "modifyContactActiion":
	            			flag = true;
	            			break;
	            		case "queryAllContactActiion":
	            			flag = true;
	            			break;
	            		case "queryAllContactActiion2":
	            			flag = true;
	            			break;
	            		case "addKeyEventAction":
	            			flag = true;
	            			break;
	            		case "removeKeyEventAction":
	            			flag = true;
	            			break;
	            		case "queryAllKeyEventAction":
	            			flag = true;
	            			break;
	            		case "queryAllKeyEventReceptionAction":
	            			flag = true;
	            			break;
	            		case "getEventPhoto":
	            			flag = true;
	            			break;
    				}
    			}    			
    		}
        	switch (actionName) {
	    		//用户模块
	    		case "registerUser":
	    			flag = true;
	    			break;
	    		case "loginUser":
	    			flag = true;
	    			break;
	    		case "logoutUser":
	    			flag = true;
	    			break;
	    		case "modifyUser":
	    			flag = true;
	    			break;
	    		case "getIconUser":
        			flag = true;
        			break;
	    		//公告管理模块
	    		case "queryByPageNotice2":
	    			flag = true;
	    			break;
	    		case "queryByIdNotice":
	    			flag = true;
	    			break;
	    		case "getFileNotice":
	    			flag = true;
	    			break;
	    		//转向首页
	    		case "redirectHome":
	    			flag = true;
	    			break;
	    		case "redirectBackstage":
	    			flag = true;
	    			break;
	    		//日常活动
	    		case "queryDailyActivity":
	    			flag = true;
	    		//文件管理
	    		case "queryByPageAndTypeFile":
	    			flag = true;
	    			break;
	    		case "downloadFile":
	    			flag = true;
	    			break;
	    		//社团信息
	    		case "queryByIdAssociationInfo":
	    			flag = true;
	    			break;
	    		case "getInfoPhoto":
	    			flag = true;
	    			break;
	    		//联系方式
	    		case "queryAllContactActiion2":
	    			flag = true;
	    			break;
	    		//时间轴
	    		case "queryAllKeyEventReceptionAction":
	    			flag = true;
	    			break;
	    		case "getEventPhoto":
	    			flag = true;
	    			break;
        	}
        	
        	if (flag) {
        		//放行
        		ret = invocation.invoke();
        	} else {
        		ret = "noPermission";
        	}
        } else {
        	boolean flag = false;
        	String actionName = invocation.getProxy().getActionName();

        	ret = invocation.invoke();
        }
        return ret;
    }
}

