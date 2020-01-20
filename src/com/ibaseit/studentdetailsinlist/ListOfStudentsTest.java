package com.ibaseit.studentdetailsinlist;

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

	@Test
	public void testAdd() {
		List<StudentDetails> ex = obj1.add(new StudentDetails("danni1", 4, "pass"));
		// List<StudentDetails> list2 = new ArrayList<StudentDetails>();
		list2.add(new StudentDetails("danni", 4, "pass"));
		obj1.add(new StudentDetails("cortex", 7, "fail"));
		assertNotEquals(list2, ex);
	}

	@Test
	public void testRemove() {
		
		  List<StudentDetails> ex = obj1.add(new StudentDetails("danni", 4, "pass"));
	        
	        assertNotEquals(list2, ex);
	        
	        
	        List<StudentDetails> ex1 = obj1.remove(0);
	        assertEquals(list2, ex1);
	        
	        obj1.add(new StudentDetails("danni", 4, "pass"));
		
	}

	

	@Test
	public void testUpdate() {
		
		List<StudentDetails> ex1 = obj1.update(new StudentDetails("danni", 4, "fail"));
        list2.add(new StudentDetails("danni", 4, "fail"));
        
        assertEquals(list2, ex1);

	}

	
}
