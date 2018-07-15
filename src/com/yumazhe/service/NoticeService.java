package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.Notice;

public interface NoticeService {
	public void add(Notice notice);

	public void remove(Notice notice);

	public void modify(Notice notice);
	
	public Notice queryById(int id);
	
	public List<Notice> queryByPage(int start, int size, Notice notice);
	
	public List<Notice> queryAll();
	
	public int getCount();
	
	public int getCountByPermission(Notice notice);
}
