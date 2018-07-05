package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.ContactDao;
import com.yumazhe.pojo.Contact;
import com.yumazhe.service.ContactService;

public class ContactServiceImpl implements ContactService {
	
	private ContactDao contactDao;
	
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@Override
	public boolean add(Contact contact) {
		return false;
	}

	@Override
	public boolean remove(Contact contact) {
		return false;
	}

	@Override
	public boolean modify(Contact contact) {
		return false;
	}

	@Override
	public Contact queryById(int id) {
		return null;
	}

	@Override
	public List<Contact> queryAll() {
		return null;
	}

}
