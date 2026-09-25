package com.practice.level3;

public class Order {
	public static void placeOrder() {
		System.out.println("Order placed");
		processPayment();
	}
	public static void processPayment(){
		System.out.println("Payment processed");
		sendConfirmation();
	}
	public static void sendConfirmation(){
		System.out.println("Confirmation sent");
	}
}
