//Write a Java program to extract a portion of a array list.
package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListExtractSubList {

	public static void main(String[] args) {
		ArrayList<String>  li = new ArrayList<String>(Arrays.asList("Gaurav", "Sam", "Naveen", "Manan", "Ram", "Rajat", "Akhil"));
		System.out.println("The sublist from array list is" + li.subList(1, 3));

	}

}
