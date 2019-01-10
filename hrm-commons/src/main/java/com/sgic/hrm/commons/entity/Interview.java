package com.sgic.hrm.commons.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "interview")
public class Interview {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "job_id")
	private Job jobId;

	private String interviewPanelNo;
	private Date date;
	private String startTime;
	private String endTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Job getJobId() {
		return jobId;
	}
	public void setJobId(Job jobId) {
		this.jobId = jobId;
	}
	public String getInterviewPanelNo() {
		return interviewPanelNo;
	}
	public void setInterviewPanelNo(String interviewPanelNo) {
		this.interviewPanelNo = interviewPanelNo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	

}
