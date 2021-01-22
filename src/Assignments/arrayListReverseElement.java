//Write a Java program to reverse elements in a array list

package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arrayListReverseElement {

	public static void main(String[] args) {
		ArrayList<String>  al = new ArrayList<String>(Arrays.asList("Gaurav", "Sam", "Naveen", "Manan", "Ram", "Rajat", "Akhil"));
		
		//Array list before reverse
	    System.out.println("ArrayList Before Sorting:");
	    for(String str: al){
	    	System.out.println(str);
	    }

	    //Array list in reverse
	    Collections.sort(al, Collections.reverseOrder());

	    //Array list in reverse order
	    System.out.println("ArrayList in reverse order:");
	    for(String str: al){
	    	System.out.println(str);
	    }

	}

}
