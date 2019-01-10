package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class IndividualWelfareData {
	
	private Integer Id;
	private String employee_name;
	private String individualWelfare_name;
	private Integer amount;
	private Date date ;
	
	UserData user;
	WelfareEventDto welfareEvent;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getIndividualWelfare_name() {
		return individualWelfare_name;
	}
	public void setIndividualWelfare_name(String individualWelfare_name) {
		this.individualWelfare_name = individualWelfare_name;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public UserData getUser() {
		return user;
	}
	public void setUser(UserData user) {
		this.user = user;
	}
	public WelfareEventDto getWelfareEvent() {
		return welfareEvent;
	}
	public void setWelfareEvent(WelfareEventDto welfareEvent) {
		this.welfareEvent = welfareEvent;
	}
	
	

}






