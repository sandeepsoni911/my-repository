package com.sandeep.service;

import java.util.List;

import com.sandeep.dto.LoanPaymentDetails;

/**
 * Service layer for Partial payments
 * @author sandeepsoni
 *
 */
public interface LoanPaymentService {
	
	/**
	 * To get all partial payments
	 * for loan id
	 * @param loanId
	 * @return
	 */
	List<LoanPaymentDetails> getAllPartialPayment(Long loanId);
	
	/**
	 * To save partial payment
	 * @param loanPaymentDetails
	 * @return
	 */
	String saveLoanPartialPayment(LoanPaymentDetails loanPaymentDetails);


}
