package com.sgic.hrm.commons.entity.mapper;

import java.util.ArrayList;
import java.util.List;

import com.sgic.hrm.commons.dto.AttachmentData;
import com.sgic.hrm.commons.entity.Attachment;

public class AttachmentsToAttachmentsData {

	public static AttachmentData mapToAttachmentData(Attachment attachment) {
		AttachmentData attachmentData = new AttachmentData();
		if (attachment != null) {
			attachmentData.setId(attachment.getId());
			attachmentData.setAttachment(attachment.getAttachments());
			attachmentData.setTerminationRecord(TerminationRecordToTerminationRecordData
					.mapToTerminationRecordData(attachment.getTerminationRecord()));
		}
		return attachmentData;
	}

	public static List<AttachmentData> mapToAttachmentDataList(List<Attachment> attachmentList) {
		List<AttachmentData> attachmentDataList = new ArrayList<AttachmentData>();

		if (attachmentList != null) {
			for (Attachment attachment : attachmentList) {
				attachmentDataList.add(mapToAttachmentData(attachment));
			}
		}
		return attachmentDataList;
	}

}
