package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema="employee")
public class IndividualWelfare implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1263918565897898434L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer Id;
	@ManyToOne
	@JoinColumn (name ="userId")
	private User user;
	
	@OneToOne
	@JoinColumn(name ="welfare_id")
	private WelfareEvent welfareEvent;
	
	private Integer amount;
	private Date date ;
	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public WelfareEvent getWelfareEvent() {
		return welfareEvent;
	}
	public void setWelfareEvent(WelfareEvent welfareEvent) {
		this.welfareEvent = welfareEvent;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}


