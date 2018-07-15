package com.yumazhe.intercepter;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.yumazhe.pojo.Permission;
import com.yumazhe.pojo.User;

/**
 * @author �Թ���
 *		��¼������
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
    			//�û�����
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
    				//�ʽ����
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
    				//�������
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
    				//�ļ�����
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
    				//����
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
	    		//�û�ģ��
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
	    		case "redirectBackstage":
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

