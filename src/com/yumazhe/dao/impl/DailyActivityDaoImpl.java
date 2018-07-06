package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.DailyActivityDao;
import com.yumazhe.pojo.DailyActivity;

public class DailyActivityDaoImpl extends HibernateDaoSupport implements DailyActivityDao {

	@Override
	public void add(DailyActivity dailyActivity) {
		super.getSession().save(dailyActivity);
	}

	@Override
	public void remove(DailyActivity dailyActivity) {
		super.getSession().delete(dailyActivity);
	}

	@Override
	public void update(DailyActivity dailyActivity) {
		super.getSession().update(dailyActivity);
	}

	@Override
	public DailyActivity queryById(int id) {
		return (DailyActivity) super.getSession().get(DailyActivity.class, id);
	}

	@Override
	public List<DailyActivity> queryAll() {
		return super.getSession().createQuery("from DailyActivity").list();
	}
}
