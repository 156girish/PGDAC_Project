package com.tssnBank.loanApplication.Loan.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tssnBank.loanApplication.Loan.dao.LoanDetails;
import com.tssnBank.loanApplication.customer.dao.CustomerDao;

public interface LoadRepository extends CrudRepository<LoanDetails, Long> {

	public Optional<List<LoanDetails>> findByCustomer(CustomerDao customer); 
}
