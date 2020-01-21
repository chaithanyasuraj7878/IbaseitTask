package com.ibaseit.bankusingset;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import org.apache.log4j.Logger;

import com.ibase.logging.util.LoggerDemo;

public class BussinessLogicForBankTransactionOper {
	private final static Logger logger = Logger.getLogger(LoggerDemo.class);

	Scanner scanner = new Scanner(System.in);
	Set<BankAccount> res;

	public Set<BankAccount> depositAmount(int num, String accNum, Set<BankAccount> set) {
		List<BankAccount> load = new CopyOnWriteArrayList<BankAccount>(set);

		if (num == 1) {
			System.out.println("Enter your ammount");

			double deposit1 = scanner.nextDouble();

			for (BankAccount b : set) {

				double i = b.getBalance() + deposit1;

				if (b.getAccNumber().equals(accNum)) {

					load.remove(b);

					load.add(new BankAccount(accNum, i));
					Set<BankAccount> res = new HashSet<>(load);
					System.out.println(res);

				}
			}

		}
		return res;
	}

	public Set<BankAccount> removeAccount(int num, String accNum, Set<BankAccount> set) {
		List<BankAccount> load = new CopyOnWriteArrayList<BankAccount>(set);

		if (num == 2) {

			for (BankAccount b1 : set) {
				if (b1.getAccNumber().equals(accNum)) {
					load.remove(b1);
					Set<BankAccount> res = new HashSet<>(load);
					System.out.println(res);
				}
			}
		}
		return res;
	}

	public Set<BankAccount> withdrawAmount(int num, String accNum, Set<BankAccount> set) {
		List<BankAccount> load = new CopyOnWriteArrayList<BankAccount>(set);

		if (num == 3) {

			System.out.println("Eenter your ammount");

			double withdraw = scanner.nextDouble();

			for (BankAccount a : set) {

				double j = a.getBalance() - withdraw;

				if (a.getAccNumber().equals(accNum)) {

					load.remove(a);

					load.add(new BankAccount(accNum, j));
					Set<BankAccount> res = new HashSet<>(load);

					System.out.println(res);

				}
			}
		}
		return res;
		
		
		
	}

	

}
