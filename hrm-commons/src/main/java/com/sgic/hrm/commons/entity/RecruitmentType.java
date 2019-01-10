package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="employee", name="recuitment")
public class RecruitmentType implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4595660838198895045L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String recruitmentType;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRecruitmentType() {
		return recruitmentType;
	}
	public void setRecruitmentType(String recruitmentType) {
		this.recruitmentType = recruitmentType;
	}
	
	
	
	
}
