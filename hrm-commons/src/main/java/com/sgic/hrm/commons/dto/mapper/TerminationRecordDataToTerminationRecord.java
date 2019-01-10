package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.TerminationRecordData;
import com.sgic.hrm.commons.entity.TerminationRecord;

public class TerminationRecordDataToTerminationRecord {
	
	
  
  public static TerminationRecord mapToTerminationRecord(TerminationRecordData terminationRecordData) {
    TerminationRecord terminationRecord = new TerminationRecord();
    if (terminationRecordData != null) {
      terminationRecord.setId(terminationRecordData.getId());
      terminationRecord.setDateOfTermination(terminationRecordData.getDateOfTermination());
      terminationRecord.setCauseOfTermination(terminationRecordData.getCauseOfTermination());
      terminationRecord.setDisciplinaryProcedures(terminationRecordData.getDisciplinaryProcedures());
      terminationRecord.setLegalStatus(terminationRecordData.getLegalStatus());
      terminationRecord.setExitInterview(terminationRecordData.getExitInterview());
      terminationRecord.setEmployee(UserDataToUser.mapToUser(terminationRecordData.getEmployee()));
      terminationRecord.setTerminationType(TerminationTypeDataToTerminationType
          .mapToTerminationType(terminationRecordData.getTerminationType()));
    }
    return terminationRecord;
  }

  public static List<TerminationRecord> mapToTerminationRecordList(
      List<TerminationRecordData> terminationRecordDataList) {
    List<TerminationRecord> terminationRecord = new ArrayList<TerminationRecord>();

    if (terminationRecordDataList != null) {
      for (TerminationRecordData terminationRecordData : terminationRecordDataList) {
        terminationRecord.add(mapToTerminationRecord(terminationRecordData));
      }
    }
    return terminationRecord;
  }
}
