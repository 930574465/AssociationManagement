package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.DailyActivity;

public interface DailyActivityDao {
	public void add(DailyActivity dailyActivity);
	
	public void remove(DailyActivity dailyActivity);
	
	public void update(DailyActivity dailyActivity);
	
	public DailyActivity queryById(int id);
	
	public List<DailyActivity> queryAll();
}
