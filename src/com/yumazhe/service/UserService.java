package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.User;

public interface UserService {
	public void register(User user);
	
	/**
	 * �����˺�(�˻�)
	 * 
	 * @param user
	 * 		Ҫ���ٵ��û�
	 */
	public void nullify(User user);
	
	public void modify(User user);
	
	public User login(User user);
	
	public User query(String number);
	
	public List<User> queryAll();
	
	public List<User> queryByPage(int start, int size);
	
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
	
	public void accept(User user);
	
	public int getCount();
}
