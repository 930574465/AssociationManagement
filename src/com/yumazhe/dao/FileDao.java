package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.File;

public interface FileDao{
	public void add(File file);
	
	public void remove(File file);
	
	public void update(File file);
	
	public File queryById(int id);
	
	public List<File> queryAll();
}
