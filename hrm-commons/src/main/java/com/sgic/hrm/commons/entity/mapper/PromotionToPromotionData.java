package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.PromotionData;
import com.sgic.hrm.commons.entity.Promotion;

public class PromotionToPromotionData {
	
	public static PromotionData mapToPromotionData(Promotion promotion) {
		PromotionData promotionData = new PromotionData();
		if (promotion != null) {
			promotionData.setId(promotion.getId());
			promotionData.setPromotedBy(promotion.getPromotedBy());
			promotionData.setUsertId(UserMapper.userMapper(promotion.getUserId()));
			promotionData.setDesignationId(DesignationMapper.designationMapper(promotion.getDesignationId()));
			promotionData.setPromotedDate(promotion.getPromotedDate());
			promotionData.setRemark(promotion.getRemark());
			promotionData.setSalary(promotion.getSalary());
		}
		return promotionData;
	}

	public static List<PromotionData> mapToPromotionDataList(List<Promotion> promotionList) {
		List<PromotionData> promotionDataList = new ArrayList<PromotionData>();

		if (promotionList != null) {
			for (Promotion promotion : promotionList) {
				promotionDataList.add(mapToPromotionData(promotion));
			}
		}
		return promotionDataList;
	}
	

}
