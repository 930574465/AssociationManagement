package com.yumazhe.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.yumazhe.pojo.User;

/**
 * @author 赵国庆
 *		登录拦截器
 */
public class LoginIntercepter extends MethodFilterInterceptor{
	private static final long serialVersionUID = -6856563351532835548L;

	@Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		String ret = null;

        User user = (User) ActionContext.getContext().getSession().get("loginedUser");
        if (user == null) {
        	boolean flag = false;
        	String actionName = invocation.getProxy().getActionName();
        	switch (actionName) {
        		//用户模块
        		case "registerUser":
        			flag = true;
        			break;
        		case "loginUser":
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
        		ret = "notLogin";
        	}
        } else {
        	ret = invocation.invoke();
        }
        return ret;
    }
}

