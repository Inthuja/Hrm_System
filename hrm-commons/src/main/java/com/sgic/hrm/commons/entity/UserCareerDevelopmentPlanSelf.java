package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema="employee", name="UserCareerDevelopmentPlanSelf")
public class UserCareerDevelopmentPlanSelf implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1917334021724684496L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @ManyToOne
  @JoinColumn(name = "cdp_Id")
  private CareerDevelopmentPlan cdpId;

  @ManyToOne
  @JoinColumn(name = "user_Id")
  private User userId;
  private String status;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CareerDevelopmentPlan getCdpId() {
    return cdpId;
  }

  public void setCdpId(CareerDevelopmentPlan cdpId) {
    this.cdpId = cdpId;
  }

  public User getUserId() {
    return userId;
  }

  public void setUserId(User userId) {
    this.userId = userId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
