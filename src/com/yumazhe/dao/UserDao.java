package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.User;

public interface UserDao{
	public void add(User user);
	
	public void remove(User user);
	
	public void update(User user);
	
	public User queryByNumber(String number);
	
	public List<User> queryByPage(int start, int size);
	
	public List<User> queryAll();
}
