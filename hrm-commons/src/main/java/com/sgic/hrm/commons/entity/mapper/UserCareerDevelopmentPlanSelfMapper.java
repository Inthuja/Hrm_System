package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.UserCareerDevelopmentPlanSelfData;
import com.sgic.hrm.commons.entity.UserCareerDevelopmentPlanSelf;

public class UserCareerDevelopmentPlanSelfMapper {

  public static UserCareerDevelopmentPlanSelfData userCareerDevelopmentPlanSelfMapper(UserCareerDevelopmentPlanSelf userCareerDevelopmentPlanSelf) {
    UserCareerDevelopmentPlanSelfData userCareerDevelopmentPlanSelfData  = new UserCareerDevelopmentPlanSelfData();

    if (userCareerDevelopmentPlanSelf != null) {
      userCareerDevelopmentPlanSelfData.setId(userCareerDevelopmentPlanSelf.getId());
      userCareerDevelopmentPlanSelfData.setUserId(UserMapper.userMapper(userCareerDevelopmentPlanSelf.getUserId()));
      userCareerDevelopmentPlanSelfData.setCdpId(CareerDevelopmentPlanMapper.careerDevelopmentPlanDataMapper(userCareerDevelopmentPlanSelf.getCdpId()));
      return userCareerDevelopmentPlanSelfData;
    }
    return null;
  }

}
