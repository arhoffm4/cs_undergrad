package cosc1336;

/**

COSC 1336
Programming Assignment 5

Write a program that prompts the user to enter the 
number of students and each student’s name and score 
and finally displays the student with the highest 
score and the student with the second highest score.  
Use the next() method in the Scanner class to read a 
name, rather than using the nextLine() method.  
Assume that the number of students is at least 2

**/

import java.util.Scanner;

public class HighestScores {

	public static void main(String[] args) {
		
		// Create a new Scanner Object
		Scanner input = new Scanner(System.in);

		// Prompt user to enter the number of students
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		double score, 				// Holds student's score		
			highest = 0, 			// Highest score 
			secondHighest = 0;		// Second highest score
		String name = "", 			// Holds student's name
			student1 = "", 			// Highest scoring student name
			student2 = "";			// Second highest scoring student name
		
		// Prompt user to enter name and score of each student
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print(
				"Enter a student name: ");
			name = input.next();
			System.out.print("Enter a student score: ");
			score = input.nextInt();

			if (i == 0) {
				// Make the first student the highest scoring student so far
				highest = score;
				student1 = name;
			}
			else if (i == 1 && score > highest) {
				/* Second student entered scored 
				 * higher than first student */
				secondHighest = highest;
				highest = score;
				student2 = student1;
				student1 = name;
			}
			else if (i == 1) {
				/* Second student entered scored
				 * lower than first student */
				secondHighest = score;
				student2 = name;
			}		
			else if (i > 1 && score > highest && score > secondHighest) {
				// Last student entered has the highest score 
				secondHighest = highest;
				student2 = student1;
				highest = score;
				student1 = name;
			}
			else if (i > 1 && score > secondHighest) {
				// Last student entered has the second highest score 
				student2 = name;
				secondHighest = score;
			}
		}

		/* Display the student with the highest score 
		 * and the student with the second highest score. */
		System.out.println(
			"Top two students: \n" +
			student1 + "'s score is " + highest + "\n" + 
			student2 + "'s score is " + secondHighest);
	
		input.close();
	}
		
}
