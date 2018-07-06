package com.yumazhe.pojo;

import java.io.Serializable;
import java.util.Date;

public class IncomeOrPayout implements Serializable {
	private static final long serialVersionUID = -1492386939686654822L;
	private Integer id;
	private Double money;
	private String type;	//'0'是收入，'1'是支出
	private String tourceOrDestination;
	private Date date;
	private User agent;
	private User applicant;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTourceOrDestination() {
		return tourceOrDestination;
	}

	public void setTourceOrDestination(String tourceOrDestination) {
		this.tourceOrDestination = tourceOrDestination;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public User getAgent() {
		return agent;
	}

	public void setAgent(User agent) {
		this.agent = agent;
	}

	public User getApplicant() {
		return applicant;
	}

	public void setApplicant(User applicant) {
		this.applicant = applicant;
	}
}
