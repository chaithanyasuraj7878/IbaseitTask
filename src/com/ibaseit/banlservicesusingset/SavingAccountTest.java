package com.ibaseit.banlservicesusingset;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.junit.jupiter.api.Test;

class SavingAccountTest {

	@Test
	void testMain() {
		
		fail("Not yet implemented");
		
		
		Scanner scan = new Scanner(System.in);
		
		AccountDetails ad4243 = new AccountDetails("ad4243", 500.98, 1.5);
		AccountDetails ad4244 = new AccountDetails("ad4244", 700, 2.7);
		AccountDetails ad4245 = new AccountDetails("ad4245", 988, 3.5);
		Set<AccountDetails> acc = new HashSet<>();
		acc.add(ad4243);
		acc.add(ad4244);
		acc.add(ad4245);
		Set<String> set = new HashSet<String>();
		set.add("ad4243");
		set.add("ad4244");
		set.add("ad4245");
		List<AccountDetails> store = new CopyOnWriteArrayList<>(acc);
		 System.out.println("enter your account number");
		 String accnum = scan.next();
		Set<AccountDetails> result = new HashSet<>();
		if (set.contains("ad4243")) {
			for (AccountDetails res : store) {
				if (res.getAccountnumber().equals("ad4243")) {
					store.remove(res);
					store.add(new AccountDetails("ad4243", 600.23, 1.5));
					 result.addAll(store);
		
	}

}
		}
	}
}
