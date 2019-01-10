/**
 * 
 */
package com.sgic.hrm.lms.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sgic.hrm.commons.dto.AcceptLeaveDto;
import com.sgic.hrm.commons.dto.RejectLeaveDto;
import com.sgic.hrm.commons.entity.AcceptLeaveRequest;
import com.sgic.hrm.commons.entity.LeaveRequest;
import com.sgic.hrm.commons.entity.RejectLeaveRequest;
import com.sgic.hrm.commons.enums.Status;
import com.sgic.hrm.commons.repository.AcceptLeaveRequestRepository;
import com.sgic.hrm.commons.repository.LeaveRequestRepository;
import com.sgic.hrm.commons.repository.LoginRepository;
import com.sgic.hrm.commons.repository.RejectLeaveRequestRepository;
import com.sgic.hrm.commons.repository.UserRepository;
import com.sgic.hrm.lms.service.LeaveAllocationService;
import com.sgic.hrm.lms.service.LeaveRequestService;
import com.sgic.hrm.lms.service.LoginService;

/**
 * @author Anushanth
 *
 */
@Service
public class LeaveRequestServiceImpl implements LeaveRequestService {

	@Autowired
	LeaveRequestRepository leaveRequestRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	LeaveAllocationService leaveAllocationService;
	@Autowired
	LoginRepository loginRepository;
	@Autowired
	LoginService loginService;
	@Autowired
	AcceptLeaveRequestRepository acceptLeaveRequestRepository;
	@Autowired
	RejectLeaveRequestRepository rejectLeaveRequestRepository;

	@Transactional
	@Override
	public boolean addLeaveRequest(LeaveRequest leaveRequest, String userName) {

		if (leaveRequest != null) {
			leaveRequest.setUser(loginService.getUser(userName));

			leaveRequest.setStatus(Status.PENDING);
			if (leaveAllocationService.updateLeaveCount(leaveRequest)) {
				leaveRequestRepository.save(leaveRequest);
				return true;
			}
		}
		return false;
	}

	@Transactional
	@Override
	public boolean acceptLeaveRequest(AcceptLeaveDto acceptLeaveDto) {

		LeaveRequest leaveRequest = leaveRequestRepository.findById(acceptLeaveDto.getLeaveRequestId()).orElse(null);

		if (leaveRequest != null) {
			leaveRequest.setStatus(Status.ACCEPTED);
			leaveRequestRepository.save(leaveRequest);
			AcceptLeaveRequest acceptLeaveRequest = new AcceptLeaveRequest();
			acceptLeaveRequest.setLeaveRequest(leaveRequest);
			acceptLeaveRequest.setAcceptedBy(loginRepository.findByUserName(acceptLeaveDto.getUserName()).getUser());
			acceptLeaveRequestRepository.save(acceptLeaveRequest);
			return true;
		}
		return false;
	}

	@Transactional
	@Override
	public boolean deleteLeaveRequest(Integer id) {

		LeaveRequest leaveRequest = leaveRequestRepository.findById(id).orElse(null);
		if (leaveRequest != null) {
			leaveRequest.setStatus(Status.DELETED);
			leaveAllocationService.updateLeaveCount(leaveRequest);
			leaveRequestRepository.deleteById(id);
			return true;
		}
		return false;
	}

	@Override
	public List<LeaveRequest> getLeaveRequestByUser(Integer userId) {

		return leaveRequestRepository.findByUser(userRepository.getOne(userId));
	}

	@Override
	public List<LeaveRequest> getAllLeaveRequest() {
		return leaveRequestRepository.findAll();
	}

	@Override
	public List<LeaveRequest> getAllLeaveRequestByStatus(Status status) {

		return leaveRequestRepository.findByStatus(status);
	}

	@Transactional
	@Override
	public boolean rejectLeaveRequest(RejectLeaveDto rejectLeaveDto) {
		LeaveRequest leaveRequest = leaveRequestRepository.findById(rejectLeaveDto.getLeaveRequestId()).orElse(null);

		if (leaveRequest != null) {
			leaveRequest.setStatus(Status.REJECTED);
			leaveAllocationService.updateLeaveCount(leaveRequest);
			leaveRequestRepository.save(leaveRequest);
			RejectLeaveRequest rejectLeaveRequest = new RejectLeaveRequest();
			rejectLeaveRequest.setLeaveRequest(leaveRequest);
			rejectLeaveRequest.setRejectedBy(loginRepository.findByUserName(rejectLeaveDto.getUserName()).getUser());
			rejectLeaveRequest.setReason(rejectLeaveDto.getRejectReason());
			rejectLeaveRequestRepository.save(rejectLeaveRequest);
			return true;
		}
		return false;
	}
}
