package com.infy.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//DONT MODIFY NAME OF CLASS
//DONT ADD/MODIFY/DELETE/COMMENT ANY METHOD
//DONT DELETE/MODIFY INSTANCE VARIABLE(IF PRESENT)
//DONT MODIFY ANNOTATIONS(IF PRESENT)

public class LoggingAspect {

	private Logger logger = LogManager.getLogger(this.getClass());

	
	public void logDaoException(Exception exception) throws Exception {

	}

	
	public void logServiceException(Exception exception) throws Exception {

	}

}
