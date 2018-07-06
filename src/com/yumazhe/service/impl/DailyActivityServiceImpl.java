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
	public void add(DailyActivity dailyActivity) {
		dailyActivityDao.add(dailyActivity);
	}

	@Override
	public void remove(DailyActivity dailyActivity) {
		DailyActivity dbDailyActivity = dailyActivityDao.queryById(dailyActivity.getId());
		if (dbDailyActivity != null) {
			dailyActivityDao.remove(dbDailyActivity);
		}
	}

	@Override
	public void modify(DailyActivity dailyActivity) {
		DailyActivity dbDailyActivity = dailyActivityDao.queryById(dailyActivity.getId());
		if (dbDailyActivity != null) {
			if (dailyActivity.getContext() != null) {
				dbDailyActivity.setContext(dailyActivity.getContext());
			}
			if (dailyActivity.getTitle() != null) {
				dbDailyActivity.setTitle(dailyActivity.getTitle());
			}
			dailyActivityDao.update(dbDailyActivity);
		}
	}

	@Override
	public DailyActivity queryById(int id) {
		return dailyActivityDao.queryById(id);
	}

	@Override
	public List<DailyActivity> queryAll() {
		return dailyActivityDao.queryAll();
	}
}
