package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.NoticeDao;
import com.yumazhe.pojo.Notice;

public class NoticeDaoImpl extends HibernateDaoSupport implements NoticeDao {

	@Override
	public boolean add(Notice notice) {
		try {
			super.getSession().save(notice);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean remove(Notice notice) {
		try {
			super.getSession().delete(notice);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean update(Notice notice) {
		try {
			super.getSession().update(notice);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public Notice queryById(int id) {
		Notice notice = null;
		try {
			notice = (Notice) super.getSession().get(Notice.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return notice;
	}
	
	@Override
	public List<Notice> queryByPage(int start, int size) {
		List<Notice> notices = null;
		try {
			Query query = super.getSession().createQuery("from Notice order by date desc");
			query.setFirstResult(start);
			query.setMaxResults(size);
			notices = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return notices;
	}

	@Override
	public List<Notice> queryAll() {
		List<Notice> notices = null;
		try {
			Query query = super.getSession().createQuery("from Notice");
			notices = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return notices;
	}
}
