package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.NoticeDao;
import com.yumazhe.pojo.Permission;
import com.yumazhe.service.NoticeService;

public class NoticeServiceImpl implements NoticeService {
	
	private NoticeDao noticeDao;
	
	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}

	@Override
	public boolean add(Permission permmission) {
		return false;
	}

	@Override
	public boolean remove(Permission permmission) {
		return false;
	}

	@Override
	public boolean modify(Permission permmission) {
		return false;
	}

	@Override
	public Permission queryById(int id) {
		return null;
	}

	@Override
	public List<Permission> queryByPage(int start, int size) {
		return null;
	}

	@Override
	public List<Permission> queryAll() {
		return null;
	}
}
