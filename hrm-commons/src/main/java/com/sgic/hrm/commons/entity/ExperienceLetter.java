package com.sgic.hrm.commons.entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "experience_letter", schema = "employee")
public class ExperienceLetter implements Serializable{

  private static final long serialVersionUID = -8770494512619781909L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id;
    
    @OneToOne
    @JoinColumn(name="user_id")
    User user;
    
    @OneToOne
    @JoinColumn(name="request_experience_letter_id")
    RequestExperienceLetter requestExperienceLetter;
    String experienceLetterPath;
    LocalDate createdAt;
    String status;
     
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
    public RequestExperienceLetter getRequestExperienceLetter() {
      return requestExperienceLetter;
    }
    public void setRequestExperienceLetter(RequestExperienceLetter requestExperienceLetter) {
      this.requestExperienceLetter = requestExperienceLetter;
    }
    public String getExperienceLetterPath() {
      return experienceLetterPath;
    }
    public void setExperienceLetterPath(String experienceLetterPath) {
      this.experienceLetterPath = experienceLetterPath;
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