package com.sgic.hrm.commons.dto;

import java.time.ZonedDateTime;

public class WelfareEventDto {
	private Integer id;
	private Integer welfareTypeId;
	private String welfareName;
	private Float welfareBudget;
	private ZonedDateTime promoteDate;
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
