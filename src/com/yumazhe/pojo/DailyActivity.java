package com.yumazhe.pojo;

import java.io.Serializable;

public class DailyActivity implements Serializable {
	private static final long serialVersionUID = 2408684318311690226L;
	private Integer id;
	private String title;
	private String context;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
}
