package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.AssociationInfoDao;
import com.yumazhe.pojo.AssociationInfo;
import com.yumazhe.pojo.Contact;

public class AssociationInfoDaoImpl extends HibernateDaoSupport implements AssociationInfoDao {

	@Override
	public boolean add(AssociationInfo associationInfo) {
		try {
			super.getSession().save(associationInfo);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean remove(AssociationInfo associationInfo) {
		try {
			super.getSession().delete(associationInfo);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean update(AssociationInfo associationInfo) {
		try {
			super.getSession().update(associationInfo);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public AssociationInfo queryById(int id) {
		AssociationInfo associationInfo = null;
		try {
			associationInfo = (AssociationInfo) super.getSession().get(AssociationInfo.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return associationInfo;
	}

	@Override
	public List<AssociationInfo> queryAll() {
		List<AssociationInfo> associationInfoes = null;
		try {
			Query query = super.getSession().createQuery("from AssociationInfo");
			associationInfoes = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return associationInfoes;
	}
}
