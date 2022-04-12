package com.tssnBank.loanApplication.customer.Exceptions;

public class UserAlreadyPresentException extends RuntimeException {

	public UserAlreadyPresentException(String msg) {
		super(msg);
	}
}
