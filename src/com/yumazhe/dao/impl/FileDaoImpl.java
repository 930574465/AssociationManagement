package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.FileDao;
import com.yumazhe.pojo.File;
import com.yumazhe.pojo.Notice;

public class FileDaoImpl extends HibernateDaoSupport implements FileDao {

	@Override
	public void add(File file) {
		super.getSession().save(file);
	}

	@Override
	public void remove(File file) {
		super.getSession().delete(file);
	}

	@Override
	public void update(File file) {
		super.getSession().update(file);
	}

	@Override
	public File queryById(int id) {
		return (File)super.getSession().get(File.class, id);
	}

	@Override
	public List<File> queryByPage(int start, int size, File file) {
		String hql = null;
		Query query = null;
		if (file.getType() != null) {
			hql = "from File where type=? order by date desc";
			query = super.getSession().createQuery(hql);
			query.setString(0, file.getType());
		} else {
			hql = "from File order by date desc";
			query = super.getSession().createQuery(hql);
		}
		query.setFirstResult(start);
		query.setMaxResults(size);
		return query.list();
	}

	@Override
	public List<File> queryAll() {
		return super.getSession().createQuery("from File").list();
	}
}
