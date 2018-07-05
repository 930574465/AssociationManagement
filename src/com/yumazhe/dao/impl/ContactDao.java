package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.pojo.Contact;

public class ContactDao extends HibernateDaoSupport implements com.yumazhe.dao.ContactDao {

	@Override
	public boolean add(Contact contact) {
		try {
			super.getSession().save(contact);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean remove(Contact contact) {
		try {
			super.getSession().delete(contact);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean update(Contact contact) {
		try {
			super.getSession().update(contact);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public Contact queryById(int id) {
		Contact contact = null;
		try {
			contact = (Contact) super.getSession().get(Contact.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return contact;
	}

	@Override
	public List<Contact> queryAll() {
		List<Contact> contacts = null;
		try {
			Query query = super.getSession().createQuery("from Contact");
			contacts = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return contacts;
	}
}
