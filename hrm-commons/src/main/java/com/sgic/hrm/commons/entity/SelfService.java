package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "self_service")
public class SelfService implements Serializable {

  private static final long serialVersionUID = 4534072616944311046L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  
  @ManyToOne
  @JoinColumn(name = "self_service_type_id")
  private SelfServiceType selfServiceType;
  
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;
  
  @ManyToOne
  @JoinColumn(name = "relevant_department_id")
  private Department relevantDepartment;
  
  @ManyToOne
  @JoinColumn(name = "relevant_individual_id")
  private User relevantIndividual;
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

  public SelfServiceType getSelfServiceType() {
    return selfServiceType;
  }

  public void setSelfServiceType(SelfServiceType selfServiceType) {
    this.selfServiceType = selfServiceType;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
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