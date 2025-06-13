package cosc1336;

/**
COSC 1336
Programming Assignment 4

Write a program that prompts the user to enter a decimal number 
between 0 and 15 and displays its corresponding binary value.

**/

import java.util.Scanner;

public class DecimalToBinary{
	
	public static void main(String[] args) {
		
		// Create new Scanner Object
		Scanner input = new Scanner(System.in);

		// Prompt user for decimal integer between 0 and 15
		System.out.print("Enter a decimial integer between 0 and 15: ");
		int decimal = input.nextInt();

		// Convert decimal number to binary 
		String binary = "";	// Holds binary value
		
		for (int i = decimal; i > 0; i /= 2) {
			binary = (i % 2) + binary; 
		}

		// Display resulting binary value the decimal integer
		System.out.println("The binary value of the decimial \"" + decimal + "\" is: " + binary);

		input.close();
		
	}
		
	
}
	

