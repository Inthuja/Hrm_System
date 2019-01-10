package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TerminationType", schema = "employee")
public class TerminationType implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 8312006920751044906L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer id;

  @Column(name = "termination_type_value")
  String terminationTypeValue;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTerminationTypeValue() {
    return terminationTypeValue;
  }

  public void setTerminationTypeValue(String terminationTypeValue) {
    this.terminationTypeValue = terminationTypeValue;
  }

}
