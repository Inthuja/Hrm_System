package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.IndividualWelfareData;
import com.sgic.hrm.commons.entity.IndividualWelfare;

public class IndividualWelfareToIndividualWelfareData {
	
	public static IndividualWelfareData maptoIndividualWelfareData
	(IndividualWelfare individualWelfare) {
		IndividualWelfareData individualWelfareData=new IndividualWelfareData();
		
		if(individualWelfare!=null) {
		individualWelfareData.setId(individualWelfare.getId());
		individualWelfareData.setAmount(individualWelfare.getAmount());
		individualWelfareData.setDate(individualWelfare.getDate());
		individualWelfareData.setUser(UserToUserData.mapToUserData(individualWelfare.getUser()));
		
		individualWelfareData.setWelfareEvent(WelfareEventToWelfareEventDto.WelfareEventToWelfareEventDto(individualWelfare.getWelfareEvent()));
		}
		
		return individualWelfareData;

	}

	public static List<IndividualWelfareData> maptoIndividualWelfareList(
			List<IndividualWelfare> individualWelfareList){
		List<IndividualWelfareData> individualWelfareData =new ArrayList<IndividualWelfareData>();
		if (individualWelfareList != null) {
			for(IndividualWelfare individualWelfare :individualWelfareList) {
				individualWelfareData.add(maptoIndividualWelfareData(individualWelfare));
			}
		}
		return individualWelfareData;
	}
	}

