package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.KeyEvent;

public interface KeyEventService {
	public boolean add(KeyEvent keyEvent);

	public boolean remove(KeyEvent keyEvent);

	public boolean modify(KeyEvent keyEvent);
	
	public KeyEvent queryById(int id);
	
	public List<KeyEvent> queryAll();
}
