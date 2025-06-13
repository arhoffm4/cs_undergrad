package cosc1336;

public class ChapterOne {
	
	
	// Chapter One Exercises from Revel
	public static void main(String[] args) {

		
		// Exercise 1
		System.out.println("\n\n----Exercise01_01----\n");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Computer Science");
		System.out.println("Programming is fun");
	

		// Exercise 2
		System.out.println("\n\n----Exercise01_02----\n");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		System.out.println("Welcome to Java");
		
	
		// Exercise 3
		System.out.println("\n\n----Exercise01_03----\n");
		System.out.println("    J     A     V     V    A    ");
		System.out.println("    J    A A     V   V    A A   ");
		System.out.println("J   J   AAAAA     V V    AAAAA  ");
		System.out.println(" J J   A     A     V    A     A ");
		

		// Exercise 4
		System.out.println("\n\n----Exercise01_04----\n");
		System.out.println("a	a^2	a^3");
		System.out.println("1	1	1");
		System.out.println("2	4	8");
		System.out.println("3	9	27");
		System.out.println("4	16	64");
		

		// Exercise 5
		System.out.println("\n\n----Exercise01_05----\n");
		System.out.print("(9.5 * 4.5 - 2.5 * 3.0) / (45.5 - 3.5) = ");
		System.out.println((9.5 * 4.5 - 2.5 * 3.0) / (45.5 - 3.5)); 
		
		
		// Exercise 6
		System.out.println("\n\n----Exercise01_06----\n");
		System.out.print("(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9) = ");
		System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
		System.out.println("");
		
	
		// Exercise 7
		System.out.println("\n\n----Exercise01_07----\n");
		System.out.print("(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11))) = ");
		System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
		System.out.print("(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13))) = ");
		System.out.println(4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13)));
		
		
		// Exercise 8
		System.out.println("\n\n---Exercise01_08----\n");
			// Assign Variables
		double r = 5.5;
		double pi = 3.14159;
			// Define Perimeter and Area Equations
		double p = 2 * r * pi;	
		double A = r * r * pi;
			// Print Result
		System.out.println("The Perimeter of a Circle with Radius 5.5 = " + p);
		System.out.println("The Area of a Circle with Radius 5.5 = " + A);
		
		
		// Exercise 9
		System.out.println("\n\n---Exercise01_09----\n");
			// Assign Variables
		double w = 4.5;
		double h = 7.9;
			// Define Perimeter and Area Equation
		double a1 = w * h;
		double p1 = 2 * w + 2 * h;
			// Print Result
		System.out.println("The Area of a rectangle with Height 7.9 and Width 4.5 = " + a1);
		System.out.println("The Perimeter of a rectangle with Height 7.9 and Width 4.5 = " + p1);
		
		
		// Exercise 10
		System.out.println("\n\n---Exercise01_10----\n");

		double distanceK = 14.0; // Distance Kilometers
		double distanceM = distanceK / 1.609344; // Distance Miles
		double timeHours = 45.5 / 60; // Time in Hours
		double avgMph = distanceM / timeHours; // Average Speed in Mph
		
		System.out.println("Distance Kilometers = " + distanceK); // Print Distance K
		System.out.println("Distnace Miles = " + distanceM); // Print Distance M
		System.out.println("Total Time Hours = " + timeHours); // Print Time in Hours
		System.out.println("Average Speed in Mph = " + avgMph); // Print Avg Speed in Mph
		
		
		// Exercise 11
		System.out.println("\n\n---Exercise01_11----\n");

			// Assign Variables and Set Equations
		double initialPop = 312032486.0; // Initial Population
		double secondYear = 365.0 * 24.0 - 60.0 * 60.0; // Seconds in a Year
		System.out.println("Second in a year = " + secondYear);
		double birth = secondYear / 7.0; // Births Per Year
		System.out.println("Births in a year = " + birth);
		double death = secondYear / 13.0; // Deaths Per Year
		System.out.println("Deaths in a year = " + death);
		double immigrant = secondYear / 45.0; // Immigrants Per Year
		System.out.println("Immigration in a year = " + immigrant);
		
			// Print Results
		System.out.println("\nInitial Population = " + initialPop);
		double pop1 = initialPop + birth - death + immigrant; // Population After One Year
		System.out.println("\nPopulation after Year 1 = " + pop1);
		double pop2 = pop1 + birth - death + immigrant; // Population After Two Years
		System.out.println("Population after Year 2 = " + pop2);
		double pop3 = pop2 + birth - death + immigrant; // Population After Three ears
		System.out.println("Population after Year 3 = " + pop3);
		double pop4 = pop3 + birth - death + immigrant; // Population After Four Years
		System.out.println("Population after Year 4 = " + pop4);
		double pop5 = pop4 + birth - death + immigrant; // Population After Five Years
		System.out.println("Population after Year 5 = " + pop5);
		
		
		// Exercise 12
		System.out.println("\n\n---Exercise01_12----\n");

		double distM = 24.0; // Distance Miles
		double distK = distM * 1.609344; // Distance Kilometers
		double timeHrs = (100.0 + (35.0 / 60.0)) / 60.0; // Time in Hours
		double avgKph = distK / timeHrs; // Average Speed in Mph
		
		System.out.println("Distnace Miles = " + distM); // Print Distance M
		System.out.println("Distance Kilometers = " + distK); // Print Distance K
		System.out.println("Total Time Hours = " + timeHrs); // Print Time in Hours
		System.out.println("Average Speed in Kph = " + avgKph); // Print Avg Speed in Kph
		
		// Exercise 13
		System.out.println("\n\n---Exercise01_13---\n");

		double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9, x, y;
		if (a * d - b * c == 0)
			System.out.println("The equation has no solution.");
		else {
			x = ((e * d - b * f) / (a * d - b * c));
			y = ((a * f - e * c) / (a * d - b * c));
			
		System.out.println("a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9, x, y");
		System.out.println("x = ((e * d - b * f) / (a * d - b * c))");
		System.out.println("y = ((a * f - e * c) / (a * d - b * c))");
		System.out.println("x = " + x + "\ny = " + y);
		
		}
	}
}






