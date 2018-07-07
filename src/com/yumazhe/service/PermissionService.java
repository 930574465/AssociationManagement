package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.Permission;

public interface PermissionService {
	public void add(Permission permission);

	public void remove(Permission permission);
	
	public Permission queryById(int id);
	
	public List<Permission> queryAll();
}
