package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.Contact;

public interface ContactDao {
	public boolean add(Contact contact);
	
	public boolean remove(Contact contact);
	
	public boolean update(Contact contact);
	
	public Contact queryById(int id);
	
	public List<Contact> queryAll();
}
