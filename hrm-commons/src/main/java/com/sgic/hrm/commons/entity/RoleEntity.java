package com.sgic.hrm.commons.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role",schema="employee")
public class RoleEntity implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = -4287459510756933063L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@Column(name="role_id")
private Integer role_id;
@Column(name="role_name")
private String role_name;
public Integer getRole_id() {
	return role_id;
}
public void setRole_id(Integer role_id) {
	this.role_id = role_id;
}
public String getRole_name() {
	return role_name;
}
public void setRole_name(String role_name) {
	this.role_name = role_name;
}

}
