package com.sgic.hrm.commons.dto;

public class RejectExperienceLetterDto {

  private Integer id;
  private RequestExperienceLetterDto requestExperienceLetter;
  private String rejectReason;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RequestExperienceLetterDto getRequestExperienceLetter() {
    return requestExperienceLetter;
  }

  public void setRequestExperienceLetter(RequestExperienceLetterDto requestExperienceLetter) {
    this.requestExperienceLetter = requestExperienceLetter;
  }

  public String getRejectReason() {
    return rejectReason;
  }

  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }
}
