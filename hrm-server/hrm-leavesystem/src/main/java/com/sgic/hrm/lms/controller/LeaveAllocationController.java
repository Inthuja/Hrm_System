package com.sgic.hrm.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.hrm.commons.dto.AppointmentTypeData;
import com.sgic.hrm.commons.dto.LeaveAllocationData;
import com.sgic.hrm.commons.dto.UserData;
import com.sgic.hrm.commons.dto.mapper.AppointmentTypeDataToAppointmentType;
import com.sgic.hrm.commons.dto.mapper.UserDataToUser;
import com.sgic.hrm.commons.entity.LeaveAllocation;
import com.sgic.hrm.commons.entity.mapper.LeaveAllocationToLeaveAllocationData;
import com.sgic.hrm.lms.service.LeaveAllocationService;
import com.sgic.hrm.lms.service.LeaveTypeService;
import com.sgic.hrm.lms.service.LoginService;

@RestController
@RequestMapping("/leaveallocation")
public class LeaveAllocationController {

  @Autowired
  LeaveAllocationService leaveAllocationService;
  @Autowired
  LoginService loginService;
  @Autowired
  LeaveTypeService leaveTypeService;

  @PostMapping
  public ResponseEntity<String> allocateLeave(UserData userData,
      AppointmentTypeData appointmentTypeData) {
    if (leaveAllocationService.allocateLeave(UserDataToUser.mapToUser(userData),
        AppointmentTypeDataToAppointmentType.mapToAppointmentType(appointmentTypeData),
        leaveTypeService.viewAllLeaveType())) {
      return new ResponseEntity<>("LeaveAllocation created successfully", HttpStatus.CREATED);
    }
    return new ResponseEntity<>("Faild to create Leave Allocation", HttpStatus.BAD_REQUEST);
  }

  @GetMapping("/{username}")
  public ResponseEntity<List<LeaveAllocationData>> viewLeaveAllocationByUser(@PathVariable(name = "username") String userName) {

    List<LeaveAllocation> leaveAllocationList =
        leaveAllocationService.viewLeaveAllocationByUser(loginService.getUser(userName));
    return new ResponseEntity<>(
        LeaveAllocationToLeaveAllocationData.mapToLeaveAllocationDataList(leaveAllocationList),
        HttpStatus.OK);
  }


  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteLeaveAllocation(@PathVariable(name = "id") Integer id) {
    if (leaveAllocationService.deleteLeaveAllocation(id)) {
      return new ResponseEntity<>("LeaveAllocation deleted successfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("Faild to deleted Leave Allocation", HttpStatus.BAD_REQUEST);
  }

}
