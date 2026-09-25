package com.practice.finalchallenge;

public class Login {
	
	public static void enterUsername(){
		System.out.println("Username entered");
		enterPassword();
	}
	public static void enterPassword(){
		System.out.println("Password entered");
		performLogin();
	}
	public static void performLogin(){
		System.out.println("Login successful");
		Dashboard.openDashboard();
		
	}

}
