package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.DailyActivityDao;
import com.yumazhe.pojo.DailyActivity;
import com.yumazhe.service.DailyActivityService;

public class DailyActivityServiceImpl implements DailyActivityService {
	
	private DailyActivityDao dailyActivityDao;
	
	public void setDailyActivityDao(DailyActivityDao dailyActivityDao) {
		this.dailyActivityDao = dailyActivityDao;
	}

	@Override
	public boolean add(DailyActivity dailyActivity) {
		return false;
	}

	@Override
	public boolean remove(DailyActivity dailyActivity) {
		return false;
	}

	@Override
	public boolean modify(DailyActivity dailyActivity) {
		return false;
	}

	@Override
	public DailyActivity queryById(int id) {
		return null;
	}

	@Override
	public List<DailyActivity> queryAll() {
		return null;
	}
}
