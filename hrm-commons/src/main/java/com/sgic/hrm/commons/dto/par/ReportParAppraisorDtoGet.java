package com.sgic.hrm.commons.dto.par;

import java.util.Date;
import java.util.List;

public class ReportParAppraisorDtoGet {

	private Integer reportId;
	private Integer parId;
	private AppraisorDto appraisedBy;
	private Date appraisedDate;
	private List<ScoreParAppraiserDtoGet> scoreParAppraiserList;

	public ReportParAppraisorDtoGet(Integer reportId, Integer parId) {
		this.reportId = reportId;
		this.parId = parId;
	}

	public ReportParAppraisorDtoGet() {

	}

	public Integer getReportId() {
		return reportId;
	}

	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}

	public Integer getParId() {
		return parId;
	}

	public void setParId(Integer parId) {
		this.parId = parId;
	}

	public AppraisorDto getAppraisedBy() {
		return appraisedBy;
	}

	public void setAppraisedBy(AppraisorDto appraisedBy) {
		this.appraisedBy = appraisedBy;
	}

	public Date getAppraisedDate() {
		return appraisedDate;
	}

	public void setAppraisedDate(Date appraisedDate) {
		this.appraisedDate = appraisedDate;
	}

	public List<ScoreParAppraiserDtoGet> getScoreParAppraiserList() {
		return scoreParAppraiserList;
	}

	public void setScoreParAppraiserList(List<ScoreParAppraiserDtoGet> scoreParAppraiserList) {
		this.scoreParAppraiserList = scoreParAppraiserList;
	}

}
