package com.sandeep.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sandeep.dto.LoanPaymentDetails;
import com.sandeep.service.LoanPaymentService;

/**
 * Business Impl class
 * @author sandeepsoni
 *
 */
@Component
@Transactional( readOnly = true )
public class LoanPaymentBusinessImpl implements com.sandeep.business.LoanPaymentBusiness {

	@Autowired
	LoanPaymentService loanPaymentService;
	
	@Override
	public List<LoanPaymentDetails> getAllPartialPayment(Long loanId) {
		
		return loanPaymentService.getAllPartialPayment(loanId);
	}

	@Override
	public String saveLoanPartialPayment(LoanPaymentDetails loanPaymentDetails) {
		
		return null;
	}

}
