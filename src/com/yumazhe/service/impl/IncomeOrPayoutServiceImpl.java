package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.IncomeOrPayoutDao;
import com.yumazhe.dao.MoneyDao;
import com.yumazhe.pojo.IncomeOrPayout;
import com.yumazhe.pojo.Money;
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
	public void add(IncomeOrPayout incomeOrPayout) {
		incomeOrPayoutDao.add(incomeOrPayout);
		Money money = moneyDao.query();
		
		//"0"��֧����"1"������
		if (incomeOrPayout.getType().equals("0")) {
			//��֧��¼����С��0����ȥ��֧��¼������ʽ�����С��9
			if (money.getSize()-incomeOrPayout.getMoney()<0 || incomeOrPayout.getMoney()<0) {
				throw new RuntimeException("���С��0������֧���Ϊ����");
			}
			money.setSize(money.getSize()-incomeOrPayout.getMoney());
		} else {
			money.setSize(money.getSize()+incomeOrPayout.getMoney());
		}
		moneyDao.update(money);
	}

	@Override
	public void remove(IncomeOrPayout incomeOrPayout) {
		IncomeOrPayout dbIncomeOrPayout = incomeOrPayoutDao.queryById(incomeOrPayout.getId());
		if (dbIncomeOrPayout != null) {
			incomeOrPayoutDao.remove(dbIncomeOrPayout);
			Money money = moneyDao.query();
			
			//"0"��֧����"1"������
			if (dbIncomeOrPayout.getType().equals("0")) {
				money.setSize(money.getSize()+dbIncomeOrPayout.getMoney());
			} else {
				if (money.getSize()-dbIncomeOrPayout.getMoney()<0 || incomeOrPayout.getMoney()<0) {
					throw new RuntimeException("���С��0������֧���Ϊ����");
				}
				money.setSize(money.getSize()-dbIncomeOrPayout.getMoney());
			}
			moneyDao.update(money);
		}
	}

	@Override
	public IncomeOrPayout queryById(int id) {
		return incomeOrPayoutDao.queryById(id);
	}
	
	@Override
	public List<IncomeOrPayout> queryByPage(int start, int size) {
		return incomeOrPayoutDao.queryByPage(start, size);
	}

	@Override
	public List<IncomeOrPayout> queryAll() {
		return incomeOrPayoutDao.queryAll();
	}

}
