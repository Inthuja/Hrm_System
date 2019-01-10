package com.sgic.hrm.commons.entity;

import java.io.Serializable;

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
@Table(name="user_entity",schema="employee")
public class UserEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7848968070083039949L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	public Integer userId;
	@Column(name="user_name")
	private String userName;
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="role_id")
	private RoleEntity roleId;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer user_id) {
		this.userId = user_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String user_name) {
		this.userName = user_name;
	}
	public RoleEntity getRoleId() {
		return roleId;
	}
	public void setRoleId(RoleEntity role_id) {
		this.roleId = role_id;
	}
	
	

}
