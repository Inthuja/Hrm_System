package com.sgic.hrm.commons.entity.par;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ScheduleParAppraisor", schema = "employee")
public class ScheduleParAppraisor {

	@Id
	private String id;
	
	@ManyToOne
	@JoinColumn(name="par_id")
	private Par parId;
	
	@ManyToOne
	@JoinColumn(name="ParAppraisor_id")
	private ParAppraisor parAppraisor;
	
	public ScheduleParAppraisor(String id) {
		this.id = id;
	}

	public ScheduleParAppraisor() {
		
	}

	public Par getParId() {
		return parId;
	}

	public void setParId(Par parId) {
		this.parId = parId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ParAppraisor getParAppraisor() {
		return parAppraisor;
	}

	public void setParAppraisor(ParAppraisor parAppraisor) {
		this.parAppraisor = parAppraisor;
	}
	
	

	

	

	
}
