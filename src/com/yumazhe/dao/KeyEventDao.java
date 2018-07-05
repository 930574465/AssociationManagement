package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.KeyEvent;

public interface KeyEventDao {
	public boolean add(KeyEvent keyEvent);
	
	public boolean remove(KeyEvent keyEvent);
	
	public boolean update(KeyEvent keyEvent);
	
	public KeyEvent queryById(int id);
	
	public List<KeyEvent> queryAll();
}
