package com.sgic.hrm.commons.entity.par;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ParContent", schema = "employee")
public class ParContent {
	
	@Id
	private String id;
	private String contentName;
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContentName() {
		return contentName;
	}
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}
	
	public ParContent(String id, String contentName) {
		this.id = id;
		this.contentName = contentName;
	}
	
	public ParContent() {
	
	}
	
	

}
