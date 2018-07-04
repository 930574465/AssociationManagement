package com.yumazhe.pojo;

import java.io.Serializable;

public class Money  implements Serializable{
	private static final long serialVersionUID = -1649451040868325344L;
	private Integer id;
	private Double size;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSize() {
		return size;
	}

	public void setSize(Double size) {
		this.size = size;
	}
}
