package com.sgic.hrm.commons.dto.par;

public class ScheduleParContentDtoGet {

	private String parContentId;
	private String parContentName;

	public ScheduleParContentDtoGet(String parContentId, String parContentName) {
		this.parContentId = parContentId;
		this.parContentName = parContentName;
	}

	public ScheduleParContentDtoGet() {

	}

	public String getParContentId() {
		return parContentId;
	}

	public void setParContentId(String parContentId) {
		this.parContentId = parContentId;
	}

	public String getParContentName() {
		return parContentName;
	}

	public void setParContentName(String parContentName) {
		this.parContentName = parContentName;
	}

}
