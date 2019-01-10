package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.GeneralWelfareData;
import com.sgic.hrm.commons.dto.GeneralWelfareSaveData;
import com.sgic.hrm.commons.dto.UserCareerDevelopmentPlanCompanySaveData;
import com.sgic.hrm.commons.entity.CareerDevelopmentPlan;
import com.sgic.hrm.commons.entity.GeneralWelfare;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.UserCareerDevelopmentPlanCompany;
import com.sgic.hrm.commons.entity.WelfareEvent;

public class GeneralWelfareDataToGeneralWelfare {
	
	public static GeneralWelfare maptoGeneralWelfare(GeneralWelfareData generalWelfaredata) {
		GeneralWelfare generalWelfare=new GeneralWelfare();
		
		if(generalWelfaredata!=null) {
		generalWelfare.setId(generalWelfaredata.getId());
		generalWelfare.setDetails(generalWelfaredata.getDetails());
		generalWelfare.setWelfareEvent(WelfareEventDtoToWelfareEvent.WelfareEventDtoToWelfareEvent(generalWelfaredata.getWelfareEvent()));
		}
		return generalWelfare;
	}
	
	public static List<GeneralWelfare> maptoGeneralWelfareDataList(
			List<GeneralWelfareData> generalWelfareDataList){
		List<GeneralWelfare> generalWelfare=new ArrayList<GeneralWelfare>();
		
		if(generalWelfareDataList !=null) {
			for(GeneralWelfareData generalWelfareData:generalWelfareDataList) {
				generalWelfare.add(maptoGeneralWelfare(generalWelfareData));
			}
		}
		return generalWelfare;
	}
	
	 public static GeneralWelfare GeneralWelfareSaveDataMapper(GeneralWelfareSaveData generalWelfareSaveData ) {
		 GeneralWelfare generalWelfare = new GeneralWelfare();
		    WelfareEvent welfareEvent=new WelfareEvent();
		    
		    generalWelfare.setId(generalWelfareSaveData.getId());
			generalWelfare.setDetails(generalWelfareSaveData.getDetails());
			welfareEvent.setId(generalWelfareSaveData.getId());
			generalWelfare.setWelfareEvent(welfareEvent);
		    return generalWelfare;
		  }



}

