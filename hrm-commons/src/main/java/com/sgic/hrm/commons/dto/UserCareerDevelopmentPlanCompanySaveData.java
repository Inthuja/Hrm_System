package com.sgic.hrm.commons.dto;

public class UserCareerDevelopmentPlanCompanySaveData {

  Integer id;
  Integer cdpId;
  Integer userId;
  String status;
  
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Integer getCdpId() {
    return cdpId;
  }
  public void setCdpId(Integer cdpId) {
    this.cdpId = cdpId;
  }
  public Integer getUserId() {
    return userId;
  }
  public void setUserId(Integer userId) {
    this.userId = userId;
  }
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }
}
