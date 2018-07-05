package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.User;

public interface UserService {
	public boolean register(User user);
	
	public boolean nullify(User user);
	
	public boolean modify(User user);
	
	public boolean login(User user);
	
	public User query(String number);
	
	public List<User> queryAll();
	
	/**
	 * 转让管理员身份
	 * 
	 * @param srcId
	 * 		具有管理员身份的用户的number
	 * @param destId
	 * @return 
	 * 		成功返回true，失败返回false
	 */
	public boolean transfer(String srcNumber, User destNumber);
}
