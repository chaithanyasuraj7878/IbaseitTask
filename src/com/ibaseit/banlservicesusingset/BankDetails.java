package com.ibaseit.banlservicesusingset;

public class BankDetails
{


public BankDetails(long accountnumber) {
		super();
		this.accountnumber = accountnumber;
	}

long accountnumber;

public long getAccountnumber() {
	return accountnumber;
}

@Override
public String toString() {
	return "BankDetails [accountnumber=" + accountnumber + "]";
}



}
