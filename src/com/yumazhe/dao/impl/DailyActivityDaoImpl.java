package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.DailyActivityDao;
import com.yumazhe.pojo.DailyActivity;

public class DailyActivityDaoImpl extends HibernateDaoSupport implements DailyActivityDao {

	@Override
	public boolean add(DailyActivity dailyActivity) {
		try {
			super.getSession().save(dailyActivity);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean remove(DailyActivity dailyActivity) {
		try {
			super.getSession().delete(dailyActivity);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean update(DailyActivity dailyActivity) {
		try {
			super.getSession().update(dailyActivity);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public DailyActivity queryById(int id) {
		DailyActivity dailyActivity = null;
		try {
			dailyActivity = (DailyActivity) super.getSession().get(DailyActivity.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return dailyActivity;
	}

	@Override
	public List<DailyActivity> queryAll() {
		List<DailyActivity> dailyActivities = null;
		try {
			Query query = super.getSession().createQuery("from DailyActivity");
			dailyActivities = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return dailyActivities;
	}

}
