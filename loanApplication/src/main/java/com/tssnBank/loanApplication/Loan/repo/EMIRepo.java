package com.tssnBank.loanApplication.Loan.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tssnBank.loanApplication.Loan.dao.EMIDetails;
import com.tssnBank.loanApplication.Loan.dao.LoanDetails;

public interface EMIRepo extends CrudRepository<EMIDetails, Long> {

	public Optional<EMIDetails> findByLoanDetails(LoanDetails ld);
}
