package com.yumazhe.service;

import java.util.List;

import com.yumazhe.pojo.AssociationInfo;

public interface AssociationInfoService {
	public void add(AssociationInfo associationInfo);

	public void remove(AssociationInfo associationInfo);

	public void modify(AssociationInfo associationInfo);
	
	public AssociationInfo queryById(int id);
	
	public List<AssociationInfo> queryAll();
}
