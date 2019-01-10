package com.sgic.hrm.commons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sgic.hrm.commons.entity.UserCareerDevelopmentPlanCompany;

public interface UserCareerDevelopmentPlanCompanyRepository extends JpaRepository<UserCareerDevelopmentPlanCompany, Integer>{
  
   UserCareerDevelopmentPlanCompany findById(int id);
}
