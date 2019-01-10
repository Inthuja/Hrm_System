package com.sgic.hrm.commons.entity.par;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ParAppraisor", schema = "employee")
public class ParAppraisor {

	@Id
	private String appraiserId;
	private String empId;
	private String empName;

	public ParAppraisor(String id, String empId,String empName) {

		this.appraiserId = id;
		this.empId = empId;
		this.empName=empName;
	}

	public ParAppraisor() {

	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getAppraiserId() {
		return appraiserId;
	}

	public void setAppraiserId(String appraiserId) {
		this.appraiserId = appraiserId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}



	
}
