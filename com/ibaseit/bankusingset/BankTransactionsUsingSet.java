package com.ibaseit.bankusingset;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class BankTransactionsUsingSet {

	Scanner scanner = new Scanner(System.in);
	BussinessLogicForBankTransactionOper obj = new BussinessLogicForBankTransactionOper();
	Set<BankAccount> mainSet = new HashSet<BankAccount>();

	public void transactions() {

		BankAccount acc123 = new BankAccount("acc123", 500.00);
		BankAccount acc125 = new BankAccount("acc125", 600.00);
		BankAccount acc124 = new BankAccount("acc124", 600.00);
		BankAccount acc127 = new BankAccount("acc127", 900.00);
		BankAccount acc300 = new BankAccount("acc300", 700.00);

		mainSet.add(acc123);
		mainSet.add(acc125);
		mainSet.add(acc124);
		mainSet.add(acc127);
		mainSet.add(acc300);

		System.out.println(mainSet);
		System.out.println("enter your account number");
		String accNum = scanner.next();
		
		Set<String> com = new HashSet<String>();
		com.add(accNum);

		List<BankAccount> load = new CopyOnWriteArrayList<BankAccount>(mainSet);
		System.out.println("select the  following options to continue");
		System.out.println("1.enter 1 for deposit \n 2.enter 2 for remove account \n 3.enter 3 for withdrawal");
		int n = scanner.nextInt();

		switch (n) {

		case 1:
		
			obj.depositAmount(n, accNum, mainSet);
			break;

		case 2:
			obj.removeAccount(n, accNum, mainSet);
			break;

		case 3:
			obj.withdrawAmount(n, accNum, mainSet);
			break;

		default:
			System.out.println("exit or enter valid number");
		}

		scanner.close();
		
	}
	
	
	

}
