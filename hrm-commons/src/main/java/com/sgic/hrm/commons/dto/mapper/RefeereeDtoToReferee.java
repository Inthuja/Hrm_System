package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.RefereesDto;
import com.sgic.hrm.commons.entity.Referee;
import com.sgic.hrm.commons.entity.User;

public class RefeereeDtoToReferee {
	public static Referee map(RefereesDto refereesDto) {
		Referee referee= new Referee();
		User user=new User();
		referee.setAddress(refereesDto.getAddress());
		referee.setContactNo(refereesDto.getContactNo());
		referee.setId(refereesDto.getId());
		referee.setRefereeName(refereesDto.getRefereeName());
		referee.setRelationship(refereesDto.getRelationship());
		referee.setEmail(refereesDto.getEmail());
		user.setId(refereesDto.getUser());
		return referee;
		
	}
}
