package cosc1336;

/**
COSC 1336
Programming Assignment 2

Compute and print the future value of an investment based 
on user input of initial investment, length of investment, 
and expected annual interest rate.
**/

// Import packages
import java.util.Scanner;
import java.lang.Math;

public class InvestmentValue {

	public static void main(String[] args) {
		
		// Create new Scanner Object
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nEnter the investment amount, for example 120000.95: " ); // Prompt user for principal investment
		
		double investmentAmount = input.nextDouble(); // Declare variable investmentAmount
		
		System.out.print("Enter annual interest rate, for example 8.25: "); // Prompts for interest rate
		
		double monthlyInterestRate = input.nextDouble(); // Declare variable monthlyInterestRate
		
		// Prompt user for number of years
		System.out.print("Enter number of years as an integer, for example 5: "); 
		
		double numberOfYears = input.nextDouble(); // Declare variable numberOfYears
		
		// Compute total based on principal investment, interest rate, and years invested, rounded to 1/100
		double futureInvestmentAmount = Math.round((investmentAmount * 
			Math.pow((1 + (monthlyInterestRate / 12.0 / 100.0)),(numberOfYears * 12.0))) * 100.0) / 100.0; 
		
		System.out.print("Future value is $" + futureInvestmentAmount); // Prints resulting principal plus return
				
		input.close();	
	}
}
