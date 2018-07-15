package com.yumazhe.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.yumazhe.pojo.User;

/**
 * @author �Թ���
 *		��¼������
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
        		//�û�ģ��
        		case "registerUser":
        			flag = true;
        			break;
        		case "loginUser":
        			flag = true;
        			break;
        		//�������ģ��
        		case "queryByPageNotice2":
        			flag = true;
        			break;
        		case "queryByIdNotice":
        			flag = true;
        			break;
        		case "getFileNotice":
        			flag = true;
        			break;
        		//ת����ҳ
        		case "redirectHome":
        			flag = true;
        			break;
        		//�ճ��
        		case "queryDailyActivity":
        			flag = true;
        		//�ļ�����
        		case "queryByPageAndTypeFile":
        			flag = true;
        			break;
        		case "downloadFile":
        			flag = true;
        			break;
        		//������Ϣ
        		case "queryByIdAssociationInfo":
        			flag = true;
        			break;
        		case "getInfoPhoto":
        			flag = true;
        			break;
        		//��ϵ��ʽ
        		case "queryAllContactActiion2":
        			flag = true;
        			break;
        		//ʱ����
        		case "queryAllKeyEventReceptionAction":
        			flag = true;
        			break;
        		case "getEventPhoto":
        			flag = true;
        			break;
        	}
        	if (flag) {
        		//����
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

