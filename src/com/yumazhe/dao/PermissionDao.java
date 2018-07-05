package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.Permission;

public interface PermissionDao{
	public boolean add(Permission permission);
	
	public boolean remove(Permission permission);
	
	public boolean update(Permission permission);
	
	public Permission queryById(int id);
	
	public List<Permission> queryAll();
}
