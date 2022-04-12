package com.tssnBank.loanApplication.customer.Exceptions;

public class UserNotFound extends RuntimeException {

	public UserNotFound(String msg) {
		super(msg);
	}
}
