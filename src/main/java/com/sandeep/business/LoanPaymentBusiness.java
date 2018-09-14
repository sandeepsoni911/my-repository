package com.sandeep.business;

import java.util.List;

import com.sandeep.dto.LoanPaymentDetails;

/**
 * Business class for loanPayments
 * @author sandeepsoni
 *
 */
public interface LoanPaymentBusiness {
	
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
