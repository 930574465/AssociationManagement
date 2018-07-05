package com.yumazhe.dao;

import com.yumazhe.pojo.Money;

public interface MoneyDao{
	public boolean update(Money money);
	
	public Money query();
}
