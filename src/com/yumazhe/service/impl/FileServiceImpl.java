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
	public void add(File file) {
		fileDao.add(file);
	}

	@Override
	public void remove(File file) {
		File dbFile = fileDao.queryById(file.getId());
		if (dbFile != null) {
			fileDao.remove(dbFile);
		}
	}

	@Override
	public void modify(File file) {
		File dbFile = fileDao.queryById(file.getId());
		if (dbFile != null) {
			if(file.getAuthor() != null) {
				dbFile.setAuthor(file.getAuthor());
			}
			if (file.getDate() != null) {
				dbFile.setDate(file.getDate());
			}
			if (file.getDowloadNumber() != null) {
				dbFile.setDowloadNumber(file.getDowloadNumber());
			}
			if (file.getFilePath() != null) {
				dbFile.setFilePath(file.getFilePath());
			}
			if (file.getType() != null) {
				dbFile.setType(file.getType());
			}
			fileDao.update(dbFile);
		}
	}

	@Override
	public File queryById(int id) {
		return fileDao.queryById(id);
	}

	@Override
	public List<File> queryAll() {
		return fileDao.queryAll();
	}

}
