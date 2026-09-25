package com.practice.masterchallenge;

public class Payment {
	
	public static void processPayment(){
		System.out.println("Payment processing");
		verifyPayment();
	}
	public static void verifyPayment() {
		System.out.println("Payment verified");
		Notification.sendConfirmation();
	}

}
