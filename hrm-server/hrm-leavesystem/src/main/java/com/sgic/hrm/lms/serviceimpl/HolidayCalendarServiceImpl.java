package com.sgic.hrm.lms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.hrm.commons.entity.HolidayCalendar;
import com.sgic.hrm.commons.repository.HolidayCalendarRepository;
import com.sgic.hrm.lms.service.HolidayCalendarService;

@Service
public class HolidayCalendarServiceImpl implements HolidayCalendarService {

	@Autowired
	HolidayCalendarRepository holidayCalendarRepository;

	@Override
	public boolean createHolidayCalendar(HolidayCalendar holidayCalendar) {
		if (holidayCalendar != null) {
			holidayCalendarRepository.save(holidayCalendar);
			return true;
		}
		return false;
	}

	@Override
	public List<HolidayCalendar> viewAllHolixdayCalendar() {
		return holidayCalendarRepository.findAll();
	}

	@Override
	public boolean updateHolidayCalendar(Integer id, HolidayCalendar holidayCalendar) {
		if(holidayCalendarRepository.getOne(id)!= null) {
			holidayCalendar.setId(id);
			holidayCalendarRepository.save(holidayCalendar);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteholidayCalendar(Integer id) {
		if(holidayCalendarRepository.getOne(id)!= null) {
			holidayCalendarRepository.deleteById(id);
			return true;
		}
		return false;
	}

}
