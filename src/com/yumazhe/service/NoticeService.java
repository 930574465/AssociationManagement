package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.Permission;

public interface NoticeService {
	public boolean add(Permission permmission);

	public boolean remove(Permission permmission);

	public boolean modify(Permission permmission);
	
	public Permission queryById(int id);
	
	public List<Permission> queryByPage(int start, int size);
	
	public List<Permission> queryAll();
}
