package com.ibaseit.logging;

import java.util.logging.LogRecord;

public class MyLogHandler {

	 public void publish(LogRecord record) {
	      StringBuilder sb = new StringBuilder();
	      sb.append(record.getMillis())
	        .append(" - ")
	        .append(record.getSourceClassName())
	        .append("#")
	        .append(record.getSourceMethodName())
	        .append(" - ")
	        .append(record.getMessage());
	      System.out.println(sb.toString());
	  }

	  public void flush() {
	  }

	  public void close() throws SecurityException {
	  }
	
}
