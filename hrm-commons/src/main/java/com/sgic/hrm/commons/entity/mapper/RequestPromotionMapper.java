package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.RequestPromotionData;
import com.sgic.hrm.commons.entity.RequestPromotion;

public class RequestPromotionMapper {
	public static RequestPromotionData mapToRequestPromotionData(RequestPromotion requestPromotion) {
		RequestPromotionData requestPromotionData = new RequestPromotionData();

	    if (requestPromotion != null) {
	    	requestPromotionData.setId(requestPromotion.getId());
	    	requestPromotionData.setPromotionRemark(requestPromotion.getPromotionRemark());
	    	requestPromotionData.setCreatedAt(requestPromotion.getCreatedAt());
	    	requestPromotionData.setDesignationId(DesignationMapper.designationMapper(requestPromotion.getDesignationId()));
	    	requestPromotionData.setUserId(UserMapper.userMapper(requestPromotion.getUserId()));
	    	requestPromotionData.setRecommendedBy(requestPromotion.getRecommendedBy());
	    	requestPromotionData.setUpdatedAt(requestPromotion.getUpdatedAt());
	    	
	    	
			
	    }
	    return requestPromotionData;
	  }

	  public static List<RequestPromotionData> mapToRequestPromotionDataList(List<RequestPromotion> requestPromotionList) {
	    List<RequestPromotionData> requestPromotionDataList = new ArrayList<RequestPromotionData>();

	    if (requestPromotionList != null) {
	      for (RequestPromotion requestPromotion : requestPromotionList) {
	    	  requestPromotionDataList.add(mapToRequestPromotionData(requestPromotion));
	      }
	    }
	    return requestPromotionDataList;
	  }

	}