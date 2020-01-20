package com.ibaseit.banlservicesusingset;

import static org.junit.jupiter.api.Assertions.*;

import java.security.AccessControlContext;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	// new account creation
	AccountDetails ad4243 = new AccountDetails("ad4243", 500.98, 1.5);
	AccountDetails ad4244 = new AccountDetails("ad4244", 700, 2.7);
	AccountDetails ad4245 = new AccountDetails("ad4245", 988, 3.5);

	@Test
	public void collect() {
		Set<Object> set = new HashSet<Object>();
		set.add("ad4243");
		set.add("ad4244");
		set.add("ad4245");

		assertEquals(3, set.size());

		assertEquals(true, set.contains("ad4243"));
		assertEquals(true, set.contains("ad4244"));
		assertEquals(true, set.contains("ad4245"));

	}

	@Test

	public void testIterator() {

		Set<String> set = new HashSet<String>();

		set.add("4");
		for (String s : set) {
			assertEquals(s, "4");
		}

	}

}