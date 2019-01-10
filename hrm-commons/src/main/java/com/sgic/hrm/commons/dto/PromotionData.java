package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class PromotionData {

	private Integer id;
	private UserData usertId;
	private DesignationData designationId;
	private Date promotedDate;
	private String remark;
	private int salary;
	private int promotedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DesignationData getDesignationId() {
		return designationId;
	}

	public void setDesignationId(DesignationData designationId) {
		this.designationId = designationId;
	}

	public UserData getUsertId() {
		return usertId;
	}

	public void setUsertId(UserData usertId) {
		this.usertId = usertId;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getPromotedBy() {
		return promotedBy;
	}

	public void setPromotedBy(int promotedBy) {
		this.promotedBy = promotedBy;
	}

}
