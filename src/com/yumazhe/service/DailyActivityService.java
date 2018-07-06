package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.DailyActivity;

public interface DailyActivityService {
	public void add(DailyActivity dailyActivity);

	public void remove(DailyActivity dailyActivity);

	public void modify(DailyActivity dailyActivity);
	
	public DailyActivity queryById(int id);
	
	public List<DailyActivity> queryAll();
}
