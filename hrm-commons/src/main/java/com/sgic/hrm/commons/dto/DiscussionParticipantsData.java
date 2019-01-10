package com.sgic.hrm.commons.dto;

public class DiscussionParticipantsData {
  Integer id;
  UserData participant;
  DiscussionScheduleData discussionSchedule;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserData getParticipant() {
    return participant;
  }

  public void setParticipant(UserData participant) {
    this.participant = participant;
  }

  public DiscussionScheduleData getDiscussionSchedule() {
    return discussionSchedule;
  }

  public void setDiscussionSchedule(DiscussionScheduleData discussionSchedule) {
    this.discussionSchedule = discussionSchedule;
  }

}
