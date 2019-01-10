package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(schema = "employee", name = "denied_promotion")
public class DeniedPromotion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2553904032570064501L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name ="user_id")
	private User userId;
	
	@CreationTimestamp
	private Date deniedDate;
	
	public void setDeniedBy(Integer deniedBy) {
		this.deniedBy = deniedBy;
	}

	private String deniedRemark;
	
	@ManyToOne
	@JoinColumn(name="designation_id")
	private Designation desinationId;
	
	private Integer deniedBy;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	public User getUserId() {
		return userId;
	}

	public void setUserId(User userId) {
		this.userId = userId;
	}

	public Date getDeniedDate() {
		return deniedDate;
	}

	public void setDeniedDate(Date deniedDate) {
		this.deniedDate = deniedDate;
	}

	public String getDeniedRemark() {
		return deniedRemark;
	}

	public void setDeniedRemark(String deniedRemark) {
		this.deniedRemark = deniedRemark;
	}

	

	public Designation getDesinationId() {
		return desinationId;
	}

	public void setDesinationId(Designation desinationId) {
		this.desinationId = desinationId;
	}

	public Integer getDeniedBy() {
		return deniedBy;
	}

	
	

	

}
