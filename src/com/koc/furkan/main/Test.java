package com.koc.furkan.main;

import org.apache.log4j.Logger;

public class Test {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Test.class);
			logger.info("Furkan info");
			logger.debug("Furkan debug");
			logger.error("Furkan error");
			logger.fatal("Furkan fatal");
	}
}
