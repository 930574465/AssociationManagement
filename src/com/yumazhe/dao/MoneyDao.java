package com.yumazhe.dao;

import com.yumazhe.pojo.Money;

public interface MoneyDao{
	public void update(Money money);
	
	public Money query();
}
