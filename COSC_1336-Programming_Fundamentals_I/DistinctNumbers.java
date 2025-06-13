package cosc1336;

/******************************************

COSC 1336
Programming Assignment 7

Write a program that reads in 10 numbers and 
displays the number of distinct numbers and 
the distinct numbers in their input order and 
separated by exactly one space (i.e., if a 
number appears multiple times, it is displayed 
only once).  (Hint:  Read a number and store it 
in an array if it is new.  If the number is 
already in the array, ignore it.)  After the 
input, the array contains the distinct numbers. 

******************************************/

import java.util.Scanner;

public class DistinctNumbers {

	/** Main Method */
	public static void main(String[] args) {
		
		// Create New Scanner Object
		Scanner input = new Scanner(System.in);

		int[] distinctNumbers = new int[10];	// Create Array of length 10
		int num; int count = 0;	// User input; Initial count

		// Prompt User for Input - 10 Numbers
		System.out.print("Enter 10 numbers: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();

			// Test for Distinct num
			if (isDistinct(distinctNumbers, num)) {
				distinctNumbers[count] = num;
				count++;	// Increment count
			}
		}

		input.close();
		
		// Display Number of Distinct Integers
		System.out.println("The number of distinct integers is " + count);
		
		// Display Distinct Integers
		System.out.print("The distinct integers are");
		
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();
	}
	
	/** Method isDistinct 
	 * 	Returns true if integer is not in array 
	 * 	Returns false otherwise */
	public static boolean isDistinct(int[] array, int num) {
		
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
}
