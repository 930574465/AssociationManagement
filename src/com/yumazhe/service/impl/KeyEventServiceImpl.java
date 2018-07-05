package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.KeyEventDao;
import com.yumazhe.pojo.KeyEvent;
import com.yumazhe.service.KeyEventService;

public class KeyEventServiceImpl implements KeyEventService {
	
	private KeyEventDao keyEventDao;
	
	public void setKeyEventDao(KeyEventDao keyEventDao) {
		this.keyEventDao = keyEventDao;
	}

	@Override
	public boolean add(KeyEvent keyEvent) {
		return false;
	}

	@Override
	public boolean remove(KeyEvent keyEvent) {
		return false;
	}

	@Override
	public boolean modify(KeyEvent keyEvent) {
		return false;
	}

	@Override
	public KeyEvent queryById(int id) {
		return null;
	}

	@Override
	public List<KeyEvent> queryAll() {
		return null;
	}
}
