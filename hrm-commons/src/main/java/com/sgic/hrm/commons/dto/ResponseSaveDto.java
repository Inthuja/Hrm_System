package com.sgic.hrm.commons.dto;

import java.time.LocalDate;

public class ResponseSaveDto {
  private Integer id;
  private Integer selfService;
  private Integer relevantDepartment;
  private Integer relevantIndividual;
  private String responseMessage;
  private String attachment;
  private LocalDate createdAt;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getSelfService() {
    return selfService;
  }

  public void setSelfService(Integer selfService) {
    this.selfService = selfService;
  }

  public Integer getRelevantDepartment() {
    return relevantDepartment;
  }

  public void setRelevantDepartment(Integer relevantDepartment) {
    this.relevantDepartment = relevantDepartment;
  }

  public Integer getRelevantIndividual() {
    return relevantIndividual;
  }

  public void setRelevantIndividual(Integer relevantIndividual) {
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
