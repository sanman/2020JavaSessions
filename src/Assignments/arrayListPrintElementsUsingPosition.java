// Write a Java program to print all the elements of a ArrayList using the position of the elements

package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListPrintElementsUsingPosition {

	public static void main(String[] args) {
		ArrayList<String>  li = new ArrayList<String>(Arrays.asList("Gaurav", "Sam", "Naveen", "Manan", "Ram", "Rajat", "Akhil"));
		
		for(String e : li) {
			int index = li.indexOf(e);
			System.out.println("The element at position " + index + " is " + e);
		}
			

	}

}
