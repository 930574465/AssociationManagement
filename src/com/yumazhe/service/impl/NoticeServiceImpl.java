package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.NoticeDao;
import com.yumazhe.pojo.Notice;
import com.yumazhe.pojo.Permission;
import com.yumazhe.service.NoticeService;

public class NoticeServiceImpl implements NoticeService {
	
	private NoticeDao noticeDao;
	
	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}

	@Override
	public void add(Notice notice) {
		noticeDao.add(notice);
	}

	@Override
	public void remove(Notice notice) {
		Notice dbNotice = noticeDao.queryById(notice.getId());
		if (dbNotice != null) {
			noticeDao.remove(dbNotice);
		}
	}

	@Override
	public void modify(Notice notice) {
		Notice dbNotice = noticeDao.queryById(notice.getId());
		if (dbNotice != null) {
			if (notice.getAuthor() != null) {
				dbNotice.setAuthor(notice.getAuthor());
			}
			if (notice.getClicks() != null) {
				dbNotice.setClicks(notice.getClicks());
			}
			if (notice.getContent() != null) {
				dbNotice.setContent(notice.getContent());
			}
			if (notice.getDate() != null) {
				dbNotice.setDate(notice.getDate());
			}
			if (notice.getFilePath() != null) {
				dbNotice.setFilePath(notice.getFilePath());
			}
			if (notice.getPermission() != null) {
				dbNotice.setPermission(notice.getPermission());
			}
			if (notice.getTitle() != null) {
				dbNotice.setTitle(notice.getTitle());
			}
			noticeDao.update(dbNotice);
		}
	}

	@Override
	public Notice queryById(int id) {
		return noticeDao.queryById(id);
	}

	@Override
	public List<Notice> queryByPage(int start, int size) {
		return noticeDao.queryByPage(start, size);
	}

	@Override
	public List<Notice> queryAll() {
		return noticeDao.queryAll();
	}
}
