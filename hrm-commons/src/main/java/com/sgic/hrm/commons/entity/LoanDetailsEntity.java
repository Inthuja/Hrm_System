package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_details",schema="employee")

public class LoanDetailsEntity implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 6059099546737108322L;
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
@Column(name="loan_id")
private Integer id;
@Column(name="service_period")
private Integer service_period;
@Column(name="amount")
private Integer amount;
@Column(name="intrest")
private Integer intrest;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getService_period() {
	return service_period;
}
public void setService_period(Integer service_period) {
	this.service_period = service_period;
}
public Integer getAmount() {
	return amount;
}
public void setAmount(Integer amount) {
	this.amount = amount;
}
public Integer getIntrest() {
	return intrest;
}
public void setIntrest(Integer intrest) {
	this.intrest = intrest;
}



}
