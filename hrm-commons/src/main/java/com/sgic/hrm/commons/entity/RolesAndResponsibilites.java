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
@Table(name="roles_and_responsibilites",schema="employee")

public class RolesAndResponsibilites  implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	@ManyToOne
	@JoinColumn(name="job_id")
	private Job job;
	
	@ManyToOne
	@JoinColumn(name="location_id")
	private Location location;
	
	@ManyToOne
	@JoinColumn(name="key_activity_id")
	private KeyActivity keyActivity;
	
	private String responsibility;
	private String overAllPurpose;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public KeyActivity getKeyActivity() {
		return keyActivity;
	}
	public void setKeyActivity(KeyActivity keyActivity) {
		this.keyActivity = keyActivity;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	public String getOverAllPurpose() {
		return overAllPurpose;
	}
	public void setOverAllPurpose(String overAllPurpose) {
		this.overAllPurpose = overAllPurpose;
	}
	
	
	
}
