/*
 * this dto only for GET http method with all objects
 * this dto will retrieve all foreign key related objects inside the api
 */
package com.sgic.hrm.commons.dto;

import java.time.LocalDate;
import com.sgic.hrm.commons.entity.User;

public class RequestExperienceLetterGetDto {
  private Integer id;
  private User user;
  private Integer noOfCopy;
  private String reason;
  private String competency;
  private LocalDate createdAt;
  private String status;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Integer getNoOfCopy() {
    return noOfCopy;
  }

  public void setNoOfCopy(Integer noOfCopy) {
    this.noOfCopy = noOfCopy;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public String getCompetency() {
    return competency;
  }

  public void setCompetency(String competency) {
    this.competency = competency;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


}
