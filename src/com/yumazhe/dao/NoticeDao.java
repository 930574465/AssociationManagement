package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.Notice;

public interface NoticeDao{
	public boolean add(Notice notice);
	
	public boolean remove(Notice notice);
	
	public boolean update(Notice notice);
	
	public Notice queryById(int id);
	
	public List<Notice> queryByPage(int start, int size);
	
	public List<Notice> queryAll();
}
