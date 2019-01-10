package com.sgic.hrm.commons.dto;

import com.sgic.hrm.commons.entity.SalaryChartEntity;

public class BenefitsAllowancesDto {
	private Integer id;
	private String name;
	private String deptName;
	private Integer travelling;
	private Integer meal;
	private Integer housing;
	private Integer mobile;
	private Integer medical;
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
