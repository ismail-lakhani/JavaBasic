import java.text.DecimalFormat; //Importing Packages for Decimal Format
import java.util.Scanner; //Package for taking the input from the user

public class Concert {

	private static Scanner input;
	private static DecimalFormat df;
	
	/*Author- Mohd Ismail Farooq Lakhani 
		*/

	public static void main(String[] args) {
 		
	//Initializing variables with desired data types
	int SoldA, SoldB, SoldC =0;   
	float PriceA,PriceB = 0,PriceC = 0;
		
		
	System.out.println("Welcome to the concert ticket information system \n\n");
	
	input = new Scanner(System.in); //Use of scanner class
	df = new DecimalFormat("0.00");
	
	System.out.println("Enter number of A seats sold"); 
	SoldA = input.nextInt(); //Reading the input from the user
	
	System.out.println("Per ticket Price of A");//Asking for input from the user
	PriceA = input.nextFloat();
	
	System.out.println("Enter number of B seats sold");//Asking for input from the user
	SoldB = input.nextInt();
	
	System.out.println("Per ticket Price of B");
	PriceB = input.nextFloat();
	
	System.out.println("Enter number of C seats sold");//Asking for input from the user
	SoldC = input.nextInt();
	
	System.out.println("Per ticket Price of C");
	PriceC = input.nextFloat();
	
	
	System.out.println("\n\t\t Ticket Sold \t Price Per Ticket:" );//arranging it to the desired format using tab and spaces
	System.out.println("\n\t\t ----------- \t ---------------- " );
	
	System.out.println(" A Tickets: \t" + SoldA + "\t\t" + PriceA);
	System.out.println("\n B Tickets: \t" + SoldB + "\t\t" + PriceB);
	System.out.println("\n C Tickets: \t" + SoldC + "\t\t" + PriceC);
	
	//Total output 
	System.out.println( "\n\t\n\t Total Sales €" + ((SoldA*PriceA) + (SoldB*PriceB) + (SoldC*PriceC)) );
	
	}//End of main method
}//End of Program
