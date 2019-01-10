package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(schema = "employee", name = "promotion")
public class Promotion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2921796712335297257L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "user_id")
	private User userId;
	
//	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "designation_id")
	private Designation designationId;
	
	@CreatedDate
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
	
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
	}
	public Designation getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Designation designationId) {
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
