package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.IncomeOrPayoutDao;
import com.yumazhe.dao.MoneyDao;
import com.yumazhe.pojo.IncomeOrPayout;
import com.yumazhe.service.IncomeOrPayoutService;

public class IncomeOrPayoutServiceImpl implements IncomeOrPayoutService {
	
	private IncomeOrPayoutDao incomeOrPayoutDao;
	private MoneyDao moneyDao;
	
	public void setIncomeOrPayoutDao(IncomeOrPayoutDao incomeOrPayoutDao) {
		this.incomeOrPayoutDao = incomeOrPayoutDao;
	}
	
	public void setMoneyDao(MoneyDao moneyDao) {
		this.moneyDao = moneyDao;
	}

	@Override
	public boolean add(IncomeOrPayout incomeOrPayout) {
		return false;
	}

	@Override
	public boolean remove(IncomeOrPayout incomeOrPayout) {
		return false;
	}

	@Override
	public boolean modify(IncomeOrPayout incomeOrPayout) {
		return false;
	}

	@Override
	public IncomeOrPayout queryById(int id) {
		return null;
	}

	@Override
	public List<IncomeOrPayout> queryAll() {
		return null;
	}
}
