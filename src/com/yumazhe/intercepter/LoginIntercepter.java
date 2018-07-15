package com.yumazhe.intercepter;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.yumazhe.pojo.User;

import net.sf.json.JSONObject;

/**
 * @author ÕÔ¹úÇì
 *		µÇÂ¼À¹½ØÆ÷
 */
public class LoginIntercepter extends MethodFilterInterceptor{
	private static final long serialVersionUID = -6856563351532835548L;

	@Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		String ret = null;
		JSONObject jsonObject = new JSONObject();
        User user = (User) ActionContext.getContext().getSession().get("loginedUser");
        if (user == null) {
        	ret = "notLogin";
        } else {
        	//·ÅÐÐ
            ret = invocation.invoke();
        }
        System.out.println(invocation.getProxy().getActionName());
        return ret;
    }
}

