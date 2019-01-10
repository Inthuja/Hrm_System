package com.sgic.hrm.employee.service;

import java.util.List;

import com.sgic.hrm.commons.entity.ProfileAttachments;



public interface ProfileAttachmentService {
	boolean addAttachment(ProfileAttachments profileAttachments);
	List<ProfileAttachments> getAttachments();
	void save(ProfileAttachments profileAttachments);
	
}
