package com.sgic.hrm.commons.entity.par;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ScheduleParContent", schema = "employee")
public class ScheduleParContent {

	@Id
	private String id;

	@ManyToOne
	@JoinColumn(name = "par_id")
	private Par parId;

	@ManyToOne
	@JoinColumn(name = "ParContent_id")
	private ParContent parContent;

	public ScheduleParContent(String id) {
		this.id = id;
	}

	public ScheduleParContent() {

	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Par getParId() {
		return parId;
	}

	public void setParId(Par parId) {
		this.parId = parId;
	}

	public ParContent getParContent() {
		return parContent;
	}

	public void setParContent(ParContent parContent) {
		this.parContent = parContent;
	}
	

}
