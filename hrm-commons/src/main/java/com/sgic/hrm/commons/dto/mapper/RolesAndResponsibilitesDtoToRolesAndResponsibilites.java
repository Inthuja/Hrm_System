package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.RolesAndResponsibilityDto;
import com.sgic.hrm.commons.entity.Job;
import com.sgic.hrm.commons.entity.KeyActivity;
import com.sgic.hrm.commons.entity.Location;
import com.sgic.hrm.commons.entity.RolesAndResponsibilites;
import com.sgic.hrm.commons.entity.User;

public class RolesAndResponsibilitesDtoToRolesAndResponsibilites {
	public static RolesAndResponsibilites map(RolesAndResponsibilityDto rolesAndResponsibilityDto) {
		RolesAndResponsibilites rolesAndResponsibilites=new RolesAndResponsibilites();
		User user = new User();
		Location location = new Location();
		KeyActivity keyActivity = new KeyActivity();
		Job job =  new Job();
		rolesAndResponsibilites.setId(rolesAndResponsibilityDto.getId());
		rolesAndResponsibilites.setOverAllPurpose(rolesAndResponsibilityDto.getOverAllPurpose());
		rolesAndResponsibilites.setResponsibility(rolesAndResponsibilityDto.getResponsibility());
		user.setId(rolesAndResponsibilityDto.getUser());
		location.setId(rolesAndResponsibilityDto.getLocation());
		keyActivity.setId(rolesAndResponsibilityDto.getKeyActivity());
		job.setId(rolesAndResponsibilityDto.getJob());
		return rolesAndResponsibilites;
		
	}

}
