package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reject_experience_letter_request", schema = "employee")
public class RejectExperienceLetterRequest implements Serializable{

  private static final long serialVersionUID = 4760666211280933328L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
    
    @OneToOne
    @JoinColumn(name="request_experience_letter_id")
    RequestExperienceLetter requestExperienceLetter; 
    String rejectReason;
    
    public Integer getId() {
      return id;
    }
    public void setId(Integer id) {
      this.id = id;
    }
    public RequestExperienceLetter getRequestExperienceLetter() {
      return requestExperienceLetter;
    }
    public void setRequestExperienceLetter(RequestExperienceLetter requestExperienceLetter) {
      this.requestExperienceLetter = requestExperienceLetter;
    }
    public String getRejectReason() {
      return rejectReason;
    }
    public void setRejectReason(String rejectReason) {
      this.rejectReason = rejectReason;
    }   
    
}