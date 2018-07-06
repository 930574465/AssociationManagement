package com.yumazhe.dao;

import java.util.List;

import com.yumazhe.pojo.AssociationInfo;

public interface AssociationInfoDao {
	public void add(AssociationInfo associationInfo);
	
	public void remove(AssociationInfo associationInfo);
	
	public void update(AssociationInfo associationInfo);
	
	public AssociationInfo queryById(int id);
	
	public List<AssociationInfo> queryAll();
}
