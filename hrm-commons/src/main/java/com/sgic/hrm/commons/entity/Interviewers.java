package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "interviewers", schema = "employee")
public class Interviewers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7660161207338239320L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User userId;

	@ManyToOne
	@JoinColumn(name = "interview_panel_id")
	private Interview interviewPanelId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Interview getInterviewPanelId() {
		return interviewPanelId;
	}

	public void setInterviewPanelId(Interview interviewPanelId) {
		this.interviewPanelId = interviewPanelId;
	}

}
