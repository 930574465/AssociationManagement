package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.File;

public interface FileDao{
	public boolean add(File file);
	
	public boolean remove(File file);
	
	public boolean update(File file);
	
	public File queryById(int id);
	
	public List<File> queryAll();
}
