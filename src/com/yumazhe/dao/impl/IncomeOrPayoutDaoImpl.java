package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.IncomeOrPayoutDao;
import com.yumazhe.pojo.IncomeOrPayout;

public class IncomeOrPayoutDaoImpl extends HibernateDaoSupport implements IncomeOrPayoutDao {

	@Override
	public void add(IncomeOrPayout incomeOrPayout) {
		super.getSession().save(incomeOrPayout);
	}

	@Override
	public void remove(IncomeOrPayout incomeOrPayout) {
		super.getSession().delete(incomeOrPayout);
	}

	@Override
	public void update(IncomeOrPayout incomeOrPayout) {
		super.getSession().update(incomeOrPayout);
	}

	@Override
	public IncomeOrPayout queryById(int id) {
		return (IncomeOrPayout) super.getSession().get(IncomeOrPayout.class, id);
	}

	@Override
	public List<IncomeOrPayout> queryAll() {
		return super.getSession().createQuery("from IncomeOrPayout").list();
	}
}
