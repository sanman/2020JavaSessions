package MethodsAssignments;

import java.util.Scanner;

public class CircumferenceAreaOfCircle {
	double Pi = 3.14;

	public static void main(String[] args) {
		
		//Create a scanner object
		Scanner radius= new Scanner(System.in);
		
		//Print a message
		System.out.println("Enter the radius: ");
			
		//Type-cast and assigning the input value to a variable
		double rad = Double.parseDouble(radius.nextLine());
		
		//Close the scanner object
		radius.close();
		
		CircumferenceAreaOfCircle circumArea = new CircumferenceAreaOfCircle();
		circumArea.areaOfCircle(rad);
		circumArea.circumferenceOfCircle(rad);

	}

	public void areaOfCircle(double r) {
		double area = Pi * (r*r);
		System.out.println("The area of the circle is: " + area);
		
	}
	
	public void circumferenceOfCircle(double r) {
		double circumference = 2 * Pi *r;
		System.out.println("The circumference of the circle is: " + circumference);
	}
	
}
