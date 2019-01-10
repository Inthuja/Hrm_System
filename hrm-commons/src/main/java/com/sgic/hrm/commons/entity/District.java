package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "district")
public class District implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -237610604606132573L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  Integer  id;
	 private String districtName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	 
	 

}
