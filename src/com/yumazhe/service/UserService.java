package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.User;

public interface UserService {
	public void register(User user);
	
	public void nullify(User user);
	
	public void modify(User user);
	
	public User login(User user);
	
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
	public void transfer(String srcNumber, String destNumber);
}
