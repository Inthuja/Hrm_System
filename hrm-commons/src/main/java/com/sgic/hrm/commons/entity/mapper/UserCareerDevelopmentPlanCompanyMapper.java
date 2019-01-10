package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.UserCareerDevelopmentPlanCompanyData;
import com.sgic.hrm.commons.entity.UserCareerDevelopmentPlanCompany;

public class UserCareerDevelopmentPlanCompanyMapper {
  
  public static UserCareerDevelopmentPlanCompanyData userCareerDevelopmentPlanCompanyMapper(UserCareerDevelopmentPlanCompany userCareerDevelopmentPlanCompany) {
    UserCareerDevelopmentPlanCompanyData userCareerDevelopmentPlanCompanyData  = new UserCareerDevelopmentPlanCompanyData();

    if (userCareerDevelopmentPlanCompany != null) {
      userCareerDevelopmentPlanCompanyData.setId(userCareerDevelopmentPlanCompany.getId());
      userCareerDevelopmentPlanCompanyData.setUserId(UserMapper.userMapper(userCareerDevelopmentPlanCompany.getUserId()));
      userCareerDevelopmentPlanCompanyData.setCdpId(CareerDevelopmentPlanMapper.careerDevelopmentPlanDataMapper(userCareerDevelopmentPlanCompany.getCdpId()));
      return userCareerDevelopmentPlanCompanyData;
    }
    return null;
  }

}
