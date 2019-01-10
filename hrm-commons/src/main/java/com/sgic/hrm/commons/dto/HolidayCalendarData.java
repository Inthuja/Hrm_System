package com.sgic.hrm.commons.dto;

import java.util.Date;

public class HolidayCalendarData {

	private Integer id;
	private Date date;
	private String description;
	private UserData enteredBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UserData getEnteredBy() {
		return enteredBy;
	}

	public void setEnteredBy(UserData enteredBy) {
		this.enteredBy = enteredBy;
	}

}
