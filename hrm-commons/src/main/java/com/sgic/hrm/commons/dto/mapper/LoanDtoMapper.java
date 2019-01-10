package com.sgic.hrm.commons.dto.mapper;

import com.sgic.hrm.commons.dto.LoanDto;
import com.sgic.hrm.commons.entity.LoanDetailsEntity;
import com.sgic.hrm.commons.entity.UserEntity;
import com.sgic.hrm.commons.entity.UserLoanDetails;

public class LoanDtoMapper {

	public static LoanDto mapToLoanDto(LoanDetailsEntity loanDetailsEntity, UserEntity userEntity,
			UserLoanDetails userLoanDetails) {
		LoanDto loanDto = new LoanDto();
		
		if (loanDetailsEntity != null && userEntity != null && userLoanDetails != null) {
			loanDto.setUser_id(userEntity.getUserId());
			loanDto.setUser_name(userEntity.getUserName());
			loanDto.setAmount(loanDetailsEntity.getAmount());
			loanDto.setInstallment_amount(userLoanDetails.getInstallmentAmount());
			
		}
		return loanDto;
	}
}
