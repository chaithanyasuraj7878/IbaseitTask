package src.com.ibaseit.studentdetailsinlist;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

import com.ibase.logging.util.LoggerDemo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;

public class ListOfStudents {
	private final static Logger logger = Logger.getLogger(LoggerDemo.class);

	StudentDetails details;
	List<StudentDetails> list = new ArrayList<>();
	void add(){
		list.add(new StudentDetails("danni", 4, "pass"));
		list.add(new StudentDetails("cortex", 5, "pass"));
		list.add(new StudentDetails("sam", 6, "pass"));
	}
	
	public List<StudentDetails> add(StudentDetails details) {
		list = new ArrayList<>();
		list.add(details);
		return list;

	}

	public List remove(int n) {
		add();
		try {
			list.remove(n);

		} catch (Exception e) {
			logger.error(e);
		}

		return list;

	}

	public StudentDetails getStudent(int m) {
		add();
		try {
			return list.get(m);
		}

		catch (Exception e) {
			logger.error(e);
		}

		return list.get(m);
		

	}

}
