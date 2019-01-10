/*
 * this dto only include request experience letter table fields only. this dto will not include any
 * foreign key related information. only foreign key id created in this dto. using for POST
 * HttpMethod
 */
package com.sgic.hrm.commons.dto;

import java.time.LocalDate;

public class RequestExperienceLetterDto {

	private Integer id;
	private Integer user;
	private Integer noOfCopy;
	private String reason;
	private String competency;
	private LocalDate createdAt;
	private String status;

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

	public Integer getNoOfCopy() {
		return noOfCopy;
	}

	public void setNoOfCopy(Integer noOfCopy) {
		this.noOfCopy = noOfCopy;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getCompetency() {
		return competency;
	}

	public void setCompetency(String competency) {
		this.competency = competency;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
