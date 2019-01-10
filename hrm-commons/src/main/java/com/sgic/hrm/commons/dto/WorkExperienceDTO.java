package com.sgic.hrm.commons.dto;

public class WorkExperienceDTO {
	private Integer user;
	public Integer getUser() {
		return user;
	}
	public void setUser(Integer user) {
		this.user = user;
	}
	private Integer id;
	private String workName;
	private String workPlace;
	private Integer periodYearFrom;
	private Integer periodYearTo;
	private String designation;
	private String workType;
	private String reasonForLeaving;
	private Integer leavingSalary;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public String getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	public Integer getPeriodYearFrom() {
		return periodYearFrom;
	}
	public void setPeriodYearFrom(Integer periodYearFrom) {
		this.periodYearFrom = periodYearFrom;
	}
	public Integer getPeriodYearTo() {
		return periodYearTo;
	}
	public void setPeriodYearTo(Integer periodYearTo) {
		this.periodYearTo = periodYearTo;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getWorkType() {
		return workType;
	}
	public void setWorkType(String workType) {
		this.workType = workType;
	}
	public String getReasonForLeaving() {
		return reasonForLeaving;
	}
	public void setReasonForLeaving(String reasonForLeaving) {
		this.reasonForLeaving = reasonForLeaving;
	}
	public Integer getLeavingSalary() {
		return leavingSalary;
	}
	public void setLeavingSalary(Integer leavingSalary) {
		this.leavingSalary = leavingSalary;
	}
	
	
}
