package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.Contact;

public interface ContactService {
	public boolean add(Contact contact);

	public boolean remove(Contact contact);

	public boolean modify(Contact contact);
	
	public Contact queryById(int id);
	
	public List<Contact> queryAll();
}
