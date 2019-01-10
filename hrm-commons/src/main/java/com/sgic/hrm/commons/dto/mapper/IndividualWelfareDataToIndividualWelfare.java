package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.IndividualWelfareData;
import com.sgic.hrm.commons.entity.IndividualWelfare;

public class IndividualWelfareDataToIndividualWelfare {
	
public static IndividualWelfare maptoIndividualWelfare(IndividualWelfareData individualWelfareData) {
	IndividualWelfare individualWelfare=new IndividualWelfare();
	
	if(individualWelfareData!=null) {
	individualWelfare.setId(individualWelfareData.getId());
	individualWelfare.setAmount(individualWelfareData.getAmount());
	individualWelfare.setDate(individualWelfareData.getDate());
	individualWelfare.setUser(UserDataToUser.mapToUser(individualWelfareData.getUser()));
	individualWelfare.setWelfareEvent(WelfareEventDtoToWelfareEvent.WelfareEventDtoToWelfareEvent(individualWelfareData.getWelfareEvent()));
	
	}
	return individualWelfare;

}

public static List<IndividualWelfare> maptoIndividualWelfareList(
		List<IndividualWelfareData> individualWelfareDataList){
	List<IndividualWelfare> individualWelfare =new ArrayList<IndividualWelfare>();
	if (individualWelfareDataList != null) {
		for(IndividualWelfareData individualWelfareData :individualWelfareDataList) {
			individualWelfare.add(maptoIndividualWelfare(individualWelfareData));
		}
	}
	return individualWelfare;
}
}