package com.sgic.hrm.commons.dto.par;

import java.util.Date;
import java.util.List;

public class ReportParAppraisorDtoPost {
	private Integer reportId;
	private Integer parId;
	private String appraisedById;
	private Date appraisedDate;
	private List<ScoreParAppraiserDtoPost> scoreParAppraiserList;

	public ReportParAppraisorDtoPost(Integer reportId, Integer parId, String appraisedById, Date appraisedDate) {
		this.reportId = reportId;
		this.parId = parId;
		this.appraisedById = appraisedById;
		this.appraisedDate = appraisedDate;
	}

	public ReportParAppraisorDtoPost() {

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

	public String getAppraisedById() {
		return appraisedById;
	}

	public void setAppraisedById(String appraisedById) {
		this.appraisedById = appraisedById;
	}

	
	public Date getAppraisedDate() {
		return appraisedDate;
	}

	public void setAppraisedDate(Date appraisedDate) {
		this.appraisedDate = appraisedDate;
	}

	public List<ScoreParAppraiserDtoPost> getScoreParAppraiserList() {
		return scoreParAppraiserList;
	}

	public void setScoreParAppraiserList(List<ScoreParAppraiserDtoPost> scoreParAppraiserList) {
		this.scoreParAppraiserList = scoreParAppraiserList;
	}

}
