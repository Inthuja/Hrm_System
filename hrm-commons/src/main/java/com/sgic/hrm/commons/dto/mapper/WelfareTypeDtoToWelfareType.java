package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.WelfareTypeDto;
import com.sgic.hrm.commons.entity.WelfareType;

public class WelfareTypeDtoToWelfareType {
	
	public static WelfareType WelfareTypeDtoToWelfareType(WelfareTypeDto welfareTypeDto) {
		WelfareType welfareType = new WelfareType();
		
			if (welfareTypeDto != null) {
				welfareType.setId(welfareTypeDto.getId());
				welfareType.setWelfareTypeName(welfareTypeDto.getWelfareTypeName());

			}

			return welfareType;
		
	}
	
	
	  public static List<WelfareType> mapToPromotionDataList(
	      List<WelfareTypeDto> welfareList) {
	    List<WelfareType> promotion = new ArrayList<WelfareType>();

	    if (welfareList != null) {
	      for (WelfareTypeDto welfaretypeData :welfareList) {
	        promotion.add(WelfareTypeDtoToWelfareType(welfaretypeData));
	      }
	    }
	    return promotion;
	  }
}
