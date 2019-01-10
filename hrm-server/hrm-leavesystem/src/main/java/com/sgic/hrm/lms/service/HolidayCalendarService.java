package com.sgic.hrm.lms.service;

import java.util.List;

import com.sgic.hrm.commons.entity.HolidayCalendar;

public interface HolidayCalendarService {
	
	boolean createHolidayCalendar(HolidayCalendar holidayCalendar);
	List<HolidayCalendar> viewAllHolixdayCalendar();
	boolean updateHolidayCalendar(Integer id,HolidayCalendar holidayCalendar);
	boolean deleteholidayCalendar(Integer id);

}
