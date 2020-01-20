package com.ibaseit.banlservicesusingset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SavingAccount {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// new account creation
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
		System.out.println(store);

	}
	
	public void add()
	{
		
	}
	
	
	
}

		
		
	

		/*
		 * System.out.println(store); Set<AccountDetails> res =
		 * acc.stream().filter(ac->set.contains("ad4243")).collect(Collectors.toSet());
		 * 
		 * System.out.println(res);
		 * 
		 * Iterator value = set.iterator();
		 */

		/*
		 * if (accnum.contains("ad4243")) {
		 * 
		 * System.out.println("enter 1 for deposit");
		 * System.out.println("enter 2 to get balance");
		 * System.out.println("enter 3 to withdrawl"); int n = scan.nextInt();
		 * 
		 * if (n == 1) { System.out.println("enter the amount to deposit"); double
		 * deposit = scan.nextDouble(); ad4243.deposit(deposit);
		 * System.out.println("new balance in your account is rs " +
		 * ad4243.getBalance()); } else if (n == 2) {
		 * System.out.println("The balance in your account is rs " +
		 * ad4243.getBalance()); } else if (n == 3) {
		 * System.out.println("enter the the amount you want to withdrawl"); double
		 * withdrawl = scan.nextDouble(); ad4243.withdraw(withdrawl);
		 * System.out.println("new balance in your account is rs " +
		 * ad4243.getBalance());
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * }
		 */



