
package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema="employee")
public class GeneralWelfare implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6320000592540095523L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne
	@JoinColumn(name ="welfare_id")
	private WelfareEvent welfareEvent;
	private String details;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public WelfareEvent getWelfareEvent() {
		return welfareEvent;
	}
	public void setWelfareEvent(WelfareEvent welfareEvent) {
		this.welfareEvent = welfareEvent;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
