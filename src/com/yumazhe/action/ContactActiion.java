package com.yumazhe.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.yumazhe.pojo.Contact;
import com.yumazhe.service.ContactService;

public class ContactActiion extends ActionSupport implements ModelDriven<Contact> {

	private static final long serialVersionUID = 2075227898648275050L;
	private Contact contact = new Contact();
	private ContactService contactService;
	
	private HttpServletRequest request;
	private Map<String, Object> session;
	
	public ContactActiion() {
		request = ServletActionContext.getRequest();
		session = ActionContext.getContext().getSession();
	}
	
	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}
	
	@Override
	public Contact getModel() {
		return contact;
	}

	public String add() {
		boolean flag = true;
		if (contact.getName()!=null && !contact.getName().trim().equals("")) {
			contact.setName(contact.getName().trim());
		} else {
			flag = false;
		}
		if (contact.getContext()!=null && !contact.getContext().trim().equals("")) {
			contact.setContext(contact.getContext().trim());
		} else {
			flag = false;
		}
		
		if (flag) {
			try {
				contactService.add(contact);
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
		boolean flag = true;
		
		Contact dbContact = null;
		if (contact.getId() != null) {
			dbContact = contactService.queryById(contact.getId());
		} else {
			flag = false;
		}
		
		if (dbContact != null) {
			try {
				contactService.remove(dbContact);
			} catch (Exception e) {
				e.printStackTrace();
				flag = false;
			}
		} else {
			flag = false;
		}
		
		if (flag) {
			request.setAttribute("removeResult", true);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
	
	public String modify() {
		boolean flag = true;
		if(contact.getId() == null) {
			flag = true;
		}
		if (contact.getName()!=null && !contact.getName().trim().equals("")) {
			contact.setName(contact.getName().trim());
		} else {
			flag = false;
		}
		if (contact.getContext()!=null && !contact.getContext().trim().equals("")) {
			contact.setContext(contact.getContext().trim());
		} else {
			flag = false;
		}
		
		if (flag) {
			try {
				contactService.modify(contact);
				request.setAttribute("modifyResult", true);
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
		List<Contact> contactList = null;
		try {
			contactList = contactService.queryAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (contactList != null) {
			request.setAttribute("contactList", contactList);
			return SUCCESS;
		} else {
			return "fail";
		}
	}
}
