package com.yumazhe.pojo;

import java.io.Serializable;
import java.util.Date;

public class File implements Serializable {
	private static final long serialVersionUID = 5315253862432881874L;
	private Integer id;
	private String type;
	private User author;
	private Date date;
	private String filePath;
	private Integer dowloadNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Integer getDowloadNumber() {
		return dowloadNumber;
	}

	public void setDowloadNumber(Integer dowloadNumber) {
		this.dowloadNumber = dowloadNumber;
	}

}
