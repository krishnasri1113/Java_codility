import java.text.NumberFormat;
import java.util.Scanner;

public class coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quarters, dimes, nickels, pennies;
		 // Write variables for dollars and cents
		   	double dollars = 0;
		    double totalCents = 0;
		 // create Scanner object
		    Scanner scan  = new Scanner(System.in);  
		 // Reading number of quarters
		    System.out.print("Number of quarters:");
		    quarters = scan.nextInt();
		 // number of dimes
		    System.out.print("Number of dimes: ");
		    dimes = scan.nextInt();
		 // number of nickels 
		    System.out.print("Number of nickels: ");
		    nickels = scan.nextInt();
		 // number of pennies
		    System.out.print("Number of pennies: ");
		    pennies = scan.nextInt();
		 //  quarter = 25 cents, 1 dime = 10 cents
		 // 1 nickel = 5 cents, and 1 penny = 1 cent.
		 // Therefore, we will first convert all denominations into
		 // cents and store it into totalCents. After we convert it 
		 // into dollars by dividing by 100. Let's do it
		    totalCents = 25*quarters + 10*dimes + 5*nickels + 1*pennies;
		 // Calculating total dollars
		    dollars = totalCents/100;
		 // print output with appropriate formatting
		    NumberFormat money = NumberFormat.getCurrencyInstance();
		 // Print dollars and cents        
		    System.out.print("Value of currency in dollars and cents: "+money.format(dollars));
		   }

	}


