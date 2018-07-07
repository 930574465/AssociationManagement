package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.Position;

public interface PositionService {
	public void add(Position position);

	public void remove(Position position);
	
	public Position queryById(int id);
	
	public List<Position> queryAll();
}
