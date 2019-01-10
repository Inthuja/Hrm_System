package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "salary_details_emp_view")
public class SalaryDetailsEmpViewEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -578170524770230044L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String empName;
	private Date appointmentDate;
	private Integer basicSalary;
	private Integer increment;
	private Integer deductions;
	private Integer allowances;
	private Integer statutoryPayment;
	private Integer netSalary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public Integer getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Integer basicSalary) {
		this.basicSalary = basicSalary;
	}

	public Integer getIncrement() {
		return increment;
	}

	public void setIncrement(Integer increment) {
		this.increment = increment;
	}

	public Integer getDeductions() {
		return deductions;
	}

	public void setDeductions(Integer deductions) {
		this.deductions = deductions;
	}

	public Integer getAllowances() {
		return allowances;
	}

	public void setAllowances(Integer allowances) {
		this.allowances = allowances;
	}

	public Integer getStatutoryPayment() {
		return statutoryPayment;
	}

	public void setStatutoryPayment(Integer statutoryPayment) {
		this.statutoryPayment = statutoryPayment;
	}

	public Integer getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Integer netSalary) {
		this.netSalary = netSalary;
	}
}
