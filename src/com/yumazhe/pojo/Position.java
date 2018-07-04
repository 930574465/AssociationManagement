package com.yumazhe.pojo;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Position implements Serializable{
	private static final long serialVersionUID = 1886121321348641256L;
	private Integer id;
	private String name;
	private Set<User> users = new LinkedHashSet<User>(); 

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

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
