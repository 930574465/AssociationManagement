package com.yumazhe.service.impl;

import java.util.List;

import com.yumazhe.dao.AssociationInfoDao;
import com.yumazhe.pojo.AssociationInfo;
import com.yumazhe.service.AssociationInfoService;

public class AssociationInfoServiceImpl implements AssociationInfoService {
	
	private AssociationInfoDao associationInfoDao;
	
	public void setAssociationInfoDao(AssociationInfoDao associationInfoDao) {
		this.associationInfoDao = associationInfoDao;
	}

	@Override
	public void add(AssociationInfo associationInfo) {
		associationInfoDao.add(associationInfo);
	}

	@Override
	public void remove(AssociationInfo associationInfo) {
		AssociationInfo dbAssociationInfo = associationInfoDao.queryById(associationInfo.getId());
		if (dbAssociationInfo != null) {
			associationInfoDao.remove(dbAssociationInfo);
		}
	}

	@Override
	public void modify(AssociationInfo associationInfo) {
		AssociationInfo dbAssociationInfo = associationInfoDao.queryById(associationInfo.getId());
		if (dbAssociationInfo != null) {
			if (associationInfo.getName() != null) {
				dbAssociationInfo.setName(associationInfo.getName());
			}
			if (associationInfo.getPhotoPath() != null) {
				dbAssociationInfo.setPhotoPath(associationInfo.getPhotoPath());
			}
			associationInfoDao.update(dbAssociationInfo);
		}
	}

	@Override
	public AssociationInfo queryById(int id) {
		return associationInfoDao.queryById(id);
	}

	@Override
	public List<AssociationInfo> queryAll() {
		return associationInfoDao.queryAll();
	}

}
