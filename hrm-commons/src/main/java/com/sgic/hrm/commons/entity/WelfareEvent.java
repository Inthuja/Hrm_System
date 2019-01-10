package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(schema="employee")
public class WelfareEvent  implements Serializable{
	private static final long serialVersionUID = -660601087360209722L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer welfareTypeId;
	private String welfareName;
	private Float welfareBudget;
	private  ZonedDateTime promoteDate;
	private String status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getWelfareTypeId() {
		return welfareTypeId;
	}
	public void setWelfareTypeId(Integer welfareTypeId) {
		this.welfareTypeId = welfareTypeId;
	}
	public String getWelfareName() {
		return welfareName;
	}
	public void setWelfareName(String welfareName) {
		this.welfareName = welfareName;
	}
	public Float getWelfareBudget() {
		return welfareBudget;
	}
	public void setWelfareBudget(Float welfareBudget) {
		this.welfareBudget = welfareBudget;
	}
	public ZonedDateTime getPromoteDate() {
		return promoteDate;
	}
	public void setPromoteDate(ZonedDateTime promoteDate) {
		this.promoteDate = promoteDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
