package com.koc.furkan.main;

import java.util.Date;

import org.apache.log4j.Logger;

public class Test {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Test.class);
		
		for(int i=0;i<1000;i++) {
			logger.info("---------------------------");
			logger.debug("Furkan debug "+i);
			logger.error("Furkan error");
			logger.fatal("Furkan fatal");

		}
	}
}
