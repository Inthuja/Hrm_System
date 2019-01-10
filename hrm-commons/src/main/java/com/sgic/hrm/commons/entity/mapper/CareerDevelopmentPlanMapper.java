package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.CareerDevelopmentPlanData;
import com.sgic.hrm.commons.entity.CareerDevelopmentPlan;

public class CareerDevelopmentPlanMapper {
	
	public static CareerDevelopmentPlanData careerDevelopmentPlanDataMapper(CareerDevelopmentPlan careerDevelopmentPlan) {
		CareerDevelopmentPlanData careerDevelopmentPlanData = new CareerDevelopmentPlanData();

		if (careerDevelopmentPlan != null) {
			careerDevelopmentPlanData.setId(careerDevelopmentPlan.getId());
			careerDevelopmentPlanData.setName(careerDevelopmentPlan.getName());
			return careerDevelopmentPlanData;
		}
		return null;
	}	

}
