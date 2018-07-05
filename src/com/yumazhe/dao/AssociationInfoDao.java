package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.AssociationInfo;

public interface AssociationInfoDao {
	public boolean add(AssociationInfo associationInfo);
	
	public boolean remove(AssociationInfo associationInfo);
	
	public boolean update(AssociationInfo associationInfo);
	
	public AssociationInfo queryById(int id);
	
	public List<AssociationInfo> queryAll();
}
