package com.yumazhe.pojo;

import java.io.Serializable;

public class AssociationInfo implements Serializable {
	private static final long serialVersionUID = 2732546485030279576L;
	private Integer id;
	private String name;
	private String photoPath;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

}
