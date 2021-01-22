package MethodsAssignments;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		
		//Create a scanner object
		Scanner number= new Scanner(System.in);				
		//Print a message
		System.out.println("Enter the number to check if its prime or not: ");
			
		//Type-cast and assigning the input value to a variable
		int num = Integer.parseInt(number.nextLine());
			
		//Close the scanner object
		number.close();
		
		CheckPrime cp = new CheckPrime();
		cp.isPrime(num);

	}
	
	public void isPrime(int n) {
						
		for (int i = 1; i <= n; i++) {
			if(n <=1) {
				System.out.println("Not prime number");				
			}
			else if (n ==2) {
				System.out.println("It's a prime number");
				break;
			}
			else if (n%2 == 0) { 
				System.out.println("Not prime number");
				break;
			}			
			else {
				System.out.println("It's a prime number");
				break;
				}				
		}
		
	}

}
