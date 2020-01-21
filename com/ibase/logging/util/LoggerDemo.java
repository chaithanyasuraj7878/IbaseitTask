package com.ibase.logging.util;

import org.apache.log4j.Logger;

public class LoggerDemo {

	private final static Logger logger = Logger.getLogger(LoggerDemo.class);

	 

    public static void main(String[] args) {
        LoggerUtil util = new LoggerUtil();

 

        if (logger.isDebugEnabled()) {
            logger.debug("Main method start");
        }

 

        try {
            divisionOperation();
        } catch (Exception e) {
            logger.error(e);
            // e.printStackTrace();
        }
    }

 

    private static void divisionOperation() {
        int a = 10;
        int b = 0;
        try {
            if (a > 0) {
                int c = a / b;
            }
        } catch (Exception e) {
            logger.error(e, e);

 

        }
    }
	
}
