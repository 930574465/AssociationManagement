package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.DailyActivity;

public interface DailyActivityService {
	public boolean add(DailyActivity dailyActivity);

	public boolean remove(DailyActivity dailyActivity);

	public boolean modify(DailyActivity dailyActivity);
	
	public DailyActivity queryById(int id);
	
	public List<DailyActivity> queryAll();
}
