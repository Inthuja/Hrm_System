package com.sgic.hrm.commons.dto;

import java.util.Date;

public class LoanDto {

	private Integer user_id;

	private String user_name;

	private Date loan_obtained_date;

	private Date installment_date;

	private Integer installment_amount;

	private Date redumption_date;

	private Integer amount;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public Date getLoan_obtained_date() {
		return loan_obtained_date;
	}

	public void setLoan_obtained_date(Date loan_obtained_date) {
		this.loan_obtained_date = loan_obtained_date;
	}

	public Date getInstallment_date() {
		return installment_date;
	}

	public void setInstallment_date(Date installment_date) {
		this.installment_date = installment_date;
	}

	public Integer getInstallment_amount() {
		return installment_amount;
	}

	public void setInstallment_amount(Integer installment_amount) {
		this.installment_amount = installment_amount;
	}

	public Date getRedumption_date() {
		return redumption_date;
	}

	public void setRedumption_date(Date redumption_date) {
		this.redumption_date = redumption_date;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
