package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class DeniedPromotionSaveData {
	private Integer id;
	private Integer userId;
	private Date deniedDate;
	private String deniedRemark;
	private Integer desinationId;
	private Integer deniedBy;
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
	
	public Integer getDesinationId() {
		return desinationId;
	}
	public void setDesinationId(Integer desinationId) {
		this.desinationId = desinationId;
	}
	public Integer getDeniedBy() {
		return deniedBy;
	}
	public void setDeniedBy(Integer deniedBy) {
		this.deniedBy = deniedBy;
	}
	

}
