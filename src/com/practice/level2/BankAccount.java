package com.practice.level2;

public class BankAccount {
	static String accountHolder = "Srivani";
	static String accountType = "savings";
	
	public static void showAccountHolder() {
		System.out.println("Account Holder:" + accountHolder);
		
	}
	public static void showAccountType() {
		System.out.println("Account Type:" + accountType);
	}
	public static void showBankDetails() {
		showAccountHolder();
		showAccountType();
	
}

}
