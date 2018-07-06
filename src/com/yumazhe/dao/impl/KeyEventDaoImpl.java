package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.KeyEventDao;
import com.yumazhe.pojo.KeyEvent;

public class KeyEventDaoImpl extends HibernateDaoSupport implements KeyEventDao {

	@Override
	public void add(KeyEvent keyEvent) {
		super.getSession().save(keyEvent);
	}

	@Override
	public void remove(KeyEvent keyEvent) {
		super.getSession().delete(keyEvent);
	}

	@Override
	public void update(KeyEvent keyEvent) {
		super.getSession().update(keyEvent);
	}

	@Override
	public KeyEvent queryById(int id) {
		return (KeyEvent) super.getSession().get(KeyEvent.class, id);
	}

	@Override
	public List<KeyEvent> queryAll() {
		return super.getSession().createQuery("from KeyEvent order by date desc").list();
	}
}
