//Write a Java program to create a new array list, add some colors (string) and print out the collection

package Assignments;

import java.util.ArrayList;

public class arrayListAddColor {

	public static void main(String[] args) {
		//Using generics to create a collection object specific for string data types
		ArrayList<String> colors = new ArrayList<String>();

		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("White");
		colors.add("Black");
		colors.add("Magenta");
		
		for(String e:colors) {
		System.out.println(e);
		}

	}

}
