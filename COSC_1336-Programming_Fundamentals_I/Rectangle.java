package cosc1336;

/**
COSC 1336
Programming Assignment 1

Compute the area and perimeter of a rectangle 
with width of 8.2 and height of 10.3
**/

public class Rectangle {
	
	public static void main(String[] args) {
		
		// Assign variables
		double height = 10.3; 
		double width = 8.2;
		
		// Calculate Area and Perimeter
		double area = height * width; 
		double perimeter = 2 * (height + width); 

		// Return Values
		System.out.println(area); 
		System.out.println(perimeter); 
	}
}
