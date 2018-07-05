package com.yumazhe.service.impl;

import com.yumazhe.dao.MoneyDao;
import com.yumazhe.pojo.Money;
import com.yumazhe.service.MoneyService;

public class MoneyServiceImpl implements MoneyService {
	
	private MoneyDao moneyDao;

	public void setMoneyDao(MoneyDao moneyDao) {
		this.moneyDao = moneyDao;
	}
	
	@Override
	public Money query() {
		return null;
	}

}
