package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.MoneyDao;
import com.yumazhe.pojo.Money;

public class MoneyDaoImpl extends HibernateDaoSupport implements MoneyDao {

	@Override
	public boolean update(Money money) {
		try {
			super.getSession().update(money);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public Money query() {
		List<Money> money = null;
		try {
			Query query = super.getSession().createQuery("from Money");
			money = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		if (money != null) {
			//不存在资金对象就创建
			if (money.size() != 0) {
				return money.get(money.size()-1);
			} else {
				Money newMoney = new Money();
				super.getSession().save(newMoney);
				return newMoney;
			}
		} 
		return null;
	}
}
