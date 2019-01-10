package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.RequestPromotionData;
import com.sgic.hrm.commons.dto.RequestPromotionSaveData;
import com.sgic.hrm.commons.entity.Designation;
import com.sgic.hrm.commons.entity.RequestPromotion;
import com.sgic.hrm.commons.entity.User;

public class RequestPromotionDataMapper {
	public static RequestPromotion mapToRequestPromotion(RequestPromotionData requestPromotionData) {
		RequestPromotion requestPromotion = new RequestPromotion();

		if (requestPromotionData != null) {
			requestPromotion.setId(requestPromotionData.getId());
			requestPromotion.setPromotionRemark(requestPromotionData.getPromotionRemark());
			requestPromotion.setCreatedAt(requestPromotionData.getCreatedAt());
			requestPromotion.setDesignationId(DesignationDataMapper.designationDataMapper(requestPromotionData.getDesignationId()));
			requestPromotion.setRecommendedBy(requestPromotionData.getRecommendedBy());
			requestPromotion.setUserId(UserDataMapper.userDataMapper(requestPromotionData.getUserId()));
			requestPromotion.setUpdatedAt(requestPromotionData.getCreatedAt());
			
//			vacancy.setUserid(UserDataMapper.userDataMapper(vacancyData.getUserid()));
		}
		return requestPromotion;
	}

	public static List<RequestPromotion> mapToRequestPromotionList(
			List<RequestPromotionData> requestPromotionDataList) {
		List<RequestPromotion> requestpromotionList = new ArrayList<RequestPromotion>();

		if (requestPromotionDataList != null) {
			for (RequestPromotionData requestPromotionData : requestPromotionDataList) {
				requestpromotionList.add(mapToRequestPromotion(requestPromotionData));
			}
		}
		return requestpromotionList;
	}
	
	public static RequestPromotion mapRequestPromotionSaveDataToRequestPromotion(RequestPromotionSaveData reqprosavedata) {
		RequestPromotion reqpro = new RequestPromotion();
//	    Department dep = new Department();
	    User user = new User();
	    Designation desig = new Designation();
	    
	    reqpro.setId(reqprosavedata.getId());
	    
	    user.setId(reqprosavedata.getUserId());
	    reqpro.setUserId(user);
	    
	    reqpro.setPromotionRemark(reqprosavedata.getPromotionRemark());
	    
	    desig.setId(reqprosavedata.getDesignationId());
	    reqpro.setDesignationId(desig);
	    
	    reqpro.setRecommendedBy(reqprosavedata.getRecommendedBy());
	   
	    reqpro.setUpdatedAt(reqpro.getCreatedAt());
	    reqpro.setCreatedAt(reqpro.getCreatedAt());
	    
	    return reqpro;
	  }
}