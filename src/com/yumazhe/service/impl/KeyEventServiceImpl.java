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
	public void add(KeyEvent keyEvent) {
		keyEventDao.add(keyEvent);
	}

	@Override
	public void remove(KeyEvent keyEvent) {
		KeyEvent dbKeyEvent = keyEventDao.queryById(keyEvent.getId());
		if (dbKeyEvent != null) {
			keyEventDao.remove(dbKeyEvent);
		}
	}

	@Override
	public void modify(KeyEvent keyEvent) {
		KeyEvent dbKeyEvent = keyEventDao.queryById(keyEvent.getId());
		if (dbKeyEvent != null) {
			if (keyEvent.getAuthor() != null) {
				dbKeyEvent.setAuthor(keyEvent.getAuthor());
			}
			if (keyEvent.getContent() != null) {
				dbKeyEvent.setContent(keyEvent.getContent());
			}
			if (keyEvent.getHappenedDate() != null) {
				dbKeyEvent.setHappenedDate(keyEvent.getHappenedDate());
			}
			if (keyEvent.getPhotoPath() != null) {
				dbKeyEvent.setPhotoPath(keyEvent.getPhotoPath());
			}
			if (keyEvent.getTitle() != null) {
				dbKeyEvent.setTitle(keyEvent.getTitle());
			}
			keyEventDao.update(dbKeyEvent);
		}
	}

	@Override
	public KeyEvent queryById(int id) {
		return keyEventDao.queryById(id);
	}

	@Override
	public List<KeyEvent> queryAll() {
		return keyEventDao.queryAll();
	}
}
