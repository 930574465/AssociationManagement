package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.IncomeOrPayout;

public interface IncomeOrPayoutDao {
	public boolean add(IncomeOrPayout incomeOrPayout);
	
	public boolean remove(IncomeOrPayout incomeOrPayout);
	
	public boolean update(IncomeOrPayout incomeOrPayout);
	
	public IncomeOrPayout queryById(int id);
	
	public List<IncomeOrPayout> queryAll();
}
