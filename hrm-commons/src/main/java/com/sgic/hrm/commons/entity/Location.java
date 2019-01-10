package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location", schema = "employee")

public class Location implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String locationName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}
