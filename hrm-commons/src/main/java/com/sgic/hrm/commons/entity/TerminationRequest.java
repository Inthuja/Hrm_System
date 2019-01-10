package com.sgic.hrm.commons.entity;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.sgic.hrm.commons.enums.Status;

@Entity
@Table(name = "termination_request", schema = "employee")
public class TerminationRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4094788498255891587L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;
	
	@Column(name = "status")
	Status status;

	@Column(name = "planed_leaving_date")
	Date planedLeavingDate;

	@Column(name = "reason")
	String reason;

	@Column(name = "resignation_letter")
	File resignationLetter;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "termination_type_id")
	TerminationType terminationType;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	User employee;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getPlanedLeavingDate() {
		return planedLeavingDate;
	}

	public void setPlanedLeavingDate(Date planedLeavingDate) {
		this.planedLeavingDate = planedLeavingDate;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public File getResignationLetter() {
		return resignationLetter;
	}

	public void setResignationLetter(File resignationLetter) {
		this.resignationLetter = resignationLetter;
	}

	public TerminationType getTerminationType() {
		return terminationType;
	}

	public void setTerminationType(TerminationType terminationType) {
		this.terminationType = terminationType;
	}

	public User getEmployee() {
		return employee;
	}

	public void setEmployee(User employee) {
		this.employee = employee;
	}

}
