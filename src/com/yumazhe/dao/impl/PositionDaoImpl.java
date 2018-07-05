package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.PositionDao;
import com.yumazhe.pojo.Position;

public class PositionDaoImpl extends HibernateDaoSupport implements PositionDao {

	@Override
	public boolean add(Position position) {
		try {
			super.getSession().save(position);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean remove(Position position) {
		try {
			super.getSession().delete(position);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean update(Position position) {
		try {
			super.getSession().update(position);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public Position queryById(int id) {
		Position position = null;
		try {
			position = (Position) super.getSession().get(Position.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return position;
	}

	@Override
	public List<Position> queryAll() {
		List<Position> positions = null;
		try {
			Query query = super.getSession().createQuery("from Position");
			positions = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return positions;
	}

}
