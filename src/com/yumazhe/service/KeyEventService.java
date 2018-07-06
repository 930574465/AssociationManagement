package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.KeyEvent;

public interface KeyEventService {
	public void add(KeyEvent keyEvent);

	public void remove(KeyEvent keyEvent);

	public void modify(KeyEvent keyEvent);
	
	public KeyEvent queryById(int id);
	
	public List<KeyEvent> queryAll();
}
