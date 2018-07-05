package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.KeyEventDao;
import com.yumazhe.pojo.KeyEvent;

public class KeyEventDaoImpl extends HibernateDaoSupport implements KeyEventDao {

	@Override
	public boolean add(KeyEvent keyEvent) {
		try {
			super.getSession().save(keyEvent);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean remove(KeyEvent keyEvent) {
		try {
			super.getSession().delete(keyEvent);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean update(KeyEvent keyEvent) {
		try {
			super.getSession().update(keyEvent);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public KeyEvent queryById(int id) {
		KeyEvent keyEvent = null;
		try {
			keyEvent = (KeyEvent) super.getSession().get(KeyEvent.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return keyEvent;
	}

	@Override
	public List<KeyEvent> queryAll() {
		List<KeyEvent> keyEvents = null;
		try {
			Query query = super.getSession().createQuery("from KeyEvent order by date desc");
			keyEvents = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return keyEvents;
	}
}
