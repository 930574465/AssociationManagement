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
	public boolean add(Position position) {
		return false;
	}

	@Override
	public boolean remove(Position position) {
		return false;
	}

	@Override
	public boolean modify(Position position) {
		return false;
	}

	@Override
	public Position queryById(int id) {
		return null;
	}

	@Override
	public List<Position> queryAll() {
		return null;
	}

}
