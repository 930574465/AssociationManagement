package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.Position;

public interface PositionDao{
	public boolean add(Position position);
	
	public boolean remove(Position position);
	
	public boolean update(Position position);
	
	public Position queryById(int id);
	
	public List<Position> queryAll();
}
