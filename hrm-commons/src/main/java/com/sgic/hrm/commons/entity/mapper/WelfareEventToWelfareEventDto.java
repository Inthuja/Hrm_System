package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.WelfareEventDto;
import com.sgic.hrm.commons.entity.WelfareEvent;

public class WelfareEventToWelfareEventDto {
	
private WelfareEventToWelfareEventDto() {}
	
	
	public static WelfareEventDto WelfareEventToWelfareEventDto(WelfareEvent welfareEvent) {
		WelfareEventDto welfareEventDto =new WelfareEventDto();
		
			if (welfareEvent != null) {
				welfareEventDto.setId(welfareEvent.getId());
				welfareEventDto.setWelfareTypeId(welfareEvent.getWelfareTypeId());
				welfareEventDto.setWelfareName(welfareEvent.getWelfareName());
				welfareEventDto.setWelfareBudget(welfareEvent.getWelfareBudget());
				welfareEventDto.setPromoteDate(welfareEvent.getPromoteDate());
				welfareEventDto.setStatus(welfareEvent.getStatus());
				

			}

			return welfareEventDto;
			
			
		
	}
	public static List<WelfareEventDto> WelfareEventToWelfareEventDto(List<WelfareEvent> welfareEvent) {
		List<WelfareEventDto> welfareEventList = new ArrayList<WelfareEventDto>();

		if (welfareEvent != null) {
			for (WelfareEvent welfare : welfareEvent) {
				welfareEventList.add(WelfareEventToWelfareEventDto(welfare));
			}
		}
		return welfareEventList;
	}

}
