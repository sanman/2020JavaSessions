//Write a Java program to update specific array element by given element.

package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayListUpdateElement {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>(Arrays.asList("Gaurav", "Vishwas", "Rajat", "Mukesh", "Naveen"));
		//Create a scanner object
		Scanner indexNum= new Scanner(System.in);
		//Print a message to get the index position
		System.out.println("Enter the index position for which you want to retrieve the element: ");
		Scanner userVal= new Scanner(System.in);
		//Print a message to get the new array element
		System.out.println("Enter the array element value to update: ");
		//Type-cast and assigning the input value to a variable
		int indexPos = Integer.parseInt(indexNum.nextLine()); 
		String userValue = userVal.nextLine(); 
		indexNum.close();
		userVal.close();
		//Check if user entered index is within the bound
		if(indexPos <= students.size()-1) {
			System.out.println("Original Array : " + students);
			students.set(indexPos, userValue);
			System.out.println("Updated Array: " + students);
		} else {
			System.out.println("Index out of bound, please try again with in-bound index value");
		}
	}

}
