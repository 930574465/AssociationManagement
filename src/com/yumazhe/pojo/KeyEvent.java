package com.yumazhe.pojo;

import java.io.Serializable;
import java.util.Date;

public class KeyEvent implements Serializable {
	private static final long serialVersionUID = 8230018310886617501L;
	private Integer id;
	private String title;
	private Date happenedDate;
	private User author;
	private String photoPath;
	private String content;

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

	public Date getHappenedDate() {
		return happenedDate;
	}

	public void setHappenedDate(Date happenedDate) {
		this.happenedDate = happenedDate;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getPhotoPath() {
		return photoPath;
	}

	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
