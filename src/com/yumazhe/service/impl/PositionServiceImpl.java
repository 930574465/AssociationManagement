package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.PositionDao;
import com.yumazhe.pojo.Position;
import com.yumazhe.service.PositionService;

public class PositionServiceImpl implements PositionService {
	
	private PositionDao positionDao;
	
	public void setPositionDao(PositionDao positionDao) {
		this.positionDao = positionDao;
	}

	@Override
	public void add(Position position) {
		positionDao.add(position);
	}

	@Override
	public void remove(Position position) {
		Position dbPosition = positionDao.queryById(position.getId());
		if (dbPosition != null) {
			positionDao.remove(dbPosition);
		}
	}

	@Override
	public void modify(Position position) {
		Position dbPosition = positionDao.queryById(position.getId());
		if (dbPosition != null) {
			if (position.getName() != null) {
				dbPosition.setName(position.getName());
			}
			if (position.getUsers() != null) {
				dbPosition.setUsers(position.getUsers());
			}
			positionDao.update(dbPosition);
		}
	}

	@Override
	public Position queryById(int id) {
		return positionDao.queryById(id);
	}

	@Override
	public List<Position> queryAll() {
		return positionDao.queryAll();
	}

}
