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
@Entity
@Table(name="appointment",schema="employee")
public class Appointment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9107588803273527722L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="designation_id")
	private Designation designationId;
	
	@ManyToOne
	@JoinColumn(name="appointment_type_id")
	private AppointmentType appointmentTypeId;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department departmentId;
	
	public Department getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Department departmentId) {
		this.departmentId = departmentId;
	}
	private String jobDesc;
	private Date appoinmentDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Designation getDesignationId() {
		return designationId;
	}
	public void setDesignationId(Designation designationId) {
		this.designationId = designationId;
	}
	public AppointmentType getAppointmentTypeId() {
		return appointmentTypeId;
	}
	public void setAppointmentTypeId(AppointmentType appointmentTypeId) {
		this.appointmentTypeId = appointmentTypeId;
	}
	public String getJobDesc() {
		return jobDesc;
	}
	public void setJobDesc(String jobDesc) {
		this.jobDesc = jobDesc;
	}
	public Date getAppoinmentDate() {
		return appoinmentDate;
	}
	public void setAppoinmentDate(Date appoinmentDate) {
		this.appoinmentDate = appoinmentDate;
	}
	
	
	
}
