
// JAVA Code to count number of digits in an integer

//Importing required packages
import java.util.*;

public class CountNum {

	//Author- Mohd Ismail Farooq Lakhani 
	
	//Creating a class to count digits 
	static class CountDig { 
		  
	    static int countDigit(long n) 
	    { 
	        int count = 0; 
	        // 'While' loop logic for counting the digits
	        while (n != 0) { 
	            n = n / 10; 
	            ++count; 
	        } 
	        return count; 
	    } 
	    
	//Initiating main method
	public static void main(String[] args) {
				
				Scanner input = new Scanner(System.in); //Using scanner class 	     
				System.out.println("Enter the number");
				long n = input.nextLong();
		        System.out.print("Number of digits in " + n+  " is " +countDigit(n)); 
		
		}//End of Main method
	}//End of class
}//End of Program
