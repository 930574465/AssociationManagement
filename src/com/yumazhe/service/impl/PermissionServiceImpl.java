package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.PermissionDao;
import com.yumazhe.pojo.Permission;
import com.yumazhe.service.PermissionService;

public class PermissionServiceImpl implements PermissionService {

	private PermissionDao permissionDao;
	
	public void setPermissionDao(PermissionDao permissionDao) {
		this.permissionDao = permissionDao;
	}
	
	@Override
	public void add(Permission permission) {
		permissionDao.add(permission);
	}

	@Override
	public void remove(Permission permission) {
		Permission dbPermission = permissionDao.queryById(permission.getId());
		if (dbPermission != null) {
			permissionDao.remove(dbPermission);
		}
	}

	@Override
	public void modify(Permission permission) {
		Permission dbPermission = permissionDao.queryById(permission.getId());
		if (dbPermission != null) {
			if (permission.getName() != null) {
				dbPermission.setName(permission.getName());
			}
			if (permission.getUsers() != null) {
				dbPermission.setUsers(permission.getUsers());
			}
			permissionDao.update(dbPermission);
		}
	}

	@Override
	public Permission queryById(int id) {
		return permissionDao.queryById(id);
	}

	@Override
	public List<Permission> queryAll() {
		return permissionDao.queryAll();
	}

}
