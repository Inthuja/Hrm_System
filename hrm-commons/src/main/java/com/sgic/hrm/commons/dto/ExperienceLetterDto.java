package com.sgic.hrm.commons.dto;

import java.time.ZonedDateTime;

public class ExperienceLetterDto {

  private Integer id;
  private RequestExperienceLetterDto requestExperienceLetter;
  private String experienceLetterPath;
  private Integer requestCount;
  private ZonedDateTime createdAt;
  private String status;

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

  public String getExperienceLetterPath() {
    return experienceLetterPath;
  }

  public void setExperienceLetterPath(String experienceLetterPath) {
    this.experienceLetterPath = experienceLetterPath;
  }

  public Integer getRequestCount() {
    return requestCount;
  }

  public void setRequestCount(Integer requestCount) {
    this.requestCount = requestCount;
  }

  public ZonedDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(ZonedDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
