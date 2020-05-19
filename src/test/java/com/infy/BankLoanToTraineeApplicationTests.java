package com.infy;

import org.junit.Rule;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.infy.dao.LoanDAO;
import com.infy.service.LoanService;

//DONT MODIFY NAME OF CLASS
//DONT ADD/MODIFY/DELETE ANY METHOD
//DONT DELETE/MODIFY INSTANCE VARIABLE(IF PRESENT)
//DONT MODIFY ANNOTATIONS(IF PRESENT)

@RunWith(SpringRunner.class)
public class BankLoanToTraineeApplicationTests {

	@Rule
	ExpectedException expectedException = ExpectedException.none();
	
	LoanDAO loanDAO;
	
	LoanService loanService;
	
	public void sanctionLoanCustomerNotAvailableTest() throws Exception {
		
	}
	
	public void sanctionLoanLoanAlreadyTakenTest() throws Exception {
		
	}

}
