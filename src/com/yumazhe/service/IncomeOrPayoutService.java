package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.IncomeOrPayout;

public interface IncomeOrPayoutService {
	public boolean add(IncomeOrPayout incomeOrPayout);

	public boolean remove(IncomeOrPayout incomeOrPayout);

	public boolean modify(IncomeOrPayout incomeOrPayout);
	
	public IncomeOrPayout queryById(int id);
	
	public List<IncomeOrPayout> queryAll();
}
