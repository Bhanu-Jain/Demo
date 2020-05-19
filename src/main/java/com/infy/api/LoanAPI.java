package com.infy.api;

import java.util.List;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;

import com.infy.model.Customer;
import com.infy.service.LoanService;

//DONT MODIFY NAME OF CLASS
//DONT ADD/MODIFY/DELETE/COMMENT ANY METHOD
//DONT DELETE/MODIFY INSTANCE VARIABLE(IF PRESENT)
//DONT MODIFY ANNOTATIONS(IF PRESENT)
public class LoanAPI {

	
	private LoanService loanService;

	
	public Environment environment;
	
	
	public ResponseEntity<String> sanctionLoan(Customer customer)
			throws Exception {
		
		
		return null;
	}

	
	public ResponseEntity<List<Customer>> getReportByLoanType(String loanType) throws Exception {
		

		return null;
	}

}
