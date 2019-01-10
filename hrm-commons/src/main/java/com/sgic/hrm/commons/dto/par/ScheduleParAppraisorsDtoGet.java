package com.sgic.hrm.commons.dto.par;

public class ScheduleParAppraisorsDtoGet {

	private String appraiserId;
	private String appraiserName;

	public ScheduleParAppraisorsDtoGet(String appraiserId, String appraiserName) {
		this.appraiserId = appraiserId;
		this.appraiserName = appraiserName;
	}

	public ScheduleParAppraisorsDtoGet() {

	}

	public String getAppraiserId() {
		return appraiserId;
	}

	public void setAppraiserId(String appraiserId) {
		this.appraiserId = appraiserId;
	}

	public String getAppraiserName() {
		return appraiserName;
	}

	public void setAppraiserName(String appraiserName) {
		this.appraiserName = appraiserName;
	}

}
