package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.Contact;

public interface ContactDao {
	public void add(Contact contact);
	
	public void remove(Contact contact);
	
	public void update(Contact contact);
	
	public Contact queryById(int id);
	
	public List<Contact> queryAll();
}
