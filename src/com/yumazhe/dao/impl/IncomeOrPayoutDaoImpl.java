package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.IncomeOrPayoutDao;
import com.yumazhe.pojo.IncomeOrPayout;

public class IncomeOrPayoutDaoImpl extends HibernateDaoSupport implements IncomeOrPayoutDao {

	@Override
	public boolean add(IncomeOrPayout incomeOrPayout) {
		try {
			super.getSession().save(incomeOrPayout);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean remove(IncomeOrPayout incomeOrPayout) {
		try {
			super.getSession().delete(incomeOrPayout);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean update(IncomeOrPayout incomeOrPayout) {
		try {
			super.getSession().update(incomeOrPayout);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public IncomeOrPayout queryById(int id) {
		IncomeOrPayout incomeOrPayout = null;
		try {
			incomeOrPayout = (IncomeOrPayout) super.getSession().get(IncomeOrPayout.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return incomeOrPayout;
	}

	@Override
	public List<IncomeOrPayout> queryAll() {
		List<IncomeOrPayout> IncomeOrPayouts = null;
		try {
			Query query = super.getSession().createQuery("from IncomeOrPayout");
			IncomeOrPayouts = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return IncomeOrPayouts;
	}
}
