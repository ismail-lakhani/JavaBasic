//importing the required scanner package
import java.util.Scanner;

public class TempConvertor {
	
	//Author- Mohd Ismail Farooq Lakhani 

	private static Scanner input;
	
	
	
	
	//Initiating main method
		public static void main(String[] args) {
			
			input = new Scanner(System.in);
			
			//Declaring variables 
			int choice;
			
			//Displaying output to the user
			System.out.println("Welcome to the temperature convertor");
			System.out.println("Choose the conversion units from the below option");
			System.out.println("1. Fahrenheit to Celsius \n" + "2. Celsius to Fahrenheit\n" + "3. Exit");
			choice = input.nextInt(); //Reading the input from the user
			
			//Swith-case statement to call the respective method as per user choice
			switch (choice)
			{
			//Fahrenheit to Celsius
			case 1: {
				F2C();	
				break;
			}//End of case 1
			//Celsius to Fahrenheit
			case 2: {
				C2F();
				break;
			}//End of case 2
			case 3:  
				System.out.println("Thank you for using our convertor");
				break;
			
			default: System.out.println("Invalid entry");
			break;
			
			
		}
			while (choice !=3);
			input.close();
			//End of main method
		}
		//Method to convert celsius to fahrenheit temperature 
		//C2F = Celsius To Fahrenheit temperature 
		public static double C2F () { 
			Scanner input1 = new Scanner(System.in);
			
			//Asking for input from the user
			System.out.println("Please enter the celsius temperature");
			double celInput = input1.nextDouble();//Reading the user input
			//Calculation to convert celcius to fahrenheit
			int conFar = (int)(9.0/5.0 * (celInput) +32);
			//Displaying the output
			System.out.println("Temperature in Fahrenheit is " + (int)conFar);
			return conFar;	
		}//End of method 
		//Method to convert fahrenheit to celcius temperature
		//F2C= Fahrenheit To Celcius
		public static double F2C () {
			
			Scanner input1 = new Scanner(System.in);
			
			//Asking for input from the user
			System.out.println("Please enter the Fahrenheit temperature");
			double farInput = input1.nextDouble();
			//Calculation to convert fahrenheit to celcius
			int conCel = (int) (5.0/9.0*((farInput)-32));
			//Displaying the output
			System.out.println("Temperature in Celcius is " + (int)conCel);
			return conCel;	
		}//End of method		
		
}//End of program
