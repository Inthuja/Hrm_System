package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "highestQualification")
public class HighestQualification implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5496679750989548316L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String highestQualificationName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHighestQualificationName() {
		return highestQualificationName;
	}

	public void setHighestQualificationName(String highestQualificationName) {
		this.highestQualificationName = highestQualificationName;
	}

}
