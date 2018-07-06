package com.yumazhe.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.PermissionDao;
import com.yumazhe.pojo.Permission;

public class PermissionDaoImpl extends HibernateDaoSupport implements PermissionDao {

	@Override
	public void add(Permission permission) {
		super.getSession().save(permission);
	}

	@Override
	public void remove(Permission permission) {
		super.getSession().delete(permission);
	}

	@Override
	public void update(Permission permission) {
		super.getSession().update(permission);
	}

	@Override
	public Permission queryById(int id) {
		return (Permission) super.getSession().get(Permission.class, id);
	}

	@Override
	public List<Permission> queryAll() {
		return super.getSession().createQuery("from Permission").list();
	}
}
