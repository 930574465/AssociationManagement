package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.PositionDao;
import com.yumazhe.dao.UserDao;
import com.yumazhe.pojo.Position;
import com.yumazhe.pojo.User;
import com.yumazhe.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	private PositionDao positionDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void setPositionDao(PositionDao positionDao) {
		this.positionDao = positionDao;
	}

	@Override
	public void register(User user) {
		userDao.add(user);
	}

	@Override
	public void nullify(User user) {
		List<Position> all = positionDao.queryAll();
		User dbUser = userDao.queryByNumber(user.getNumber());
		if (dbUser != null) {
			//最后一个职务代表 退会，在添加职务时要在最后添加 退会
			dbUser.setPosition(all.get(all.size()-1));
			userDao.update(dbUser);
		}
	}

	@Override
	public void modify(User user) {
		User dbUser = userDao.queryByNumber(user.getNumber());
		if (dbUser != null) {
			if (user.getClasses() != null) {
				dbUser.setClasses(user.getClasses());
			}
			if (user.getContactWay() != null) {
				dbUser.setContactWay(user.getContactWay());
			}
			if (user.getName() != null) {
				dbUser.setName(user.getName());
			}
			if (user.getPassword() != null) {
				dbUser.setPassword(user.getPassword());
			}
			if (user.getPayState() != null) {
				dbUser.setPayState(user.getPayState());
			}
			if (user.getPermissions() != null) {
				dbUser.setPermissions(user.getPermissions());
			}
			if (user.getPhotoPath() != null) {
				dbUser.setPhotoPath(user.getPhotoPath());
			}
			if (user.getPosition() != null) {
				dbUser.setPosition(user.getPosition());
			}
			if (user.getSex() != null) {
				dbUser.setSex(user.getSex());
			}
			userDao.update(dbUser);
		}
	}

	@Override
	public User login(User user) {
		User dbUser = userDao.queryByNumber(user.getNumber());
		if (user.getNumber().equals(dbUser.getNumber()) && user.getPassword().equals(dbUser.getPassword())) {
			return dbUser;
		} 
		return null;
	}

	@Override
	public User query(String number) {
		return userDao.queryByNumber(number);
	}

	@Override
	public List<User> queryAll() {
		return userDao.queryAll();
	}

	@Override
	public void transfer(String srcNumber, String destNumber) {
		User srcUser = userDao.queryByNumber(srcNumber);
		Position srcPosition = srcUser.getPosition();
		User destUser = userDao.queryByNumber(destNumber);
		Position destPosition = destUser.getPosition();
		srcUser.setPosition(destPosition);
		destUser.setPosition(srcPosition);
		userDao.update(srcUser);
		userDao.update(destUser);
	}
}
