package com.sgic.hrm.commons.dto;

import java.io.File;

public class AttachmentData {

  Integer id;
  TerminationRecordData terminationRecord;
  File attachment;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public TerminationRecordData getTerminationRecord() {
    return terminationRecord;
  }

  public void setTerminationRecord(TerminationRecordData terminationRecord) {
    this.terminationRecord = terminationRecord;
  }

  public File getAttachment() {
    return attachment;
  }

  public void setAttachment(File attachment) {
    this.attachment = attachment;
  }

}
