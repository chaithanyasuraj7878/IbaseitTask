package com.ibaseit.bankusingset;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class BussinessLogicForBankTransactionOperTest {

	BussinessLogicForBankTransactionOper Buss = new BussinessLogicForBankTransactionOper();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDepositAmount() {

		Set<BankAccount> mainSet = new HashSet<>();
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
		Set<BankAccount> res = Buss.depositAmount(1, "acc123", mainSet);
		Set<BankAccount> ex1 = new LinkedHashSet<>(mainSet);
		Set<BankAccount> ex2 = new LinkedHashSet<>(ex1);

		Assert.assertEquals(ex1, ex2);

	}

	@Test
	public void testRemoveAccount() {
		Set<BankAccount> mainSet = new HashSet<>();
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
		Set<BankAccount> res = Buss.removeAccount(2, "acc300", mainSet);
		Set<BankAccount> ex1 = new LinkedHashSet<>(mainSet);
		Set<BankAccount> ex2 = new LinkedHashSet<>(ex1);

		Assert.assertEquals(ex1, ex2);
	}

	@Test
	public void testWithdrawAmount() {
		Set<BankAccount> mainSet = new HashSet<>();
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
		Set<BankAccount> res = Buss.withdrawAmount(3, "acc127", mainSet);
		Set<BankAccount> ex1 = new LinkedHashSet<>(mainSet);
		Set<BankAccount> ex2 = new LinkedHashSet<>(ex1);

		Assert.assertEquals(ex1, ex2);

	}
	
	

}
