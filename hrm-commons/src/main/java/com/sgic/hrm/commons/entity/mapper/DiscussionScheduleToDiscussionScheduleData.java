package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.DiscussionScheduleData;
import com.sgic.hrm.commons.entity.DiscussionSchedule;

public class DiscussionScheduleToDiscussionScheduleData {

  public static DiscussionScheduleData mapToDiscussionScheduleData(
      DiscussionSchedule discussionSchedule) {
    DiscussionScheduleData discussionScheduleData = new DiscussionScheduleData();
    if (discussionSchedule != null) {
      discussionScheduleData.setId(discussionSchedule.getId());
      discussionScheduleData.setTime(discussionSchedule.getTime());
      discussionScheduleData.setVenue(discussionSchedule.getVenue());
      discussionScheduleData.setTerminationRequest(TerminationRequestToTerminationRequestData
          .mapToTerminationRequestData(discussionSchedule.getTerminationRequest()));
    }
    return discussionScheduleData;
  }

  public static List<DiscussionScheduleData> mapToDiscussionScheduleDataList(
      List<DiscussionSchedule> discussionScheduleList) {
    List<DiscussionScheduleData> discussionScheduleDataList =
        new ArrayList<DiscussionScheduleData>();

    if (discussionScheduleList != null) {
      for (DiscussionSchedule discussionSchedule : discussionScheduleList) {
        discussionScheduleDataList.add(mapToDiscussionScheduleData(discussionSchedule));
      }
    }
    return discussionScheduleDataList;
  }
}
