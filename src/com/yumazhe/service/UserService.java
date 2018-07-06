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
	 * ת�ù���Ա���
	 * 
	 * @param srcId
	 * 		���й���Ա��ݵ��û���number
	 * @param destId
	 * @return 
	 * 		�ɹ�����true��ʧ�ܷ���false
	 */
	public void transfer(String srcNumber, String destNumber);
}
