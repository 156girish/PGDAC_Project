package com.tssnBank.loanApplication.Loan.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tssnBank.loanApplication.Loan.dao.LoanDetails;
import com.tssnBank.loanApplication.Loan.dao.Payment;

public interface PaymentRepo extends CrudRepository<Payment, Long> {
	
	public List<Payment> findByLoanDetails(LoanDetails ld);

}
