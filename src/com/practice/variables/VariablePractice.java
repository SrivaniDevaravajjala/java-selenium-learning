package com.practice.variables;

public class VariablePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accountBalance = 1000;
		int backupBalance = 0;
		System.out.println("Account Balance: " + accountBalance);
		
		accountBalance = 1500;
		System.out.println("Updated Account Balance: " + accountBalance);
		
		backupBalance = accountBalance;
		accountBalance = 2000;
		
		System.out.println("Backup Balance is: " + backupBalance);
		System.out.println("The final Balance is: " + accountBalance);
	}

}
