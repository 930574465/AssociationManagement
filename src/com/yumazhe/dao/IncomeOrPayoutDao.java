package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.IncomeOrPayout;

public interface IncomeOrPayoutDao {
	public void add(IncomeOrPayout incomeOrPayout);
	
	public void remove(IncomeOrPayout incomeOrPayout);
	
	public void update(IncomeOrPayout incomeOrPayout);
	
	public IncomeOrPayout queryById(int id);
	
	public List<IncomeOrPayout> queryByPage(int start, int size);
	
	public List<IncomeOrPayout> queryAll();
}
