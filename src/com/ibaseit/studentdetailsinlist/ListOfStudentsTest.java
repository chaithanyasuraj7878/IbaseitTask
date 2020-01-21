package src.com.ibaseit.studentdetailsinlist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;

class ListOfStudentsTest {

	ListOfStudents obj1 = new ListOfStudents();
	StudentDetails details;
	List<StudentDetails> list2 = new ArrayList<StudentDetails>();
	public void add()
	{
		list2.add(new StudentDetails("danni", 4, "pass"));
		list2.add(new StudentDetails("cortex", 5, "pass"));
		list2.add(new StudentDetails("sam", 6, "pass"));
	}
	
	@Test
	public void testAdd() {
		List<StudentDetails> ex = obj1.add(new StudentDetails("danni1", 4, "pass"));

		add();

		assertNotEquals(list2, ex);
	}

	
	
	
	@Test
	public void testGet() {
		add();
		StudentDetails ex = obj1.getStudent(0);
		
		
		
		StudentDetails ex2 = new StudentDetails("cortex",4,"pass");
		assertNotEquals(ex, ex2);
	}
	
	
	
	
	
	
	
	@Test
	public void testRemove() {

		add();
		List<StudentDetails> ex = obj1.add(new StudentDetails("danni", 4, "pass"));

		assertNotEquals(list2, ex);

		List<StudentDetails> ex1 = obj1.remove(0);
		assertEquals(list2, ex1);

		obj1.add(new StudentDetails("danni", 4, "pass"));

		
	}
/*
	@Test
	public void testGet() {
		add();
		StudentDetails ex = obj1.getStudent(0);
		
		
		
		StudentDetails ex2 = new StudentDetails("cortex",4,"pass");
		assertNotEquals(ex, ex2);
	}*/
	
	

}
