package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.DailyActivity;

public interface DailyActivityDao {
	public boolean add(DailyActivity dailyActivity);
	
	public boolean remove(DailyActivity dailyActivity);
	
	public boolean update(DailyActivity dailyActivity);
	
	public DailyActivity queryById(int id);
	
	public List<DailyActivity> queryAll();
}
