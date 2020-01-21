package com.ibaseit.bankusingset;

public class BankAccount {

	private String accNumber;
	private double balance;

	public BankAccount(String accNumber, double balance) {
		super();
		this.accNumber = accNumber;
		this.balance = balance;
	}

	public String getAccNumber() {
		return accNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void close() {
		balance = 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		
		if (obj == null || obj.getClass() != this.getClass())
			return false;

		
		BankAccount customer = (BankAccount) obj;
		if (customer.getAccNumber().equals(this.accNumber) && customer.getBalance() == this.balance)
			return true;

		return false;
	}

	@Override
	public String toString() {
		
		return "BankAccount [accNumber=" + accNumber + ", balance=" + balance + "]";
		
		

	}
}
