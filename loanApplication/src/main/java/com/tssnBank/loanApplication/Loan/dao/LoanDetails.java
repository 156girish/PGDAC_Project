package com.tssnBank.loanApplication.Loan.dao;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.tssnBank.loanApplication.customer.dao.CustomerDao;

@Entity
public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	@ManyToOne
	private CustomerDao customer;
	private Double amount;
	private int tennureInMonth;
	private String adharCardNumber;
	private String employmentType;
	private String status;
	private String loanType;
	private LocalDate updateDate;
	private LocalDate dateOfApproval;
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}

	public LocalDate getDateOfApproval() {
		return dateOfApproval;
	}

	public void setDateOfApproval(LocalDate dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}

	public LoanDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanDetails(CustomerDao customer, Double amount, int tennureInMonth, String adharCardNumber,
			String employmentType, String loanType) {
		super();
		this.customer = customer;
		this.amount = amount;
		this.tennureInMonth = tennureInMonth;
		this.adharCardNumber = adharCardNumber;
		this.employmentType = employmentType;
		this.loanType = loanType;
	}

	public CustomerDao getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDao customer) {
		this.customer = customer;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public int getTennureInMonth() {
		return tennureInMonth;
	}

	public void setTennureInMonth(int tennureInMonth) {
		this.tennureInMonth = tennureInMonth;
	}

	public String getAdharCardNumber() {
		return adharCardNumber;
	}

	public void setAdharCardNumber(String adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "LoanDetails [id=" + id + ", customer=" + customer + ", amount=" + amount + ", tennureInMonth="
				+ tennureInMonth + ", adharCardNumber=" + adharCardNumber + ", employmentType=" + employmentType
				+ ", status=" + status + ", loanType=" + loanType + ", updateDate=" + updateDate + ", dateOfApproval="
				+ dateOfApproval + "]";
	}
	
}
