package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.UserDao;
import com.yumazhe.pojo.User;
import com.yumazhe.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public boolean register(User user) {
		return false;
	}

	@Override
	public boolean nullify(User user) {
		return false;
	}

	@Override
	public boolean modify(User user) {
		return false;
	}

	@Override
	public boolean login(User user) {
		return false;
	}

	@Override
	public User query(String number) {
		return null;
	}

	@Override
	public List<User> queryAll() {
		return null;
	}

	@Override
	public boolean transfer(String srcNumber, User destNumber) {
		return false;
	}
}
