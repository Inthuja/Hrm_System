package com.sgic.hrm.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.HolidayCalendarData;
import com.sgic.hrm.commons.dto.mapper.HolidayCalendarDataToHolidayCalendar;
import com.sgic.hrm.commons.entity.HolidayCalendar;
import com.sgic.hrm.commons.entity.mapper.HolidayCalendarToHolidayCalendarData;
import com.sgic.hrm.lms.service.HolidayCalendarService;

@RestController
@RequestMapping("/holidaycalendar")
public class HolidayCalendarController {

	@Autowired
	HolidayCalendarService holidayCalendarService;

	@PostMapping
	public ResponseEntity<String> createHolidayCalendar(@RequestBody HolidayCalendarData holidayCalendarData) {
		if (holidayCalendarService.createHolidayCalendar(
				HolidayCalendarDataToHolidayCalendar.mapToHolidayCalendar(holidayCalendarData))) {
			return new ResponseEntity<>("Holiday Calendar created successfully", HttpStatus.CREATED);
		}
		return new ResponseEntity<>("Faild to create Holiday Calendar", HttpStatus.BAD_REQUEST);
	}

	@GetMapping
	public ResponseEntity<List<HolidayCalendarData>> viewAllHolidayCalendar() {
		List<HolidayCalendar> holidayCalendarList = holidayCalendarService.viewAllHolixdayCalendar();
		return new ResponseEntity<>(
				HolidayCalendarToHolidayCalendarData.mapToHolidayCalendarDataList(holidayCalendarList), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateHolidayCalendar(@PathVariable(name = "id") Integer id,
			@RequestBody HolidayCalendarData holidayCalendarData) {
		if (holidayCalendarService.updateHolidayCalendar(id,
				HolidayCalendarDataToHolidayCalendar.mapToHolidayCalendar(holidayCalendarData))) {
			return new ResponseEntity<>("Holiday Calendar updated successfully", HttpStatus.OK);
		}
		return new ResponseEntity<>("Faild to update Holiday Calendar", HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteHolidayCalendar(@PathVariable(name="id")Integer id){
		if (holidayCalendarService.deleteholidayCalendar(id)){
			return new ResponseEntity<>("Holiday Calendar deleted successfully", HttpStatus.OK);
		}
		return new ResponseEntity<>("Faild to deleted Holiday Calendar", HttpStatus.BAD_REQUEST);
	}

}
