//Write a Java program to insert an element into the array list at the first and last positions.

package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListInsertElement {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Tom", "Dick", "Harry", "Rubble", "Dollar"));
		System.out.println("Initial Array List: " + names);
		//Add element to first position
		names.add(0, "Bobby");
		//Add element to last position
		names.add(names.size(), "Patty");		
		System.out.println("Updated Array List: " + names);
	}

}
