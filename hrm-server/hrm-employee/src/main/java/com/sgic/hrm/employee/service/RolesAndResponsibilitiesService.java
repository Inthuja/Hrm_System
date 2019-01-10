package com.sgic.hrm.employee.service;

import java.util.List;
import java.util.Optional;

import com.sgic.hrm.commons.entity.Job;
import com.sgic.hrm.commons.entity.KeyActivity;
import com.sgic.hrm.commons.entity.Location;
import com.sgic.hrm.commons.entity.RolesAndResponsibilites;
import com.sgic.hrm.commons.entity.User;

public interface RolesAndResponsibilitiesService {
	boolean addRolesAndResponsibilites(RolesAndResponsibilites rolesAndResponsibilites, Job job, User user,
			KeyActivity keyActivity, Location location);

	List<RolesAndResponsibilites> getRolesAndResponsibilites();

	boolean editRolesAndResponsibilites(RolesAndResponsibilites rolesAndResponsibilites, Integer id);

	Optional<RolesAndResponsibilites> getReloAndResponsibilities(Integer id);

	boolean deleteRolesAndResponsibilites(Integer id);
	
	List<RolesAndResponsibilites> getRolesAndResponsibilitesByUserId(Integer uid);
}
