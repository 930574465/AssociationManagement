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
	public void add(Contact contact) {
		contactDao.add(contact);
	}

	@Override
	public void remove(Contact contact) {
		Contact dbContact = contactDao.queryById(contact.getId());
		if (dbContact != null) {
			contactDao.remove(dbContact);
		}
	}

	@Override
	public void modify(Contact contact) {
		Contact dbContact = contactDao.queryById(contact.getId());
		if (dbContact != null) {
			if (contact.getContext() != null) {
				dbContact.setContext(contact.getContext());
			}
			if (contact.getName() != null) {
				dbContact.setName(contact.getName());
			}
			contactDao.update(dbContact);
		}
	}

	@Override
	public Contact queryById(int id) {
		return contactDao.queryById(id);
	}

	@Override
	public List<Contact> queryAll() {
		return contactDao.queryAll();
	}

}
