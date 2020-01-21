package src.com.ibaseit.studentdetailsinlist;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

class StudentList {
	@BeforeClass
	@Test
	public static void main(String[] args) {

	}

	@Test
	public void testAssertList() {

		StudentDetails details;
		List actual = new ArrayList();
		actual.add(new StudentDetails("ram", 1, "fail"));
		actual.add(new StudentDetails("raj", 2, "pass"));
		actual.add(new StudentDetails("ravi", 3, "pass"));

		assertEquals(actual, hasItems("ram", 1, "fail"));

	}

	@Test
	public void testAssetThatExamples() {

		// 'theString' should contain 'S' and 'r'
		assertEquals("ravi", both(containsString("r")).and(containsString("a")));

		// List<String> items = Arrays.asList("John", "James", "Julia", "Jim");
		StudentDetails details;
		List actual = new ArrayList();
		actual.add(new StudentDetails("ram", 1, "fail"));
		actual.add(new StudentDetails("raj", 2, "pass"));
		actual.add(new StudentDetails("ravi", 3, "pass"));

		// assertEquals(true, actual.contains("ram"));

		// items list should have ram and raj
		assertEquals(actual, hasItems("ram", "raj"));

		// Every item in the list should have ravi
		assertEquals(actual, everyItem(containsString("ravi")));

		// check all of the matchers
		assertEquals("ravi", allOf(equalTo("ravi"), startsWith("r")));

		// negation of all of the matchers assertEquals("fail",
		not(allOf(equalTo("fail"), containsString("fail")));

		/*
		 * Result result = JUnitCore.runClasses(StudentList.class); for
		 * (org.junit.runner.notification.Failure failure : result.getFailures()) {
		 * System.out.println(failure.toString()); } System.out.println("Result==" +
		 * result.wasSuccessful());
		 */

	}
	

}
