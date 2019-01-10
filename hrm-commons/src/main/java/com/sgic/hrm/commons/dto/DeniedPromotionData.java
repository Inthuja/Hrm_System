package com.sgic.hrm.commons.dto;

import java.sql.Date;



public class DeniedPromotionData {
	
	private Integer id;
	private UserData userId;
	private Date deniedDate;
	private String deniedRemark;
	private DesignationData desinationId;
	private Integer deniedBy;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public UserData getUserId() {
		return userId;
	}
	public void setUserId(UserData userId) {
		this.userId = userId;
	}
	public Date getDeniedDate() {
		return deniedDate;
	}
	public void setDeniedDate(Date deniedDate) {
		this.deniedDate = deniedDate;
	}
	public String getDeniedRemark() {
		return deniedRemark;
	}
	public void setDeniedRemark(String deniedRemark) {
		this.deniedRemark = deniedRemark;
	}
	
	public DesignationData getDesinationId() {
		return desinationId;
	}
	public void setDesinationId(DesignationData desinationId) {
		this.desinationId = desinationId;
	}
	public Integer getDeniedBy() {
		return deniedBy;
	}
	public void setDeniedBy(Integer deniedBy) {
		this.deniedBy = deniedBy;
	}
	
	
}
