package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.Contact;

public interface ContactService {
	public void add(Contact contact);

	public void remove(Contact contact);

	public void modify(Contact contact);
	
	public Contact queryById(int id);
	
	public List<Contact> queryAll();
}
