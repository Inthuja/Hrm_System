package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.TerminationRecordData;
import com.sgic.hrm.commons.entity.TerminationRecord;

public class TerminationRecordToTerminationRecordData {

  public static TerminationRecordData mapToTerminationRecordData(
      TerminationRecord terminationRecord) {
    TerminationRecordData terminationRecordData = new TerminationRecordData();
    if (terminationRecord != null) {
      terminationRecordData.setId(terminationRecord.getId());
      terminationRecordData.setDateOfTermination(terminationRecord.getDateOfTermination());
      terminationRecordData.setCauseOfTermination(terminationRecord.getCauseOfTermination());
      terminationRecordData
          .setDisciplinaryProcedures(terminationRecord.getDisciplinaryProcedures());
      terminationRecordData.setLegalStatus(terminationRecord.getLegalStatus());
      terminationRecordData.setExitInterview(terminationRecord.getExitInterview());
      terminationRecordData
          .setEmployee(UserToUserData.mapToUserData(terminationRecord.getEmployee()));
      terminationRecordData.setTerminationType(TerminationTypeToTerminationTypeData
          .mapToTerminationTypeData(terminationRecord.getTerminationType()));
    }
    return terminationRecordData;
  }

  public static List<TerminationRecordData> mapToTerminationRecordList(
      List<TerminationRecord> terminationRecordList) {
    List<TerminationRecordData> terminationRecordDatalist = new ArrayList<TerminationRecordData>();

    if (terminationRecordList != null) {
      for (TerminationRecord terminationRecord : terminationRecordList) {
        terminationRecordDatalist.add(mapToTerminationRecordData(terminationRecord));
      }
    }
    return terminationRecordDatalist;
  }
}
