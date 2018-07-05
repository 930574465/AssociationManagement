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
	public boolean add(Permission permmission) {
		return false;
	}

	@Override
	public boolean remove(Permission permmission) {
		return false;
	}

	@Override
	public boolean modify(Permission permmission) {
		return false;
	}

	@Override
	public Permission queryById(int id) {
		return null;
	}

	@Override
	public List<Permission> queryAll() {
		return null;
	}

}
