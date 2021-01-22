//Write a Java program to empty an array list.

package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListToEmpty {

	public static void main(String[] args) {
		ArrayList<String>  li = new ArrayList<String>(Arrays.asList("Gaurav", "Sam", "Naveen", "Manan", "Ram", "Rajat", "Akhil"));
	    System.out.println("ArrayList before clear: "+li);
	    li.clear();
	    System.out.println("ArrayList after clear: "+li);

	}
	

}
