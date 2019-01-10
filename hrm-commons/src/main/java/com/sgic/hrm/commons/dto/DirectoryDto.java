package com.sgic.hrm.commons.dto;

import java.sql.Date;

public class DirectoryDto {
  private Integer userId;
  private String fullName;
  private String contact;
  private String email;
  private String permenentAddress;
  private String designation;
  private Date appointmentDate;
  private Integer servicePeriod;

  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Date getAppointmentDate() {
    return appointmentDate;
  }

  public void setAppointmentDate(Date appointmentDate) {
    this.appointmentDate = appointmentDate;
  }

  public Integer getServicePeriod() {
    return servicePeriod;
  }

  public void setServicePeriod(Integer servicePeriod) {
    this.servicePeriod = servicePeriod;
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getEmail() {
    return email;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPermenentAddress() {
    return permenentAddress;
  }

  public void setPermenentAddress(String permenentAddress) {
    this.permenentAddress = permenentAddress;
  }

}
