package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.ProfessionalMembershipDto;
import com.sgic.hrm.commons.entity.ProfessionalMembership;
import com.sgic.hrm.commons.entity.User;

public class ProfessionalMembershipDtoToProfessionalMembership {

	public static ProfessionalMembership map(ProfessionalMembershipDto professionalMembershipDto ) {
		ProfessionalMembership professionalMembership=new ProfessionalMembership();
		User user=new User();
		professionalMembership.setAward(professionalMembershipDto.getAward());
		professionalMembership.setEventName(professionalMembershipDto.getEventName());
		professionalMembership.setEventType(professionalMembershipDto.getEventType());
		professionalMembership.setId(professionalMembershipDto.getId());
		professionalMembership.setOrganizationName(professionalMembershipDto.getOrganizationName());
		professionalMembership.setPeriodYearFrom(professionalMembershipDto.getPeriodYearFrom());
		professionalMembership.setPeriodYearTo(professionalMembershipDto.getPeriodYearTo());
		user.setId(professionalMembershipDto.getUser());
		return professionalMembership;
	}
}
