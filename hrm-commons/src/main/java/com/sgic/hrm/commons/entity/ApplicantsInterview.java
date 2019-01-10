package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "applicant_interview_panel", schema = "employee")
public class ApplicantsInterview implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5160361513675268442L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "interview_panel_id")
	private Interview interviewPanelId;

	private Boolean reachedThroughtThePhoneCall;
	private Boolean attendence;
	private String scoreCard;
	private Boolean selectedStatus;
	private String reason;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Interview getInterviewPanelId() {
		return interviewPanelId;
	}

	public void setInterviewPanelId(Interview interviewPanelId) {
		this.interviewPanelId = interviewPanelId;
	}

	public Boolean getReachedThroughtThePhoneCall() {
		return reachedThroughtThePhoneCall;
	}

	public void setReachedThroughtThePhoneCall(Boolean reachedThroughtThePhoneCall) {
		this.reachedThroughtThePhoneCall = reachedThroughtThePhoneCall;
	}

	public Boolean getAttendence() {
		return attendence;
	}

	public void setAttendence(Boolean attendence) {
		this.attendence = attendence;
	}

	public String getScoreCard() {
		return scoreCard;
	}

	public void setScoreCard(String scoreCard) {
		this.scoreCard = scoreCard;
	}

	public Boolean getSelectedStatus() {
		return selectedStatus;
	}

	public void setSelectedStatus(Boolean selectedStatus) {
		this.selectedStatus = selectedStatus;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}
