package com.sgic.hrm.lms.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sgic.hrm.commons.dto.AcceptLeaveDto;
import com.sgic.hrm.commons.dto.LeaveRequestData;
import com.sgic.hrm.commons.dto.RejectLeaveDto;
import com.sgic.hrm.commons.dto.mapper.LeaveRequestDataToLeaveRequest;
import com.sgic.hrm.commons.entity.mapper.LeaveRequestToLeaveRequestData;
import com.sgic.hrm.commons.enums.Status;
import com.sgic.hrm.lms.service.AcceptLeaveRequestService;
import com.sgic.hrm.lms.service.LeaveRequestService;
import com.sgic.hrm.lms.service.RejectLeaveRequestService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/leaverequest")
public class LeaveRequestController {

  @Autowired
  LeaveRequestService leaveRequestService;
  @Autowired
  AcceptLeaveRequestService acceptLeaveRequestSrevice;
  @Autowired
  RejectLeaveRequestService rejectLeaveRequestSrevice;


  @GetMapping
  public ResponseEntity<List<LeaveRequestData>> getAllLeaveRequest() {
    return new ResponseEntity<>(LeaveRequestToLeaveRequestData
        .mapLeaveRequestDataList(leaveRequestService.getAllLeaveRequest()), HttpStatus.OK);
  }

  @PostMapping("/{userName}")
  public HttpStatus addLeaveRequest(@RequestBody LeaveRequestData leaveRequestData,
      @PathVariable(name = "userName") String userName) {

    if (leaveRequestService.addLeaveRequest(
        LeaveRequestDataToLeaveRequest.mapToLeaveRequest(leaveRequestData), userName)) {
      return HttpStatus.OK;
    }
    return HttpStatus.BAD_REQUEST;
  }

  @GetMapping("/user/{id}")
  public ResponseEntity<List<LeaveRequestData>> getAllLeaveRequestByUser(
      @PathVariable("id") Integer id) {
    return new ResponseEntity<>(LeaveRequestToLeaveRequestData
        .mapLeaveRequestDataList(leaveRequestService.getLeaveRequestByUser(id)), HttpStatus.OK);
  }

  @GetMapping("/pending")
  public ResponseEntity<List<LeaveRequestData>> getPendingLeaveRequest() {
    return new ResponseEntity<>(LeaveRequestToLeaveRequestData.mapLeaveRequestDataList(
        leaveRequestService.getAllLeaveRequestByStatus(Status.PENDING)), HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteLeaveRequest(@PathVariable("id") Integer id) {
    if (leaveRequestService.deleteLeaveRequest(id)) {
      return new ResponseEntity<>("request deleted successfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("faild to delete request", HttpStatus.BAD_REQUEST);
  }

  @Transactional
  @PostMapping("/accept")
  public ResponseEntity<String> acceptLeaveRequest(@RequestBody AcceptLeaveDto acceptLeaveDto) {

    if (leaveRequestService.acceptLeaveRequest(acceptLeaveDto)) {
      return new ResponseEntity<>("status updated successfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("status update faild", HttpStatus.BAD_REQUEST);
  }


  @PostMapping("/reject")
  public ResponseEntity<String> rejectLeaveRequest(@RequestBody RejectLeaveDto rejectLeaveDto) {

    if (leaveRequestService.rejectLeaveRequest(rejectLeaveDto)) {
      return new ResponseEntity<>("status updated successfully", HttpStatus.OK);
    }
    return new ResponseEntity<>("status update faild", HttpStatus.BAD_REQUEST);
  }
}
