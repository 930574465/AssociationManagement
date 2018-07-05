package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.AssociationInfo;

public interface AssociationInfoService {
	public boolean add(AssociationInfo associationInfo);

	public boolean remove(AssociationInfo associationInfo);

	public boolean modify(AssociationInfo associationInfo);
	
	public AssociationInfo queryById(int id);
	
	public List<AssociationInfo> queryAll();
}
