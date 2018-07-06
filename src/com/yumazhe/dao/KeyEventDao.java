package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.KeyEvent;

public interface KeyEventDao {
	public void add(KeyEvent keyEvent);
	
	public void remove(KeyEvent keyEvent);
	
	public void update(KeyEvent keyEvent);
	
	public KeyEvent queryById(int id);
	
	public List<KeyEvent> queryAll();
}
