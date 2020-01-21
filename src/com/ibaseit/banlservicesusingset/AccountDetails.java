package src.com.ibaseit.banlservicesusingset;


public class AccountDetails {
	private String accountnumber;
	private double balance;
	private double interest;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	@Override
	public String toString() {
		return "AccountDetails [balance=" + balance + ", interest=" + interest + ", accountnumber=" + accountnumber
				+ "]";
	}

	public AccountDetails(String accountnumber, double balance, double interest) {
		super();
		this.accountnumber = accountnumber;
		this.balance = balance;
		this.interest = interest;
	}

	/*
	 * public AccountDetails () { balance = 0; interest = 0; accountnumber = ""; }
	 * 
	 * public AccountDetails(String accountnumber,double initialBalance, double
	 * initialInterest) { balance = initialBalance; interest = initialInterest;
	 * accountnumber =accountnumber; }
	 * 
	 * List list = new ArrayList();
	 */
	/*
	 * public void deposit(double amount) { balance = balance + amount; }
	 * 
	 * public void withdraw(double amount) { balance = balance - amount; }
	 * 
	 * public void addInterest() { balance = balance + balance * interest; }
	 * 
	 * public double getBalance() { return balance; }
	 */

}
