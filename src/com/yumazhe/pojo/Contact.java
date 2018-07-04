package com.yumazhe.pojo;

import java.io.Serializable;

public class Contact implements Serializable {
	private static final long serialVersionUID = 8283266118925415439L;
	private Integer id;
	private String name;
	private String context;

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

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
}
