package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "employee", name = "self_service_type")
public class SelfServiceType implements Serializable {

  private static final long serialVersionUID = 7992601858715917117L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String selfServiceTypeName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getSelfServiceTypeName() {
    return selfServiceTypeName;
  }

  public void setSelfServiceTypeName(String selfServiceTypeName) {
    this.selfServiceTypeName = selfServiceTypeName;
  }

}
