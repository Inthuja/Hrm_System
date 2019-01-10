package com.sgic.hrm.commons.dto.par;

import java.util.Date;
import java.util.List;

public class ScheduleParDtoGet {

	private Integer parId;
	private String empId;
	private Date scheduleDate;

	private List<ScheduleParAppraisorsDtoGet> scheduleParAppraisorsList;
	private List<ScheduleParContentDtoGet> scheduleParContentList;

	public ScheduleParDtoGet(Integer parId, String empId, Date scheduleDate) {
		this.parId = parId;
		this.empId = empId;
		this.scheduleDate = scheduleDate;
	}

	public ScheduleParDtoGet() {

	}

	public Integer getParId() {
		return parId;
	}

	public void setParId(Integer parId) {
		this.parId = parId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(Date scheduleDate) {
		this.scheduleDate = scheduleDate;
	}

	public List<ScheduleParAppraisorsDtoGet> getScheduleParAppraisorsList() {
		return scheduleParAppraisorsList;
	}

	public void setScheduleParAppraisorsList(List<ScheduleParAppraisorsDtoGet> scheduleParAppraisorsList) {
		this.scheduleParAppraisorsList = scheduleParAppraisorsList;
	}

	public List<ScheduleParContentDtoGet> getScheduleParContentList() {
		return scheduleParContentList;
	}

	public void setScheduleParContentList(List<ScheduleParContentDtoGet> scheduleParContentList) {
		this.scheduleParContentList = scheduleParContentList;
	}

}
