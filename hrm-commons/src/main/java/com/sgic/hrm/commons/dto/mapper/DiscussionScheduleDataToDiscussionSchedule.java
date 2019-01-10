package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.DiscussionScheduleData;
import com.sgic.hrm.commons.entity.DiscussionSchedule;

public class DiscussionScheduleDataToDiscussionSchedule {

  public static DiscussionSchedule mapToDiscussionSchedule(
      DiscussionScheduleData discussionScheduleData) {
    DiscussionSchedule discussionSchedule = new DiscussionSchedule();
    if (discussionScheduleData != null) {
      discussionSchedule.setId(discussionScheduleData.getId());
      discussionSchedule.setTime(discussionScheduleData.getTime());
      discussionSchedule.setVenue(discussionScheduleData.getVenue());
      discussionSchedule.setTerminationRequest(TerminationRequestDataToTerminationRequest
          .mapToTerminationRequest(discussionScheduleData.getTerminationRequest()));
    }
    return discussionSchedule;
  }


  public static List<DiscussionSchedule> mapToDiscussionScheduleList(
      List<DiscussionScheduleData> discussionScheduletDataList) {
    List<DiscussionSchedule> discussionSchedule = new ArrayList<DiscussionSchedule>();

    if (discussionScheduletDataList != null) {
      for (DiscussionScheduleData discussionScheduleData : discussionScheduletDataList) {
        discussionSchedule.add(mapToDiscussionSchedule(discussionScheduleData));
      }
    }
    return discussionSchedule;
  }
}
