package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class SelfServiceSaveDto {
  private Integer id;
  private Integer selfServiceType;
  private Integer user;
  private Integer relevantDepartment;
  private Integer relevantIndividual;
  private boolean informIndividual;
  private String description;
  private String attachment;
  private Date createdAt;
  private String status;
  private String message;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getSelfServiceType() {
    return selfServiceType;
  }

  public void setSelfServiceType(Integer selfServiceType) {
    this.selfServiceType = selfServiceType;
  }

  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
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

  public boolean isInformIndividual() {
    return informIndividual;
  }

  public void setInformIndividual(boolean informIndividual) {
    this.informIndividual = informIndividual;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAttachment() {
    return attachment;
  }

  public void setAttachment(String attachment) {
    this.attachment = attachment;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
