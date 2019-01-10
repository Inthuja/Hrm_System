package com.sgic.hrm.commons.dto;

public class SalaryChartDto {

	private Integer id;
	private String empName;
	private Integer basicSalary;
	private String payee;
	private Integer netSalary;
	private Integer statutoryPayment;
	private Integer loan;
	private Integer epf8;
	private Integer etf3;
	private Integer epf12;
	private Integer stampDuty;

	public Integer getEpf8() {
		return epf8;
	}

	public void setEpf8(Integer epf8) {
		this.epf8 = epf8;
	}

	public Integer getEtf3() {
		return etf3;
	}

	public void setEtf3(Integer etf3) {
		this.etf3 = etf3;
	}

	public Integer getEpf12() {
		return epf12;
	}

	public void setEpf12(Integer epf12) {
		this.epf12 = epf12;
	}

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

	public Integer getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(Integer basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getPayee() {
		return payee;
	}

	public void setPayee(String payee) {
		this.payee = payee;
	}

	public Integer getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(Integer netSalary) {
		this.netSalary = netSalary;
	}

	public Integer getStatutoryPayment() {
		return statutoryPayment;
	}

	public void setStatutoryPayment(Integer statutoryPayment) {
		this.statutoryPayment = statutoryPayment;
	}

	public Integer getLoan() {
		return loan;
	}

	public void setLoan(Integer loan) {
		this.loan = loan;
	}

	public Integer getStampDuty() {
		return stampDuty;
	}

	public void setStampDuty(Integer stampDuty) {
		this.stampDuty = stampDuty;
	}

}
