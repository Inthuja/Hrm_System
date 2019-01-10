package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "holiday_calendar",schema = "leavesystem")
public class HolidayCalendar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6215661525000035290L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "date")
	private Date date;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "entered_by")
	private User enteredBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getEnteredBy() {
		return enteredBy;
	}

	public void setEnteredBy(User enteredBy) {
		this.enteredBy = enteredBy;
	}

}
