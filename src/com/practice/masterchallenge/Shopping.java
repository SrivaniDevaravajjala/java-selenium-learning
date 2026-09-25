package com.practice.masterchallenge;

public class Shopping {
	public static void selectProduct() {
		System.out.println("Product selected");
		addToCart();
	}
	public static void addToCart() {
		System.out.println("Product added to cart");
		checkout();
	}
	public static void checkout() {
		System.out.println("Checkout started");
		Payment.processPayment();
		
	}

}
