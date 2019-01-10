package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.GeneralWelfareData;
import com.sgic.hrm.commons.entity.GeneralWelfare;

public class GeneralWelfareToGneralWelfareData {

	
	public static GeneralWelfareData maptoGeneralWelfareData(
			GeneralWelfare generalWelfare) {
		GeneralWelfareData generalWelfareData=new GeneralWelfareData();
		
		if(generalWelfare!=null) {
		generalWelfareData.setId(generalWelfareData.getId());
		generalWelfareData.setDetails(generalWelfareData.getDetails());
		generalWelfareData.setWelfareEvent(WelfareEventToWelfareEventDto.WelfareEventToWelfareEventDto(generalWelfare.getWelfareEvent()));
		}
		return generalWelfareData;
	}
	
	public static List<GeneralWelfareData> maptoGeneralWelfareDataList(
			List<GeneralWelfare> generalWelfareList){
		List<GeneralWelfareData> generalWelfaredata=new ArrayList<GeneralWelfareData>();
		
		if(generalWelfareList !=null) {
			for(GeneralWelfare generalWelfare:generalWelfareList) {
				generalWelfaredata.add(maptoGeneralWelfareData(generalWelfare));
			}
		}
		return generalWelfaredata;
	}

}