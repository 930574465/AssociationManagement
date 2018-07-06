package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.MoneyDao;
import com.yumazhe.pojo.Money;

public class MoneyDaoImpl extends HibernateDaoSupport implements MoneyDao {

	@Override
	public void update(Money money) {
		super.getSession().update(money);
	}

	@Override
	public Money query() {
		List<Money> money = super.getSession().createQuery("from Money").list();
		if (money != null) {
			//存在资金对象就返回最后一个，不存在就创建
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
