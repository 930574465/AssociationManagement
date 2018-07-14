package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.File;

public interface FileService {
	public void add(File file);

	public void remove(File file);

	public void modify(File file);
	
	public File queryById(int id);
	
	public List<File> queryByPage(int start, int size, File file);
	
	public List<File> queryAll();
}
