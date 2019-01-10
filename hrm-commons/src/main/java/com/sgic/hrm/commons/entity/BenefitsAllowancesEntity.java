package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "benefits_allowances")
public class BenefitsAllowancesEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5957635216582771331L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String deptName;
	private Integer travelling;
	private Integer meal;
	private Integer housing;
	private Integer mobile;
	private Integer medical;

	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="ids")
	private SalaryChartEntity chartEntity;
	
	public SalaryChartEntity getChartEntity() {
		return chartEntity;
	}

	public void setChartEntity(SalaryChartEntity chartEntity) {
		this.chartEntity = chartEntity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getTravelling() {
		return travelling;
	}

	public void setTravelling(Integer travelling) {
		this.travelling = travelling;
	}

	public Integer getMeal() {
		return meal;
	}

	public void setMeal(Integer meal) {
		this.meal = meal;
	}

	public Integer getHousing() {
		return housing;
	}

	public void setHousing(Integer housing) {
		this.housing = housing;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public Integer getMedical() {
		return medical;
	}

	public void setMedical(Integer medical) {
		this.medical = medical;
	}

}
