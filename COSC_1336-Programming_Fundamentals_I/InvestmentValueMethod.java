package cosc1336;

/******************************************

COSC 1336
Programming Assignment 6

Write a method that computes future investment 
value at a given interest rate for a specified 
number of years using the following formula:
futureInvestmentValue = investmentAmount x 
	(1 + monthlyInterestRate)numberOfYears x 12

Use the following method header:
public static double futureInvestmentValue(
	double investmentAmount, double monthlyInterestRate, int years)

For example, futureInvestmentValue(10000, 5/1200, 5) 
returns 12833.59.  

Write a test program that prompts the user to 
enter the investment amount (e.g., 1,000) and 
interest rate (e.g., 4%) and prints a table that 
displays future value for the years from 1 to 20.

******************************************/

import java.util.Scanner;

public class InvestmentValueMethod {

	/** Main Method */
	public static void main(String[] args) {
		
		// Create new Scanner Object
		Scanner input = new Scanner(System.in); // Create a Scanner
		final int numberOfYears = 20; // Number of years to display

		// Prompt user for input - Investment Amount
		System.out.print("Investment amount: ");
		double amount = input.nextDouble();
		
		// Prompt user for input - Annual Interest Rate
		System.out.print("Annual interest rate: ");
		double annualInterestRate = input.nextDouble();

		// Convert to monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;

		// Print table of future value for years 1 to 20
		System.out.println("Years	   Future Value"); // Table header
		for (int years = 1; years <= numberOfYears; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", 
		futureInvestmentValue(amount, monthlyInterestRate, years));
		
		input.close();	
			
		}
	
	}

	/** futureInvestmentValue method to calculate future investment value */ 
	public static double futureInvestmentValue(
		double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}	
}
