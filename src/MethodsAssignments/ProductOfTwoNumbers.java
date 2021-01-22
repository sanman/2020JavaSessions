package MethodsAssignments;

import java.util.Scanner;

public class ProductOfTwoNumbers {

	public static void main(String[] args) {
		
		//Create a scanner object
		Scanner firstNum= new Scanner(System.in);
		Scanner secondNum= new Scanner(System.in);
		
		//Print a message
		System.out.println("Enter the first number: ");
		System.out.println("Enter the second number: ");
		
		//Type-cast and assigning the input value to a variable
		int num1 = Integer.parseInt(firstNum.nextLine());
		int num2 = Integer.parseInt(secondNum.nextLine());
		//Close the scanner object
		firstNum.close();
		secondNum.close();
		
		ProductOfTwoNumbers p = new ProductOfTwoNumbers();
		p.product(num1, num2);
		
		
	}
	
	public void product(int num1, int num2) {
		System.out.println("Product of two number, " + num1 + " and " + num2 + " is " + (num1*num2));
	}

}
