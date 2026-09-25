package com.practice.variables;

public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int workingDays = 22;
		int dailyHours = 8;
		double hourlyRate = 25.50;
		
		int totalHours = workingDays * dailyHours;
		double totalSalary = totalHours * hourlyRate;
		int salaryWithoutDecimal = (int)totalSalary;
		
		int completedTasks = 17;
		int totalTasks = 20;
		double completionPercentage =
				(((double) completedTasks / totalTasks) * 100);
		System.out.println("Total Hours: " + totalHours );
		System.out.println("Total Salary:" + totalSalary);
		System.out.println("Salary without decimal: " + salaryWithoutDecimal);
		System.out.println("completionPercentage " + completionPercentage);
		
		
	}

}
