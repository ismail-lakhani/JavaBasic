import java.util.Scanner; //importing package for using scanner class

public class Array {
	
	//Declaring variables and their data types
	private static Scanner input;
	public static double sum =0;
	
	//Author- Mohd Ismail Farooq Lakhani 
	
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in); //Using scanner class
		
		System.out.println("Enter the size of the array"); // asking user for the array size
		int arr_length = input.nextInt(); //Reading the user input and saving it in arr_size
		
		double[] a1 = new double [arr_length]; //Creating an array 
		
		//'for' loop for populating the values in the array
		for(int i =0; i < arr_length; i++) {
			
			System.out.println("Enter the "+(i+1)+" value");
			a1[i] = input.nextDouble();
		}
		
		//Displaying the values of the array
		System.out.println("Values in the array are: ");
		
		//'for' loop to display and add the values in the array
		for(int i =0; i < arr_length; i++) {
			
			System.out.println(a1[i]);	
			sum = sum + a1[i];
			}
		
		System.out.println("\nSum of the values in the array :" + sum );
		
		}//End of main method	
	}//End of program



