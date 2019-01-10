package com.sgic.hrm.commons.dto;

public class GeneralWelfareData {
	
	 Integer Id;
	 String generalWelfare_name;
	 String details;
	 WelfareEventDto welfareEvent;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getGeneralWelfare_name() {
		return generalWelfare_name;
	}
	public void setGeneralWelfare_name(String generalWelfare_name) {
		this.generalWelfare_name = generalWelfare_name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public WelfareEventDto getWelfareEvent() {
		return welfareEvent;
	}
	public void setWelfareEvent(WelfareEventDto welfareEvent) {
		this.welfareEvent = welfareEvent;
	}
	


}
