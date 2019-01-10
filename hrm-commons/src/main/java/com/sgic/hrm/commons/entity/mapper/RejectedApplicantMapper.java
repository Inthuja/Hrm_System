
package com.sgic.hrm.commons.entity.mapper;

import com.sgic.hrm.commons.dto.RejectedApplicantData;
import com.sgic.hrm.commons.entity.RejectedApplicant;

public class RejectedApplicantMapper {
	
	public static RejectedApplicantData rejectedApplicantMapper(RejectedApplicant rejectedApplicant) {
		RejectedApplicantData rejectedApplicantData = new RejectedApplicantData();

		if (rejectedApplicantData != null) {
			rejectedApplicantData.setId(rejectedApplicant.getId());
			rejectedApplicantData.setReason(rejectedApplicant.getReason());
			
			
			rejectedApplicantData.setApplicant(ApplicantMapper.applicantMapper(rejectedApplicant.getApplicant()));
			
			return rejectedApplicantData;
		}
		return null;
		

	}

}
