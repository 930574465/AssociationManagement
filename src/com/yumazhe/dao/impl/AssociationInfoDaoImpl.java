package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.AssociationInfoDao;
import com.yumazhe.pojo.AssociationInfo;
import com.yumazhe.pojo.Contact;

public class AssociationInfoDaoImpl extends HibernateDaoSupport implements AssociationInfoDao {

	@Override
	public void add(AssociationInfo associationInfo) {
		super.getSession().save(associationInfo);
	}

	@Override
	public void remove(AssociationInfo associationInfo) {
		super.getSession().delete(associationInfo);
	}

	@Override
	public void update(AssociationInfo associationInfo) {
		super.getSession().update(associationInfo);
	}

	@Override
	public AssociationInfo queryById(int id) {
		return (AssociationInfo) super.getSession().get(AssociationInfo.class, id);
	}

	@Override
	public List<AssociationInfo> queryAll() {
		return super.getSession().createQuery("from AssociationInfo").list();
	}
}
