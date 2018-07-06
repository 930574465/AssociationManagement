package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.PositionDao;
import com.yumazhe.pojo.Position;

public class PositionDaoImpl extends HibernateDaoSupport implements PositionDao {

	@Override
	public void add(Position position) {
		super.getSession().save(position);
	}

	@Override
	public void remove(Position position) {
		super.getSession().delete(position);
	}

	@Override
	public void update(Position position) {
		super.getSession().update(position);
	}

	@Override
	public Position queryById(int id) {
		return (Position) super.getSession().get(Position.class, id);
	}

	@Override
	public List<Position> queryAll() {
		return super.getSession().createQuery("from Position").list();
	}

}
