package cosc1336;

/**
Andrew Hoffman
COSC 1336
Programming Assignment 3
Due: 20210303

Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit integer.  
The program prompts the user to enter a three-digit integer and determines whether the user wins according to the following rules:
    • If the user input matches the lottery number in the exact order, the award is $10,000.
    • If all digits in the user input match all digits in the lottery number, the award is $3000.
    • If one digit in the user input matches a digit in the lottery number, the award is $1000.
**/

import java.util.Scanner;

public class LotteryAndrewHoffman {
	
	public static void main(String[] args) {
		
		// Generate a lottery
		int lottery = 100 + (int)(Math.random() * ((999 - 100) + 1));
		//int lottery = 233;
		
		
		// Prompt user for entry
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (three digits}: ");
		int guess = input.nextInt();
		
		
		// Get digits from lottery
		int lottDigit1 = lottery / 100;
		int lottDigit2 = lottery % 100 / 10;
		int lottDigit3 = lottery % 10 ;

		//System.out.println(lottDigit1 + "" + lottDigit2 + "" + lottDigit3);
		
		// Get digits from guess
		int guessDigit1 = guess / 100;		
		int guessDigit2 = guess % 100 / 10;
		int guessDigit3 = guess % 10;
				
		//System.out.println(guessDigit1 + "" + guessDigit2 + "" + guessDigit3);
		
		System.out.println("Lottery is " + lottery);
		
		// Check the guess
		if (guess == lottery) { 		
			System.out.println("Exact match: you win $10,000"); // If exact match, user wins $10,000
		}
		
		else if (((guessDigit1 == lottDigit1) || (guessDigit1 == lottDigit2) ||  (guessDigit1 == lottDigit3)) &&
				((guessDigit2 == lottDigit1) || (guessDigit2 == lottDigit2) || (guessDigit2 == lottDigit3)) &&
				((guessDigit3 == lottDigit1) || (guessDigit3 == lottDigit2) || (guessDigit3 == lottDigit3))) {
			System.out.println("Match all digits: you win $3,000");
		}
		
		else if (guessDigit1 == lottDigit1	
				|| guessDigit1 == lottDigit2
				|| guessDigit1 == lottDigit3
				|| guessDigit2 == lottDigit1
				|| guessDigit2 == lottDigit2
				|| guessDigit2 == lottDigit3
				|| guessDigit3 == lottDigit1
				|| guessDigit3 == lottDigit2
				|| guessDigit3 == lottDigit3) {
			System.out.println("Match one digit: you win $1,000");	// If one digit matches, user wins $1,000
		}	
		
		else {
			System.out.println("Sorry, no match");	// If no digits match, user does not win
		}
		
		input.close();
		
	}

}
