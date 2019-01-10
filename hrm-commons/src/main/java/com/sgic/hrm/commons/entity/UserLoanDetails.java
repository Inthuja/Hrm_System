package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_loan_details", schema = "employee")
public class UserLoanDetails implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	/**
		 * 
		 */
	// private static final long serialVersionUID = -6999466993121815342L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_loan_id")
	private Integer userLoanId;
	@Column(name = "loan_obtained_date")
	private Date loanObtainedDate;
	@Column(name = "installment_period")
	private Integer installmentPeriod;
	@Column(name = "installment_date")
	private Date installmentDate;
	@Column(name = "installment_amount")
	private Integer installmentAmount;
	@Column(name = "redumption_date")
	private Date redumptionDate;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "loan_id")
	private LoanDetailsEntity loanDetailsEntity;

	public LoanDetailsEntity getLoanDetailsEntity() {
		return loanDetailsEntity;
	}

	public void setLoanDetailsEntity(LoanDetailsEntity loanDetailsEntity) {
		this.loanDetailsEntity = loanDetailsEntity;
	}

	public Integer getUserLoanId() {
		return userLoanId;
	}

	public void setUserLoanId(Integer user_loan_id) {
		this.userLoanId = user_loan_id;
	}

	public Date getLoanObtainedDate() {
		return loanObtainedDate;
	}

	public void setLoanObtainedDate(Date loan_obtained_date) {
		this.loanObtainedDate = loan_obtained_date;
	}

	public Integer getInstallmentPeriod() {
		return installmentPeriod;
	}

	public void setInstallmentPeriod(Integer installment_period) {
		this.installmentPeriod = installment_period;
	}

	public Date getInstallmentDate() {
		return installmentDate;
	}

	public void setInstallmentDate(Date installment_date) {
		this.installmentDate = installment_date;
	}

	public Integer getInstallmentAmount() {
		return installmentAmount;
	}

	public void setInstallmentAmount(Integer installment_amount) {
		this.installmentAmount = installment_amount;
	}

	public Date getRedumptionDate() {
		return redumptionDate;
	}

	public void setRedumptionDate(Date redumption_date) {
		this.redumptionDate = redumption_date;
	}

	public User getUserId() {
		return user;
	}

	public void setUserId(User user_id) {
		this.user = user_id;
	}

}
