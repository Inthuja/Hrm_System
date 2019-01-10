package com.sgic.hrm.commons.dto;

public class UserCareerDevelopmentPlanSelfData {

  Integer id;
  CareerDevelopmentPlanData cdpId;
  UserData userId;
  String status;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CareerDevelopmentPlanData getCdpId() {
    return cdpId;
  }

  public void setCdpId(CareerDevelopmentPlanData cdpId) {
    this.cdpId = cdpId;
  }

  public UserData getUserId() {
    return userId;
  }

  public void setUserId(UserData userId) {
    this.userId = userId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
