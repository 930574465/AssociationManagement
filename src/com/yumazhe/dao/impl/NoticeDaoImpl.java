package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.NoticeDao;
import com.yumazhe.pojo.Notice;

public class NoticeDaoImpl extends HibernateDaoSupport implements NoticeDao {

	@Override
	public void add(Notice notice) {
		super.getSession().save(notice);
	}

	@Override
	public void remove(Notice notice) {
		super.getSession().delete(notice);
	}

	@Override
	public void update(Notice notice) {
		super.getSession().update(notice);
	}

	@Override
	public Notice queryById(int id) {
		return (Notice) super.getSession().get(Notice.class, id);
	}
	
	@Override
	public List<Notice> queryByPage(int start, int size, Notice notice) {
		Query query = null;
		if (notice.getPermission() == null) {
			query = super.getSession().createQuery("from Notice order by date desc");
		} else {
			query = super.getSession().createQuery("from Notice where permission=? order  by date desc");
			query.setString(0, notice.getPermission());
		}
		query.setFirstResult(start);
		query.setMaxResults(size);
		return query.list();
	}

	@Override
	public List<Notice> queryAll() {
		return super.getSession().createQuery("from Notice").list();
	}
}
