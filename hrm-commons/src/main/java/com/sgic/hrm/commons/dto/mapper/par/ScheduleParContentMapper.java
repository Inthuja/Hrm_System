package com.sgic.hrm.commons.dto.mapper.par;

import com.sgic.hrm.commons.dto.par.ScheduleParContentDtoGet;
import com.sgic.hrm.commons.dto.par.ScheduleParContentDtoPost;
import com.sgic.hrm.commons.entity.par.ParContent;
import com.sgic.hrm.commons.entity.par.ScheduleParContent;

public class ScheduleParContentMapper {
	public static ScheduleParContent dtoToEntity(String pk,ParContent parContent,ScheduleParContentDtoPost scheduleParContentDtoPost) {
		ScheduleParContent scheduleParContent =new ScheduleParContent();
		scheduleParContent.setId(pk);
		scheduleParContent.setParContent(parContent);
		return scheduleParContent;
		
	}
	
	public static ScheduleParContentDtoGet entityToDto(ScheduleParContent scheduleParContent) {
		ScheduleParContentDtoGet scheduleParContentDtoGet =new ScheduleParContentDtoGet();
		scheduleParContentDtoGet.setParContentId(scheduleParContent.getParContent().getId());
		scheduleParContentDtoGet.setParContentName(scheduleParContent.getParContent().getContentName());
		return scheduleParContentDtoGet;
		
	}

}