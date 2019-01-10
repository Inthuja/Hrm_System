package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.WelfareTypeDto;
import com.sgic.hrm.commons.entity.WelfareType;

public class WelfareTypeToWelfareTypeDto {
	private WelfareTypeToWelfareTypeDto() {}
	
	
	public static WelfareTypeDto WelfareTypeToWelfareTypeDto(WelfareType welfareType) {
		WelfareTypeDto welfareTypeDto =new WelfareTypeDto();
		
			if (welfareType != null) {
				welfareTypeDto.setId(welfareType.getId());
				welfareTypeDto.setWelfareTypeName(welfareType.getWelfareTypeName());

			}

			return welfareTypeDto;
		
	}
	public static List<WelfareTypeDto> WelfareTypeToWelfareTypeDto(List<WelfareType> welfareType) {
		List<WelfareTypeDto> welfareTypeList = new ArrayList<WelfareTypeDto>();

		if (welfareType != null) {
			for (WelfareType welfare : welfareType) {
				welfareTypeList.add(WelfareTypeToWelfareTypeDto(welfare));
			}
		}
		return welfareTypeList;
	}

}
