package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.pojo.Contact;

public class ContactDaoImpl extends HibernateDaoSupport implements com.yumazhe.dao.ContactDao {

	@Override
	public void add(Contact contact) {
		super.getSession().save(contact);
	}

	@Override
	public void remove(Contact contact) {
		super.getSession().delete(contact);
	}

	@Override
	public void update(Contact contact) {
		super.getSession().update(contact);
	}

	@Override
	public Contact queryById(int id) {
		return (Contact) super.getSession().get(Contact.class, id);
	}

	@Override
	public List<Contact> queryAll() {
		return super.getSession().createQuery("from Contact").list();
	}
}
