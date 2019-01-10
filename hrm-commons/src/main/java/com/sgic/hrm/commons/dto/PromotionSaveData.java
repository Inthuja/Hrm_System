package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class PromotionSaveData {
	private Integer id;
	private Integer userId;
	private Integer designationId;
	private Date promotedDate;
	private String remark;
	private Integer salary;
	private Integer promotedBy;
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
	public Date getPromotedDate() {
		return promotedDate;
	}
	public void setPromotedDate(Date promotedDate) {
		this.promotedDate = promotedDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getPromotedBy() {
		return promotedBy;
	}
	public void setPromotedBy(Integer promotedBy) {
		this.promotedBy = promotedBy;
	}
	
}
