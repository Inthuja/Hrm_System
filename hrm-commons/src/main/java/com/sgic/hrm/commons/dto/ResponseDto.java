package com.sgic.hrm.commons.dto;

import java.time.LocalDate;
import com.sgic.hrm.commons.entity.Department;
import com.sgic.hrm.commons.entity.SelfService;
import com.sgic.hrm.commons.entity.User;

public class ResponseDto {
  private Integer id;
  private SelfService selfService;
  private Department relevantDepartment;
  private User relevantIndividual;
  private String responseMessage;
  private String attachment;
  private LocalDate createdAt;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SelfService getSelfService() {
    return selfService;
  }

  public void setSelfService(SelfService selfService) {
    this.selfService = selfService;
  }

  public Department getRelevantDepartment() {
    return relevantDepartment;
  }

  public void setRelevantDepartment(Department relevantDepartment) {
    this.relevantDepartment = relevantDepartment;
  }

  public User getRelevantIndividual() {
    return relevantIndividual;
  }

  public void setRelevantIndividual(User relevantIndividual) {
    this.relevantIndividual = relevantIndividual;
  }

  public String getResponseMessage() {
    return responseMessage;
  }

  public void setResponseMessage(String responseMessage) {
    this.responseMessage = responseMessage;
  }

  public String getAttachment() {
    return attachment;
  }

  public void setAttachment(String attachment) {
    this.attachment = attachment;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

}
