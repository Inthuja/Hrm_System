package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class AppointmentDto {
	private Integer id;
	private Integer userId;
	private Integer designationId;
	private Integer appointmentTypeId;
	private Integer departmentId;
	private String jobDesc;
	private Date appoinmentDate;
	
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Integer designationId) {
		this.designationId = designationId;
	}
	public Integer getAppointmentTypeId() {
		return appointmentTypeId;
	}
	public void setAppointmentTypeId(Integer appointmentTypeId) {
		this.appointmentTypeId = appointmentTypeId;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public Date getAppoinmentDate() {
		return appoinmentDate;
	}
	public void setAppoinmentDate(Date appoinmentDate) {
		this.appoinmentDate = appoinmentDate;
	}
	

}
