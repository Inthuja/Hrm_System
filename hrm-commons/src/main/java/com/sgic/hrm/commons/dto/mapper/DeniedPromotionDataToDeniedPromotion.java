package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.DeniedPromotionData;
import com.sgic.hrm.commons.entity.DeniedPromotion;


public class DeniedPromotionDataToDeniedPromotion {
	
	public static DeniedPromotion mapToDeniedPromotion(DeniedPromotionData deniedPromotionData) {
		DeniedPromotion deniedPromotion = new DeniedPromotion();
		if (deniedPromotionData != null) {
			deniedPromotion.setId(deniedPromotionData.getId());
			deniedPromotion.setUserId(UserDataMapper.userDataMapper(deniedPromotionData.getUserId()));
			deniedPromotion.setDeniedDate(deniedPromotionData.getDeniedDate());
			deniedPromotion.setDeniedRemark(deniedPromotionData.getDeniedRemark());
			deniedPromotion.setDeniedBy(deniedPromotionData.getDeniedBy());
			deniedPromotion.setDesinationId(DesignationDataMapper.designationDataMapper(deniedPromotionData.getDesinationId()));
			
		}
		return deniedPromotion;
	}
	
	
//	public static DeniedPromotion mapToDeniedPromotionSave(DeniedPromotionSaveData deniedPromotionSaveData) {
//		DeniedPromotion deniedPromotion = new DeniedPromotion();
//		User user =new User();
//		Designation designation=new Designation();
//		
//		if (deniedPromotionSaveData != null) {
//			deniedPromotion.setId(deniedPromotionSaveData.getId());
//			
//			user.setId(deniedPromotionSaveData.getUserId());
//			deniedPromotion.setUserId(user);
//			
//			deniedPromotion.setDeniedDate(deniedPromotionSaveData.getDeniedDate());
//			deniedPromotion.setDeniedRemark(deniedPromotionSaveData.getDeniedRemark());
//			deniedPromotion.setDeniedBy(deniedPromotionSaveData.getDeniedBy());
//			
//			designation.setId(deniedPromotionSaveData.getDesinationId());
//			deniedPromotion.setDesinationId(designation);
//			
//		}
//		return deniedPromotion;
//	}

	public static List<DeniedPromotion> mapDeniedPromotionDataList(List<DeniedPromotionData> deniedPromotionDataList) {
		List<DeniedPromotion> deniedpromotion = new ArrayList<DeniedPromotion>();

		if (deniedPromotionDataList != null) {
			for (DeniedPromotionData deniedPromotionData : deniedPromotionDataList) {
				deniedpromotion.add(mapToDeniedPromotion(deniedPromotionData));
		      }
		    }
		    return deniedpromotion;
	}

}
