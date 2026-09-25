package com.learning.basics;

public class VariableDemo {
	
	static int totalTests = 0;        // static variable — shared across all instances
    int testId;    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20; 
		System.out.println("a = " + a + ", b = " + b);
		runTest();
		sayHello();
	}
	
	public static void runTest() {
		 int retryCount = 0;           // local variable — exists only inside this method
	        retryCount++;
	        totalTests++;
	        System.out.println(retryCount);
	}
	
	public static void sayHello()
	{
		String name = "Srivani";
		System.out.println(name);
	}
	
}
