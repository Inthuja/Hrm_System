package com.sgic.hrm.commons.dto;

public class RolesAndResponsibilityDto {
	private Integer id;
	private Integer user;
	private Integer job;
	private Integer location;
	private Integer keyActivity;
	private String responsibility;
	private String overAllPurpose;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	public Integer getJob() {
		return job;
	}
	public void setJob(Integer job) {
		this.job = job;
	}
	public Integer getLocation() {
		return location;
	}
	public void setLocatio(Integer location) {
		this.location = location;
	}
	public Integer getKeyActivity() {
		return keyActivity;
	}
	public void setKeyActivity(Integer keyActivity) {
		this.keyActivity = keyActivity;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	public String getOverAllPurpose() {
		return overAllPurpose;
	}
	public void setOverAllPurpose(String overAllPurpose) {
		this.overAllPurpose = overAllPurpose;
	}
	
}
