package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.FileDao;
import com.yumazhe.pojo.File;

public class FileDaoImpl extends HibernateDaoSupport implements FileDao {

	@Override
	public boolean add(File file) {
		try {
			super.getSession().save(file);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean remove(File file) {
		try {
			super.getSession().delete(file);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean update(File file) {
		try {
			super.getSession().update(file);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public File queryById(int id) {
		File file = null;
		try {
			file = (File) super.getSession().get(File.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return file;
	}

	@Override
	public List<File> queryAll() {
		List<File> files = null;
		try {
			Query query = super.getSession().createQuery("from File");
			files = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return files;
	}
}
