package com.yumazhe.pojo;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

public class Permission  implements Serializable{
	private static final long serialVersionUID = 2366694202099224940L;
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
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		Permission pp = (Permission)obj;
		if (id.equals(pp.getId()) && name.equals(pp.getName())) {
			return true;
		}
		return false;
	}
}
