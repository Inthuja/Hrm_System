package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.AttachmentData;
import com.sgic.hrm.commons.dto.TerminationRecordData;
import com.sgic.hrm.commons.entity.Attachment;

public class AttachmentDataToAttachment {

	public static Attachment mapToAttachments(AttachmentData attachmentsData) {
		Attachment attachments = new Attachment();
		if (attachmentsData != null) {
			attachments.setId(attachmentsData.getId());
			attachments.setAttachment(attachmentsData.getAttachment());
			attachments.setTerminationRecord(TerminationRecordDataToTerminationRecord
					.mapToTerminationRecord(attachmentsData.getTerminationRecord()));
		}
		return attachments;
	}

	public static List<Attachment> mapToAttachmentsDataList(TerminationRecordData terminationRecordData) {
		List<Attachment> attachments = new ArrayList<Attachment>();
		if (terminationRecordData.getAttachmentDatas() != null) {
			for (AttachmentData attachmentsData : terminationRecordData.getAttachmentDatas()) {
				attachments.add(mapToAttachments(attachmentsData));
			}
		}
		return attachments;
	}
}
