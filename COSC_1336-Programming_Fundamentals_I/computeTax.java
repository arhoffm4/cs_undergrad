package summer2021;

/*

Write a program to compute personal income tax. Your program should prompt the user 
to enter the filing status and taxable income and print their taxable income. 

Enter 0 for single filers, 1 for married filing jointly or qualified widow(er), 
2 for married filing separately, or 3 for head of household.

*/
import java.util.Scanner;

public class computeTax {

	public static void main(String[] args) {
			
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for filing status
		System.out.println(" 0 - Single Filer\n 1 - Married File Jointly or Qualified Widow(er)\n 2 - Married File Separately\n 3 - Head of Household\n");
		System.out.print("Enter Filing Status: ");
		int status = input.nextInt();
		
		//Prompt user to enter taxable income
		System.out.print("Enter Taxable Income For Filing Year: ");
		double income = input.nextDouble();
		
		// Compute tax
		double tax = 0;
		
		if (status == 0) { // Compute tax for single filers
			if (income <= 8350)
			  tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		}
		
		else if (status == 1) { // Compute tax for Married File Jointly
			if (income <= 16700)
				  tax = income * 0.10;
			else if (income <= 67900)
				tax = 16700* 0.10 + (income - 16700) * 0.15;
			else if (income <= 137050)
				tax = 16700* 0.10 + (67900 - 16700) * 0.15 + (income - 67900) * 0.25;
			else if (income <= 208850)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (income - 137050) * 0.28;
			else if (income <= 372950)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
			else
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
						
		}
		
		else if (status == 2) { // Compute tax for Married File Separately
			if (income <= 8350)
				  tax = income * 0.10;
			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 104425)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;
			else if (income <= 186475)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (income - 186475) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104525 - 68525) * 0.28 + (372950 - 186425) * 0.33 + (income - 186475) * 0.35;	
		}
		
		else if (status == 3) { // Compute tax for Head of Household
			if (income <= 11950)
				  tax = income * 0.10;
			else if (income <= 45500)
				tax = 11950 * 0.10 + (income - 11950) * 0.15;
			else if (income <= 117450)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
			else if (income <= 190200)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (income - 117450) * 0.28;
			else if (income <= 372950)
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (income - 190200) * 0.33;
			else
				tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;	
		}
		
		else {
			System.out.println("Error: Invalid Status");
			System.exit(1);
			
		}
		
		// Display result
		System.out.println("Tax owed is " + (int)(tax * 100) / 100.0);
		System.out.println("Net income is " + (income - tax));
		input.close();
	}
}
	


