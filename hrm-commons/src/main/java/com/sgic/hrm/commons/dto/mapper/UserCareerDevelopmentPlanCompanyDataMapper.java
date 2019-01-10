package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.UserCareerDevelopmentPlanCompanyData;
import com.sgic.hrm.commons.dto.UserCareerDevelopmentPlanCompanySaveData;
import com.sgic.hrm.commons.entity.CareerDevelopmentPlan;
import com.sgic.hrm.commons.entity.User;
import com.sgic.hrm.commons.entity.UserCareerDevelopmentPlanCompany;

public class UserCareerDevelopmentPlanCompanyDataMapper {
  
private UserCareerDevelopmentPlanCompanyDataMapper() {}
  
  public static UserCareerDevelopmentPlanCompany userCareerDevelopmentPlanCompanyDataMapper(UserCareerDevelopmentPlanCompanyData userCareerDevelopmentPlanCompanyData) {
    UserCareerDevelopmentPlanCompany userCareerDevelopmentPlanCompany = new UserCareerDevelopmentPlanCompany();

    userCareerDevelopmentPlanCompany.setId(userCareerDevelopmentPlanCompanyData.getId());
    userCareerDevelopmentPlanCompany.setUserId(UserDataMapper.userDataMapper(userCareerDevelopmentPlanCompanyData.getUserId()));
    userCareerDevelopmentPlanCompany.setCdpId(CareerDevelopmentPlanDataMapper.careerDevelopmentPlanDataMapper(userCareerDevelopmentPlanCompanyData.getCdpId()));
    userCareerDevelopmentPlanCompany.setStatus(userCareerDevelopmentPlanCompanyData.getStatus());
    return userCareerDevelopmentPlanCompany;
  }

  public static UserCareerDevelopmentPlanCompany userCareerDevelopmentPlanCompanySaveDataMapper(UserCareerDevelopmentPlanCompanySaveData userCareerDevelopmentPlanCompanySaveData) {
    UserCareerDevelopmentPlanCompany userCareerDevelopmentPlanCompany = new UserCareerDevelopmentPlanCompany();
    User user=new User();
    CareerDevelopmentPlan careerDevelopmentPlan=new CareerDevelopmentPlan();
    
    userCareerDevelopmentPlanCompany.setId(userCareerDevelopmentPlanCompanySaveData.getId());
   
    user.setId(userCareerDevelopmentPlanCompanySaveData.getUserId());
    userCareerDevelopmentPlanCompany.setUserId(user);
    
    careerDevelopmentPlan.setId(userCareerDevelopmentPlanCompanySaveData.getCdpId());
    userCareerDevelopmentPlanCompany.setCdpId(careerDevelopmentPlan);
    
    userCareerDevelopmentPlanCompany.setStatus(userCareerDevelopmentPlanCompanySaveData.getStatus());
    return userCareerDevelopmentPlanCompany;
  }

}
