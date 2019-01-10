package com.sgic.hrm.commons.dto;


import java.util.Date;
import java.util.List;

public class DiscussionScheduleData {
  Integer id;
  TerminationRequestData terminationRequest;
  Date time;
  String venue;
  List<DiscussionParticipantsData> discussionParticipants;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TerminationRequestData getTerminationRequest() {
    return terminationRequest;
  }

  public void setTerminationRequest(TerminationRequestData terminationRequest) {
    this.terminationRequest = terminationRequest;
  }

  

  public Date getTime() {
	return time;
}

public void setTime(Date time) {
	this.time = time;
}

public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

public List<DiscussionParticipantsData> getDiscussionParticipants() {
	return discussionParticipants;
}

public void setDiscussionParticipants(List<DiscussionParticipantsData> discussionParticipants) {
	this.discussionParticipants = discussionParticipants;
}
  

}
