package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.PermissionDao;
import com.yumazhe.pojo.Permission;

public class PermissionDaoImpl extends HibernateDaoSupport implements PermissionDao {

	@Override
	public boolean add(Permission permission) {
		try {
			super.getSession().save(permission);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean remove(Permission permission) {
		try {
			super.getSession().delete(permission);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean update(Permission permission) {
		try {
			super.getSession().update(permission);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public Permission queryById(int id) {
		Permission permission = null;
		try {
			permission = (Permission) super.getSession().get(Permission.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return permission;
	}

	@Override
	public List<Permission> queryAll() {
		List<Permission> permission = null;
		try {
			Query query = super.getSession().createQuery("from Permission");
			permission = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return permission;
	}
}
