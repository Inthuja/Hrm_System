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
@Table(name="professional_membership",schema="employee")
public class ProfessionalMembership implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1930133425563493625L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String organizationName;
	private String eventName;
	private String eventType;
	private Integer periodYearFrom;
	private Integer periodYearTo;
	private Integer award;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public Integer getPeriodYearFrom() {
		return periodYearFrom;
	}
	public void setPeriodYearFrom(Integer periodYearFrom) {
		this.periodYearFrom = periodYearFrom;
	}
	public Integer getPeriodYearTo() {
		return periodYearTo;
	}
	public void setPeriodYearTo(Integer periodYearTo) {
		this.periodYearTo = periodYearTo;
	}
	public Integer getAward() {
		return award;
	}
	public void setAward(Integer award) {
		this.award = award;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
