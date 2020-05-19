package com.infy.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.infy.model.Customer;

//DONT MODIFY NAME OF CLASS
//DONT ADD/MODIFY/DELETE/COMMENT ANY METHOD
//DONT DELETE/MODIFY INSTANCE VARIABLE(IF PRESENT)
//DONT MODIFY ANNOTATIONS(IF PRESENT)
public class LoanDAOImpl implements LoanDAO {

	
	private EntityManager entityManager;

	
	public List<Customer> getReportByLoanType(String loanType) throws Exception {
		
		return null;
	}

	
	public Integer checkLoanAllotment(Integer customerId) throws Exception {
		
		return null;
	}
	
	public Integer sanctionLoan(Customer customer) throws Exception {
		
		return null;
	}
}
