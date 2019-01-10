package com.sgic.hrm.commons.dto.mapper;

import java.util.ArrayList;
import java.util.List;
import com.sgic.hrm.commons.dto.HolidayCalendarData;
import com.sgic.hrm.commons.entity.HolidayCalendar;

public class HolidayCalendarDataToHolidayCalendar {

  public static HolidayCalendar mapToHolidayCalendar(HolidayCalendarData holidayCalendarData) {
    HolidayCalendar holidayCalendar = new HolidayCalendar();

    if (holidayCalendarData != null) {
      holidayCalendar.setId(holidayCalendarData.getId());
      holidayCalendar.setDescription(holidayCalendarData.getDescription());
      holidayCalendar.setDate(holidayCalendarData.getDate());
      holidayCalendar.setEnteredBy(UserDataToUser.mapToUser(holidayCalendarData.getEnteredBy()));
    }
    return holidayCalendar;
  }

  public static List<HolidayCalendar> mapToHolidayCalendarList(
      List<HolidayCalendarData> holidayCalendarDataList) {
    List<HolidayCalendar> holidayCalendarList = new ArrayList<HolidayCalendar>();

    if (holidayCalendarDataList != null) {
      for (HolidayCalendarData holidayCalenderData : holidayCalendarDataList) {
        holidayCalendarList.add(mapToHolidayCalendar(holidayCalenderData));
      }
    }
    return holidayCalendarList;
  }
}
