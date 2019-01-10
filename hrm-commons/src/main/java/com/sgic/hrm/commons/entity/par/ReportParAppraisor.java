package com.sgic.hrm.commons.entity.par;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ReportParAppraisor", schema = "employee")
public class ReportParAppraisor {
	
	@Id
	private Integer id;
	
	@ManyToOne()
	@JoinColumn(name="par_id")
	private Par parId;
	
	private String appraisorId;
	
	private Date appraisedDate;
	
	
//	@OneToMany(mappedBy="reportParAppraisor",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
//	@JsonIgnore
//	private List<ScoreParAppraisor> scoreParAppraisors;
 
	

	public ReportParAppraisor(Integer id, String appraisorId) {
		this.id = id;
		this.appraisorId = appraisorId;
		
	}
	
	public ReportParAppraisor(String appraisorId) {
		this.appraisorId = appraisorId;
		
	}

	public ReportParAppraisor() {
		
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Par getParId() {
		return parId;
	}

	public void setParId(Par parId) {
		this.parId = parId;
	}

	public String getAppraisorId() {
		return appraisorId;
	}

	public void setAppraisorId(String appraisorId) {
		this.appraisorId = appraisorId;
	}

	public Date getAppraisedDate() {
		return appraisedDate;
	}

	public void setAppraisedDate(Date appraisedDate) {
		this.appraisedDate = appraisedDate;
	}

	


//	public List<ScoreParAppraisor> getScoreParAppraisors() {
//		return scoreParAppraisors;
//	}
//
//	public void setScoreParAppraisors(List<ScoreParAppraisor> scoreParAppraisors) {
//		this.scoreParAppraisors = scoreParAppraisors;
//	}
	
	
	

}
