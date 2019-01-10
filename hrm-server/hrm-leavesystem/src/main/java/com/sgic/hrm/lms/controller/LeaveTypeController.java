package com.sgic.hrm.lms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.hrm.commons.dto.LeaveTypeData;
import com.sgic.hrm.commons.dto.mapper.LeaveTypeDataToLeaveType;
import com.sgic.hrm.commons.entity.mapper.LeaveTypeToLeaveTypeData;
import com.sgic.hrm.lms.service.LeaveTypeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/leavetype")
public class LeaveTypeController {

  @Autowired
  LeaveTypeService leaveTypeService;

  @PostMapping
  public ResponseEntity<String> createLeaveType(@RequestBody LeaveTypeData leaveTypeData) {
    if (leaveTypeService.createLeaveType(LeaveTypeDataToLeaveType.mapToLeaveType(leaveTypeData))) {
      return new ResponseEntity<>("Leave type created succesfully", HttpStatus.CREATED);
    }
    return new ResponseEntity<>("Faild to create Leave type", HttpStatus.BAD_REQUEST);
  }

  @GetMapping
  public ResponseEntity<List<LeaveTypeData>> getAllLeaveType() {
    return new ResponseEntity<>(
        LeaveTypeToLeaveTypeData.mapToLeaveTypeDataList(leaveTypeService.viewAllLeaveType()),
        HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteLeaveType(@PathVariable(name = "id") Integer id) {
    if (leaveTypeService.deleteLeaveType(id)) {
      return new ResponseEntity<>("Leave Type deleted Successfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("Faild to delete Leave Type", HttpStatus.BAD_REQUEST);
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> editLeaveType(@RequestBody LeaveTypeData leaveTypeData,
      @PathVariable(name = "id") Integer id) {
    if (leaveTypeService.updateLeaveType(id,
        LeaveTypeDataToLeaveType.mapToLeaveType(leaveTypeData))) {
      return new ResponseEntity<>("Leave Type updated Successfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("Faild to update Leave Type", HttpStatus.BAD_REQUEST);
  }

}
