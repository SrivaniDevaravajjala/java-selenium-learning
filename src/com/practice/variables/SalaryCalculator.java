package com.practice.variables;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int basicSalary = 5000;
		int	bonus = 1000; 
		int totalSalary = basicSalary + bonus; 
		
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("Bonus: " + bonus);
		System.out.println("Total Salary: " + totalSalary);
		
		bonus = 2000;
		totalSalary = basicSalary + bonus;
		System.out.println("Final Total Salary: " + totalSalary);
		
		
		int a = 10;
		int b = 20;

		int c = a + b; //30

		a = 50;//50
		b = c; //30

		c = a + b; //50+30 = 80
		System.out.println(a);//50
		System.out.println(b);//30
		System.out.println(c);//80
		
	}

}
