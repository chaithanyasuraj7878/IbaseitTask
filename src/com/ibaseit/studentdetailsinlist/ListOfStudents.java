package com.ibaseit.studentdetailsinlist;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import com.ibaseit.logging.Loggingforexception;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;

public class ListOfStudents {

	StudentDetails details;
	List<StudentDetails> list = null;

	public List<StudentDetails> add(StudentDetails details) {
		list = new ArrayList<>();
		list.add(details);
		return list;

	}

	public List remove(int n) {
		final Logger logger = Logger.getLogger(ListOfStudents.class);
		FileAppender fileAppender = new FileAppender();
		String conversionPattern = "%-7p %d [%t] %c %x - %m%n";
		PatternLayout layout = new PatternLayout();

		try {
			list.remove(n);

		} catch (Exception e) {

			System.out.println(new Exception("index size is out"));

			fileAppender.setFile("E://ExceptionFileStoreforRemoving.txt");
			fileAppender.setLayout(layout);
			layout.setConversionPattern(conversionPattern);
			fileAppender.activateOptions();
			logger.addAppender(fileAppender);
			logger.setLevel(Level.DEBUG);
			logger.debug("The number is which you have gaven doesn't exists among index values");

		}

		return list;

	}

	public void get(int m) {
		final Logger logger = Logger.getLogger(ListOfStudents.class);
		FileAppender fileAppender = new FileAppender();
		String conversionPattern = "%-7p %d [%t] %c %x - %m%n";
		PatternLayout layout = new PatternLayout();
		try {
			list.get(m);
		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(new Exception("index size is out"));

			fileAppender.setFile("E://ExceptionFileStoreforGetting.txt");
			fileAppender.setLayout(layout);
			layout.setConversionPattern(conversionPattern);
			fileAppender.activateOptions();
			logger.addAppender(fileAppender);
			logger.setLevel(Level.DEBUG);
			logger.debug("The number is which you have gaven doesn't exists among index values");

		}
	}

	public List print() {
		return list;
	}

	public List<StudentDetails> update(StudentDetails details) {
		list.add(details);
		return list;
	}

}
