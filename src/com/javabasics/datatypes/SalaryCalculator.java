package com.javabasics.datatypes;

public class SalaryCalculator {
	

	public static void main(String[] args) {
		int basicSalary = 25000;
		int bonus = 5500;
		int totalSalary = basicSalary + bonus;
		System.out.println("Total Salary:" + totalSalary);
		
		int workingDays = 22;
		double avgSalary = (double)(totalSalary)/(double) (workingDays);
		System.out.println("Average Daily Salary:" + avgSalary);
	
		
		int avgSalCasted = (int) avgSalary;
		System.out.println("Average Daily Salary (Whole Number): "+avgSalCasted);
	
}

}