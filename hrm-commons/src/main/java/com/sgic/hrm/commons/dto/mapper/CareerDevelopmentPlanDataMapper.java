package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.CareerDevelopmentPlanData;
import com.sgic.hrm.commons.entity.CareerDevelopmentPlan;


public class CareerDevelopmentPlanDataMapper {
	
	private CareerDevelopmentPlanDataMapper() {}
	
	public static CareerDevelopmentPlan careerDevelopmentPlanDataMapper(CareerDevelopmentPlanData careerDevelopmentPlanData) {
		CareerDevelopmentPlan careerDevelopmentPlan = new CareerDevelopmentPlan();

		careerDevelopmentPlan.setId(careerDevelopmentPlanData.getId());
		careerDevelopmentPlan.setName(careerDevelopmentPlanData.getName());
		return careerDevelopmentPlan;
	}
}
