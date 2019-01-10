package com.sgic.hrm.commons.dto;

import com.sgic.hrm.commons.enums.Status;

public class AcceptLeaveRequestData {

  private Integer id;
  private LeaveRequestData leaveRequest;
  private UserData acceptedBy;
  private Status status;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LeaveRequestData getLeaveRequest() {
    return leaveRequest;
  }

  public void setLeaveRequest(LeaveRequestData leaveRequest) {
    this.leaveRequest = leaveRequest;
  }

  public UserData getAcceptedBy() {
    return acceptedBy;
  }

  public void setAcceptedBy(UserData acceptedBy) {
    this.acceptedBy = acceptedBy;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

}
