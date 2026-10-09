package com.challenge.finalone;

public class Transaction {
public static void startTransaction() {
	System.out.println("Transaction Initiated");
	validateAccount();
	System.out.println("Transaction Approved");
	
}
public static void validateAccount() {
	System.out.println("Account Validated");
	sendOTP();
	
}
public static void sendOTP() {
	System.out.println("OTP Sent");
}
}
