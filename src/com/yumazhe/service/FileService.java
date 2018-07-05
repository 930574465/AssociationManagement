package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.File;

public interface FileService {
	public boolean add(File file);

	public boolean remove(File file);

	public boolean modify(File file);
	
	public File queryById(int id);
	
	public List<File> queryAll();
}
