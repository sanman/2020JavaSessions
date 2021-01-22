package MethodsAssignments;

import java.util.Scanner;

public class MaxMinNumber {
	public static void main(String[] args) {
		
		//Create a scanner object
		Scanner firstNum= new Scanner(System.in);
		Scanner secondNum= new Scanner(System.in);
		Scanner thirdNum= new Scanner(System.in);
		
		//Print a message
		System.out.println("Enter the first number: ");
		System.out.println("Enter the second number: ");
		System.out.println("Enter the third number: ");
		
		//Type-cast and assigning the input value to a variable
		int num1 = Integer.parseInt(firstNum.nextLine());
		int num2 = Integer.parseInt(secondNum.nextLine());
		int num3 = Integer.parseInt(thirdNum.nextLine());
		//Close the scanner object
		firstNum.close();
		secondNum.close();
		thirdNum.close();
		
		MaxMinNumber minmax = new MaxMinNumber();
		minmax.maximum(num1, num2, num3);
		minmax.minimum(num1, num2, num3);
		
	}
	
	public void maximum(int num1, int num2, int num3) {
		if(num1>num2 && num2>num3) {
			System.out.println(num1 + " is maximum");
		}
		else if (num2>num1 && num2>num3) {
			System.out.println(num2 + " is maximum");
		}
		else {
			System.out.println(num3 + " is maximum");
		}
	}
		
		public void minimum(int num1, int num2, int num3) {
			if(num1>num2 && num2>num3) {
				System.out.println(num3 + " is minimum");
			}
			else if (num2>num1 && num2>num3) {
				System.out.println(num1 + " is minimum");
			}
			else {
				System.out.println(num2 + " is minimum");
			}			
		
	}
}

