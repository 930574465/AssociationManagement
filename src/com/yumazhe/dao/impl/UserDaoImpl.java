package com.yumazhe.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.yumazhe.dao.UserDao;
import com.yumazhe.pojo.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Override
	public boolean add(User user) {
		try {
			super.getSession().save(user);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean remove(User user) {
		try {
			super.getSession().delete(user);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public boolean update(User user) {
		try {
			super.getSession().update(user);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} 
		return true;
	}

	@Override
	public User queryByNumber(String number) {
		User user = null;
		try {
			user = (User) super.getSession().get(User.class, number);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return user;
	}

	@Override
	public List<User> queryAll() {
		List<User> users = null;
		try {
			Query query = super.getSession().createQuery("from User");
			users = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return users;
	}
}
