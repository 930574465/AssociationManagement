package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.Permission;

public interface PermissionDao{
	public void add(Permission permission);
	
	public void remove(Permission permission);
	
	public void update(Permission permission);
	
	public Permission queryById(int id);
	
	public List<Permission> queryAll();
}
