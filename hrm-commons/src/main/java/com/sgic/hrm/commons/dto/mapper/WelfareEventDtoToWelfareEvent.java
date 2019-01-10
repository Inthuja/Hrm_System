package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.WelfareEventDto;
import com.sgic.hrm.commons.entity.WelfareEvent;
import com.sgic.hrm.commons.entity.WelfareType;

public class WelfareEventDtoToWelfareEvent {
	public static WelfareEvent WelfareEventDtoToWelfareEvent(WelfareEventDto welfareEventDto) {
		WelfareEvent welfareEvent = new WelfareEvent();
		
			if (welfareEventDto != null) {
				welfareEvent.setId(welfareEventDto.getId());
				welfareEvent.setWelfareTypeId(welfareEventDto.getWelfareTypeId());
				welfareEvent.setWelfareName(welfareEventDto.getWelfareName());
				welfareEvent.setWelfareBudget(welfareEventDto.getWelfareBudget());
				welfareEvent.setPromoteDate(welfareEventDto.getPromoteDate());
				welfareEvent.setStatus(welfareEventDto.getStatus());
			}

			return welfareEvent;             

		
	}
	
	
	  public static List<WelfareEvent> mapToPromotionDataList(
	      List<WelfareEventDto> welfareEventList) {
	    List<WelfareEvent> promotion = new ArrayList<WelfareEvent>();

	    if (welfareEventList != null) {
	      for (WelfareEventDto welfareEventData :welfareEventList) {
	        promotion.add(WelfareEventDtoToWelfareEvent(welfareEventData));
	      }
	    }
	    return promotion;
	  }

}
