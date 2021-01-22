//Write a Java program to remove the third element from a array list. 

package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListRemoveThirdElement {

	public static void main(String[] args) {
			ArrayList li = new ArrayList(Arrays.asList("Gaurav", 1, 55, 67.75, true, "Rajat", 345));
			System.out.println("Original Arraylist: " + li);
			
			//remove 3rd element from arrayList
			li.remove(3);
			System.out.println("Updated Arraylist : " + li);

	}

}
