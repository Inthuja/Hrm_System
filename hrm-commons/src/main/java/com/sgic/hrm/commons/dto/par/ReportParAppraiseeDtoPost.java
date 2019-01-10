package com.sgic.hrm.commons.dto.par;

import java.util.List;

import com.sgic.hrm.commons.entity.par.ScoreParAppraisee;

public class ReportParAppraiseeDtoPost {
	
	private Integer reportId;
	private Integer parId;
	private List<ScoreParAppraiseeDtoPost> scoreParAppraiseeList;

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
	public List<ScoreParAppraiseeDtoPost> getScoreParAppraiseeList() {
		return scoreParAppraiseeList;
	}
	public void setScoreParAppraiseeList(List<ScoreParAppraiseeDtoPost> scoreParAppraiseeList) {
		this.scoreParAppraiseeList = scoreParAppraiseeList;
	}
	
	public ReportParAppraiseeDtoPost (Integer reportId,Integer parId) {
		this.reportId=reportId;
		this.parId=parId;	
	}
	public ReportParAppraiseeDtoPost() {
		
	}
}