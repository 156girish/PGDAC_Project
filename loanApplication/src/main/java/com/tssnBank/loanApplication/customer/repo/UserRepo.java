package com.tssnBank.loanApplication.customer.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.tssnBank.loanApplication.customer.dao.CustomerDao;

public interface UserRepo extends CrudRepository<CustomerDao, Long> {

	public Optional<CustomerDao> findByUserName(String userName);
}
