package com.sgic.hrm.commons.dto;

import java.io.File;
import java.time.ZonedDateTime;
import java.util.Date;
import com.sgic.hrm.commons.enums.Status;

public class LeaveRequestData {

  private Integer id;
  private UserData user;
  private LeaveTypeData leaveType;
  private Date startDate;
  private Date endDate;
  private Double noOfDays;
  private String reason;
  private File attachment;
  private Status status;
  private ZonedDateTime createdAt;
  private ZonedDateTime updatedAt;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserData getUser() {
    return user;
  }

  public void setUser(UserData user) {
    this.user = user;
  }

  public LeaveTypeData getLeaveType() {
    return leaveType;
  }

  public void setLeaveType(LeaveTypeData leaveType) {
    this.leaveType = leaveType;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public File getAttachment() {
    return attachment;
  }

  public void setAttachment(File attachment) {
    this.attachment = attachment;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public ZonedDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(ZonedDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Double getNoOfDays() {
    return noOfDays;
  }

  public void setNoOfDays(Double noOfDays) {
    this.noOfDays = noOfDays;
  }
}
