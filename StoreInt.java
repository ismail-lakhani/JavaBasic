import java.util.List;//used for importing both array and linked list 
import java.util.ArrayList;//used for importing array list 
import java.util.LinkedList;//used for importing linked list 
	
	//Author- Mohd Ismail Farooq Lakhani 

public class StoreInt {
	 
	 
	public static void main(String[] args)  
	{ 
	
	//Declaration of array list 
	//List<Integer> arrList = new ArrayList <>();
	
	//Declaration of linked list
	List<Integer> arrayList = new LinkedList<>(); 
	
	for (int x= 0;x <10 ;x++) 
	{ 
		//Casting the math.random return from double to integer
		int y = ((int)(Math.random() *10) + 1) ;   
		//Function to add the elements to the arraylist/ linkedlist ; 
		arrayList.add(y);
	} 
	 
	//Displaying the arrList before removing any value
	//System.out.println("Contents in arraylist before removing a value\n"); 
	
	 //Displaying the linkdList before removing any value
	 System.out.println("\nContents in linkdlist before removing\n");
	
	//Enhanced for loop to traverse the array and display the contents of the ArrList
	for (int z :arrayList) 
	{ 
	System.out.println(z); 
	} 
	//Removing values from arrList 
	arrayList.remove(2); 
	 
 
	
	//System.out.println("\nContents in arrList after removing a value\n"); 
	 
	//Displaying the linkdList before removing any value
	System.out.println("\nContents in linkdlist after removing\n");
	
	 
	//Enhaced for loop printing the array list or linked list in tranpose manner 
	for (int i :arrayList) 
	{ 
	System.out.println(i); 
	} 
	}//end of main() 
	 
}//end of class()

