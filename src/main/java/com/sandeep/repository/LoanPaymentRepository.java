package com.sandeep.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sandeep.entity.LoanPayments;

/**
 * Repository for loan payments
 * @author sandeepsoni
 *
 */
public interface LoanPaymentRepository extends JpaRepository<LoanPayments, String>{

	//@Query("select lp from com.sandeep.entity.LoanPayments lp where lp.loan.loanId=?1")
	@Query(value="select * from loan_payments as lp where lp.loan_id=?1", nativeQuery=true)
	List<LoanPayments>  getAllPaymentsForLoanId(Long loanId);
	
}
