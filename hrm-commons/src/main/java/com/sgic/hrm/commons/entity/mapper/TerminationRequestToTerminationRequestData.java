package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.TerminationRequestData;
import com.sgic.hrm.commons.entity.TerminationRequest;

public class TerminationRequestToTerminationRequestData {

  public static TerminationRequestData mapToTerminationRequestData(
      TerminationRequest terminationRequest) {
    TerminationRequestData terminationRequestData = new TerminationRequestData();
    if (terminationRequest != null) {
      terminationRequestData.setId(terminationRequest.getId());
      terminationRequestData.setStatus(terminationRequest.getStatus());
      terminationRequestData.setPlanedLeavingDate(terminationRequest.getPlanedLeavingDate());
      terminationRequestData.setReason(terminationRequest.getReason());
      terminationRequestData.setResignationLetter(terminationRequest.getResignationLetter());
      terminationRequestData
          .setEmployee(UserToUserData.mapToUserData(terminationRequest.getEmployee()));
      terminationRequestData.setTerminationType(TerminationTypeToTerminationTypeData
          .mapToTerminationTypeData(terminationRequest.getTerminationType()));
    }
    return terminationRequestData;
  }

  public static List<TerminationRequestData> mapToTerminationRequestDataList(
      List<TerminationRequest> terminationRequestList) {
    List<TerminationRequestData> terminationRequestData = new ArrayList<TerminationRequestData>();

    if (terminationRequestList != null) {
      for (TerminationRequest terminationRequest : terminationRequestList) {
        terminationRequestData.add(mapToTerminationRequestData(terminationRequest));
      }
    }
    return terminationRequestData;
  }
}
