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
	 * ת�ù���Ա���
	 * 
	 * @param srcId
	 * 		���й���Ա��ݵ��û���number
	 * @param destId
	 * @return 
	 * 		�ɹ�����true��ʧ�ܷ���false
	 */
	public boolean transfer(String srcNumber, User destNumber);
}
