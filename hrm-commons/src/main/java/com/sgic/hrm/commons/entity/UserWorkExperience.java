package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity 
@Table(name="user_work_experience",schema="employee")

public class UserWorkExperience implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4826817714969569889L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;

//	@ManyToOne
//	@JoinColumn(name = "user_id")
//	private User userId;
//
//	@ManyToOne
//	@JoinColumn(name = "experience_id")
	private WorkExperience experienceId;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
//	public User getUserId() {
//		return userId;
//	}
//	public void setUserId(User userId) {
//		this.userId = userId;
//	}
	public WorkExperience getExperienceId() {
		return experienceId;
	}
	public void setExperienceId(WorkExperience experienceId) {
		this.experienceId = experienceId;
	}
	
	
	
	
	
}
