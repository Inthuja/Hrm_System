package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.TerminationRequestData;
import com.sgic.hrm.commons.entity.TerminationRequest;

public class TerminationRequestDataToTerminationRequest {

  public static TerminationRequest mapToTerminationRequest(
      TerminationRequestData terminationRequestData) {
    TerminationRequest terminationRequest = new TerminationRequest();
    if (terminationRequestData != null) {
      terminationRequest.setId(terminationRequestData.getId());
      terminationRequest.setStatus(terminationRequestData.getStatus());
      terminationRequest.setPlanedLeavingDate(terminationRequestData.getPlanedLeavingDate());
      terminationRequest.setReason(terminationRequestData.getReason());
      terminationRequest.setResignationLetter(terminationRequestData.getResignationLetter());
      terminationRequest
          .setEmployee(UserDataToUser.mapToUser(terminationRequestData.getEmployee()));
      terminationRequest.setTerminationType(TerminationTypeDataToTerminationType
          .mapToTerminationType(terminationRequestData.getTerminationType()));
      return terminationRequest;
    }
    return null;
  }

  public static List<TerminationRequest> mapToTerminationRequestList(
      List<TerminationRequestData> terminationRequestDataList) {
    List<TerminationRequest> terminationRequest = new ArrayList<TerminationRequest>();

    if (terminationRequestDataList != null) {
      for (TerminationRequestData terminationRequestData : terminationRequestDataList) {
        terminationRequest.add(mapToTerminationRequest(terminationRequestData));
      }
    }
    return terminationRequest;
  }
}
