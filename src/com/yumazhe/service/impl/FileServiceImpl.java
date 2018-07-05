package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.FileDao;
import com.yumazhe.pojo.File;
import com.yumazhe.service.FileService;

public class FileServiceImpl implements FileService {
	
	private FileDao fileDao;
	
	public void setFileDao(FileDao fileDao) {
		this.fileDao = fileDao;
	}

	@Override
	public boolean add(File file) {
		return false;
	}

	@Override
	public boolean remove(File file) {
		return false;
	}

	@Override
	public boolean modify(File file) {
		return false;
	}

	@Override
	public File queryById(int id) {
		return null;
	}

	@Override
	public List<File> queryAll() {
		return null;
	}

}
