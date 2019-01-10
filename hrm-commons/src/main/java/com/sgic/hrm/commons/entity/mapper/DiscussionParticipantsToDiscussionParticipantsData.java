package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.DiscussionParticipantsData;
import com.sgic.hrm.commons.entity.DiscussionParticipants;

public class DiscussionParticipantsToDiscussionParticipantsData {

  public static DiscussionParticipantsData mapToDiscussionPaticipantsData(
      DiscussionParticipants discussionParticipants) {
    DiscussionParticipantsData discussionParticipantsData = new DiscussionParticipantsData();
    if (discussionParticipants != null) {
      discussionParticipantsData.setId(discussionParticipants.getId());
      discussionParticipantsData
          .setParticipant(UserToUserData.mapToUserData(discussionParticipants.getParticipant()));
      discussionParticipantsData.setDiscussionSchedule(DiscussionScheduleToDiscussionScheduleData
          .mapToDiscussionScheduleData(discussionParticipants.getDiscussionSchedule()));
    }
    return discussionParticipantsData;
  }

  public static List<DiscussionParticipantsData> mapToDiscussionParticipantsDataList(
      List<DiscussionParticipants> discussionParticipantsList) {
    List<DiscussionParticipantsData> discussionParticipantsDataList =
        new ArrayList<DiscussionParticipantsData>();

    if (discussionParticipantsDataList != null) {
      for (DiscussionParticipants discussionParticipants : discussionParticipantsList) {
        discussionParticipantsDataList.add(mapToDiscussionPaticipantsData(discussionParticipants));
      }
    }
    return discussionParticipantsDataList;
  }

}
