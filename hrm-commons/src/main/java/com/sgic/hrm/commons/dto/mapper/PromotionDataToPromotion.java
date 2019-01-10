package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.PromotionData;
import com.sgic.hrm.commons.dto.PromotionSaveData;
import com.sgic.hrm.commons.entity.Designation;
import com.sgic.hrm.commons.entity.Promotion;
import com.sgic.hrm.commons.entity.User;

public class PromotionDataToPromotion {
	
	public static Promotion mapToPromotion(PromotionData promotionData) {
	    Promotion promotion = new Promotion();
	    if (promotionData != null) {
	      promotion.setId(promotionData.getId());
	      promotion.setUserId(UserDataMapper.userDataMapper(promotionData.getUsertId()));
	      promotion.setDesignationId(DesignationDataMapper.designationDataMapper(promotionData.getDesignationId()));
	      promotion.setPromotedDate(promotionData.getPromotedDate());
	      promotion.setRemark(promotionData.getRemark());
	      promotion.setSalary(promotionData.getSalary());
	      promotion.setPromotedBy(promotionData.getPromotedBy());
	      
	    }
	    return promotion;
	  }

	  public static List<Promotion> mapToPromotionDataList(
	      List<PromotionData> promotionDataList) {
	    List<Promotion> promotion = new ArrayList<Promotion>();

	    if (promotionDataList != null) {
	      for (PromotionData promotionData :promotionDataList) {
	        promotion.add(mapToPromotion(promotionData));
	      }
	    }
	    return promotion;
	  }

	  public static Promotion mapPromotionSaveDataToPromotion(PromotionSaveData prosavedata) {
			Promotion pro = new Promotion();
		    User user = new User();
		    Designation desig = new Designation();
		    
		    pro.setId(prosavedata.getId());
		    
		    user.setId(prosavedata.getUserId());
		    pro.setUserId(user);
		    
		    pro.setRemark(prosavedata.getRemark());
		    
		    desig.setId(prosavedata.getDesignationId());
		    pro.setDesignationId(desig);
		    
		    pro.setPromotedBy(prosavedata.getPromotedBy());
		   
		    pro.setSalary(prosavedata.getSalary());
		    pro.setPromotedDate(prosavedata.getPromotedDate());
		    
		    return pro;
		  }
}
