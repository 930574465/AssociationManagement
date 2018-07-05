package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.Position;

public interface PositionService {
	public boolean add(Position position);

	public boolean remove(Position position);

	public boolean modify(Position position);
	
	public Position queryById(int id);
	
	public List<Position> queryAll();
}
