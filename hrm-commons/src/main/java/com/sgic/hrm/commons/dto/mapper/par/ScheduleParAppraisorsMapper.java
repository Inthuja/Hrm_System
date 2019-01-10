package com.sgic.hrm.commons.dto.mapper.par;

import com.sgic.hrm.commons.dto.par.ScheduleParAppraisorsDtoGet;
import com.sgic.hrm.commons.dto.par.ScheduleParAppraisorsDtoPost;
import com.sgic.hrm.commons.entity.par.ParAppraisor;
import com.sgic.hrm.commons.entity.par.ScheduleParAppraisor;

public class ScheduleParAppraisorsMapper {

	public static ScheduleParAppraisor dtoToEntity(String pk,ParAppraisor parAppraisor,ScheduleParAppraisorsDtoPost scheduleParAppraisorsDtoPost) {
		ScheduleParAppraisor scheduleParAppraisor=new ScheduleParAppraisor();
		scheduleParAppraisor.setId(pk);
		scheduleParAppraisor.setParAppraisor(parAppraisor);
		return scheduleParAppraisor;
	}
	
	public static ScheduleParAppraisorsDtoGet entityToDto(ScheduleParAppraisor scheduleParAppraisor) {
		ScheduleParAppraisorsDtoGet scheduleParAppraisorDTO=new ScheduleParAppraisorsDtoGet();
		
		scheduleParAppraisorDTO.setAppraiserId(scheduleParAppraisor.getParAppraisor().getAppraiserId());
		scheduleParAppraisorDTO.setAppraiserName(scheduleParAppraisor.getParAppraisor().getEmpName());
	
		return scheduleParAppraisorDTO;
	}
}