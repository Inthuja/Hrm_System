package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="job",schema="employee")

public class Job implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1522967396638491465L;
	@GeneratedValue
	@Id
	private Integer id;
	private String jobName;
	private String jobReferenceNo;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobReferenceNo() {
		return jobReferenceNo;
	}
	public void setJobReferenceNo(String jobReferenceNo) {
		this.jobReferenceNo = jobReferenceNo;
	}
	
	
}
