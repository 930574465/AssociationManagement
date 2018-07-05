package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.User;

public interface UserDao{
	public boolean add(User user);
	
	public boolean remove(User user);
	
	public boolean update(User user);
	
	public User queryByNumber(String number);
	
	public List<User> queryAll();
}
