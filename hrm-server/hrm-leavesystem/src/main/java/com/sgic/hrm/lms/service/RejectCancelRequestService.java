package com.sgic.hrm.lms.service;

import java.util.List;

import com.sgic.hrm.commons.entity.RejectCancelRequest;

public interface RejectCancelRequestService {

	boolean editRejectCancelRequest(Integer id, RejectCancelRequest rejectCancelRequest);

	List<RejectCancelRequest> getAllRejectCancelRequests();

	RejectCancelRequest getRejectCancelRequest(Integer id);

	boolean deleteRejectCancelRequest(Integer id);

	boolean addRejectCancelRequest(RejectCancelRequest rejectCancelRequest);

}
