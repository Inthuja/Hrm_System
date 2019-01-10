package com.sgic.hrm.commons.entity;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "termination_record",schema = "employee")
public class TerminationRecord implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 6289744971837349356L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  Date  dateOfTermination;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "employee_id")
  User employee;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "termination_type_id")
  TerminationType terminationType;

  @Column(name = "cause_of_termination")
  String causeOfTermination;

  @Column(name = "deciplinary_procedures")
  String disciplinaryProcedures;

  @Column(name = "legal_status")
  String legalStatus;

  @Column(name = "exit_intrview")
  File exitInterview;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
  
  

  public Date getDateOfTermination() {
	return dateOfTermination;
}

  public void setDateOfTermination(Date dateOfTermination) {
	this.dateOfTermination = dateOfTermination;
}

  public User getEmployee() {
    return employee;
  }

  public void setEmployee(User employee) {
    this.employee = employee;
  }

  public TerminationType getTerminationType() {
    return terminationType;
  }

  public void setTerminationType(TerminationType terminationType) {
    this.terminationType = terminationType;
  }

  public String getCauseOfTermination() {
    return causeOfTermination;
  }

  public void setCauseOfTermination(String causeOfTermination) {
    this.causeOfTermination = causeOfTermination;
  }

  public String getDisciplinaryProcedures() {
    return disciplinaryProcedures;
  }

  public void setDisciplinaryProcedures(String disciplinaryProcedures) {
    this.disciplinaryProcedures = disciplinaryProcedures;
  }

  public String getLegalStatus() {
    return legalStatus;
  }

  public void setLegalStatus(String legalStatus) {
    this.legalStatus = legalStatus;
  }

  public File getExitInterview() {
    return exitInterview;
  }

  public void setExitInterview(File exitInterview) {
    this.exitInterview = exitInterview;
  }

}
