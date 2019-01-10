package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.TerminationTypeData;
import com.sgic.hrm.commons.entity.TerminationType;

public class TerminationTypeToTerminationTypeData {

  public static TerminationTypeData mapToTerminationTypeData(TerminationType terminationType) {
    TerminationTypeData terminationTypeData = new TerminationTypeData();
    if (terminationType != null) {
      terminationTypeData.setId(terminationType.getId());
      terminationTypeData.setTerminationType(terminationType.getTerminationTypeValue());

    }
    return terminationTypeData;
  }

  public static List<TerminationTypeData> mapToTerminationTypeDataList(
      List<TerminationType> terminationTypeList) {
    List<TerminationTypeData> terminationTypeData = new ArrayList<TerminationTypeData>();

    if (terminationTypeList != null) {
      for (TerminationType terminationType : terminationTypeList) {
        terminationTypeData.add(mapToTerminationTypeData(terminationType));
      }
    }
    return terminationTypeData;
  }
}
