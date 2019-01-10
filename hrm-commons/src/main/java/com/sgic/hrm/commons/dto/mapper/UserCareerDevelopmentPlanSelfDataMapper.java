package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.UserCareerDevelopmentPlanSelfData;
import com.sgic.hrm.commons.entity.UserCareerDevelopmentPlanSelf;

public class UserCareerDevelopmentPlanSelfDataMapper {
	
  private UserCareerDevelopmentPlanSelfDataMapper() {}
  
  public static UserCareerDevelopmentPlanSelf userCareerDevelopmentSelfDataMapper(UserCareerDevelopmentPlanSelfData userCareerDevelopmentSelfData) {
    UserCareerDevelopmentPlanSelf userCareerDevelopmentSelf = new UserCareerDevelopmentPlanSelf();

      userCareerDevelopmentSelf.setId(userCareerDevelopmentSelfData.getId());
      userCareerDevelopmentSelf.setUserId(UserDataMapper.userDataMapper(userCareerDevelopmentSelfData.getUserId()));
      userCareerDevelopmentSelf.setCdpId(CareerDevelopmentPlanDataMapper.careerDevelopmentPlanDataMapper(userCareerDevelopmentSelfData.getCdpId()));
      userCareerDevelopmentSelf.setStatus(userCareerDevelopmentSelfData.getStatus());
      return userCareerDevelopmentSelf;
  }
	

}
