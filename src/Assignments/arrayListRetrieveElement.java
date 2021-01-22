//Write a Java program to retrieve an element (at a specified index) from a given array list.

package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayListRetrieveElement {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>(Arrays.asList("Gaurav", "Vishwas", "Rajat", "Mukesh", "Naveen"));
		//Create a scanner object
		//TODO - Check resource leak
		Scanner indexNum= new Scanner(System.in);
		//Print a message
		System.out.println("Enter the index position for which you want to retrieve the element: ");
		//Type-cast and assigning the input value to a variable
		int indexPos = Integer.parseInt(indexNum.nextLine());
		//Close the scanner object
		indexNum.close();
		//Check if user entered index is within the bound
		if(indexPos <= students.size()-1) {
			System.out.println("Retrieved from index " + indexPos +": " + students.get(indexPos));
		} else {
			System.out.println("Index out of bound");
		}
		
	}

}
