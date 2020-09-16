import java.util.Scanner;

public class monteryamount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//int amounts = 0; //input variables
	     int dollars, quarters, dimes,  pennies; //output variable
////	     double dollarsValue= 1.00;
////	     double quartesValue= 0.25;
////	     double dimesValue= 0.10;
////	     double penniesValue= 0.01;
//	     long currentMoney, totalCents, Dollars, Dimes, Nickels, Pennies;
//		double Quarters;
//	     long remaining1,remaining2,remaining3;
////	     Scanner input = new Scanner(System.in);
////	     	
// System.out.println("Enter current money");
//	     currentMoney= in.nextInt();
//	     totalCents= currentMoney* 100;
//	     	
//	     Dollars= currentMoney/100;
//	     remaining1= Dollars % 100;
//	     	
//	     Quarters = Dollars*0.25;
//	    // remaining2= Quarters % 25;
//	     	
//	     //Dimes= remaining2/10;
//	     //remaining3= Dimes % 10;
//	     	
//	     //Nickels= remaining3/5;
//	    // Pennies= Nickels % 5;
//	     	
//	     System.out.print(Dollars+ " dollars " +Quarters+" quarters "+Dimes +" Dimes "+Pennies+" pennies");

	     System.out.print("Enter an amount in cent:");
	    int amount = in.nextInt();
           System.out.print("number of dollars");
	    	     dollars= in.nextInt();
	    	     System.out.print("number of quarters");
	    	     quarters= in.nextInt();
	    	     System.out.print("number of dimes");
	    	     dimes= in.nextInt();
	    	     System.out.print("number of pennies");
	    	     pennies= in.nextInt();
	    	     System.out.println("number of coins = "+(dollars+quarters+dimes+pennies)); 
            double  numberCoins=dollars+quarters+dimes+pennies;
	    	System.out.println("total number of coins" +numberCoins);



	    	  }
	}


