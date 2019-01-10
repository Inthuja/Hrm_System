package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.DiscussionParticipantsData;
import com.sgic.hrm.commons.dto.DiscussionScheduleData;
import com.sgic.hrm.commons.entity.DiscussionParticipants;

public class DiscussionParticipantsDataToDiscussionParticipants {

  public static DiscussionParticipants mapToDiscussionPaticipants(
      DiscussionParticipantsData discussionParticipantsData) {
    DiscussionParticipants discussionParticipants = new DiscussionParticipants();
    if (discussionParticipantsData != null) {
      discussionParticipants.setId(discussionParticipantsData.getId());
      discussionParticipants
          .setParticipant(UserDataToUser.mapToUser(discussionParticipantsData.getParticipant()));
      discussionParticipants.setDiscussionSchedule(DiscussionScheduleDataToDiscussionSchedule
          .mapToDiscussionSchedule(discussionParticipantsData.getDiscussionSchedule()));
    }
    return discussionParticipants;
  }

  public static List<DiscussionParticipants> mapToDiscussionParticipantsList(DiscussionScheduleData discussionScheduleData ) {
    List<DiscussionParticipants> discussionParticipants = new ArrayList<DiscussionParticipants>();

    if (discussionScheduleData.getDiscussionParticipants() != null) {
      for (DiscussionParticipantsData discussionParticipantsData : discussionScheduleData.getDiscussionParticipants()) {
        discussionParticipants.add(mapToDiscussionPaticipants(discussionParticipantsData));
      }
    }
    return discussionParticipants;
  }
}
