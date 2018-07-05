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
	public boolean add(AssociationInfo associationInfo) {
		return false;
	}

	@Override
	public boolean remove(AssociationInfo associationInfo) {
		return false;
	}

	@Override
	public boolean modify(AssociationInfo associationInfo) {
		return false;
	}

	@Override
	public AssociationInfo queryById(int id) {
		return null;
	}

	@Override
	public List<AssociationInfo> queryAll() {
		return null;
	}

}
