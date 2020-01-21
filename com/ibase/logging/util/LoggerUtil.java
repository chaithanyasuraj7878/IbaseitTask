package com.ibase.logging.util;



import org.apache.log4j.PropertyConfigurator;


public class LoggerUtil {
	static {
        init();
    }
   
    private static void init() {
        PropertyConfigurator.configure("log4j.properties");
    }
}

