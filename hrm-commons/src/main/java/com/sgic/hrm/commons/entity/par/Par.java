package com.sgic.hrm.commons.entity.par;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "par", schema = "employee")
public class Par {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String empId;
	private Double overAllScore;
	private Date scheduleDate;

	public Par(Integer id, String empId, Double overAllScore, Date scheduleDate) {
		this.id = id;
		this.empId = empId;
		this.overAllScore = overAllScore;
		this.scheduleDate = scheduleDate;
	}

	public Par(Integer id, String empId, Date scheduleDate) {

		this.id = id;
		this.empId = empId;
		this.scheduleDate = scheduleDate;
	}

	public Par() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Double getOverAllScore() {
		return overAllScore;
	}

	public void setOverAllScore(Double overAllScore) {
		this.overAllScore = overAllScore;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

//	public ReportParAppraise getReportParAppraise() {
//		return reportParAppraise;
//	}
//
//	public void setReportParAppraise(ReportParAppraise reportParAppraise) {
//		this.reportParAppraise = reportParAppraise;
//	}
//
//	public List<ReportParAppraisor> getReportParAppraisors() {
//		return reportParAppraisors;
//	}
//
//	public void setReportParAppraisors(List<ReportParAppraisor> reportParAppraisors) {
//		this.reportParAppraisors = reportParAppraisors;
//	}
//
//	public List<ScheduleParAppraisor> getScheduleParAppraisorsList() {
//		return scheduleParAppraisorsList;
//	}
//
//	public void setScheduleParAppraisorsList(List<ScheduleParAppraisor> scheduleParAppraisorsList) {
//		this.scheduleParAppraisorsList = scheduleParAppraisorsList;
//	}
//
//	public List<ScheduleParContent> getScheduleParContentList() {
//		return scheduleParContentList;
//	}
//
//	public void setScheduleParContentList(List<ScheduleParContent> scheduleParContentList) {
//		this.scheduleParContentList = scheduleParContentList;
//	}

}
