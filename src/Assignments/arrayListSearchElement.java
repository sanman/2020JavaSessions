//Write a Java program to search an element in a array list.

package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayListSearchElement {

	public static void main(String[] args) {
		ArrayList<String>  li = new ArrayList<String>(Arrays.asList("Gaurav", "Sam", "Naveen", "Manan", "Ram", "Rajat", "Akhil"));
		//Create a scanner object

		Scanner userValToSearch= new Scanner(System.in);
		//Print a message to get the new array element
		System.out.println("Enter the array element you want to search: ");
		//Type-cast and assigning the input value to a variable
		
		String userValueToSearch = userValToSearch.nextLine(); 
		userValToSearch.close();
		
		
	     int index = li.indexOf(userValueToSearch);

	     if(index == -1)
	        System.out.println("The element " + userValueToSearch + " is not in the ArrayList");
	     else
	        System.out.println("The element " + userValueToSearch + " is in the ArrayList at index " + index);
	}

}
