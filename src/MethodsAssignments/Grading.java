package MethodsAssignments;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		//Create a scanner object
		Scanner marks= new Scanner(System.in);				
		//Print a message
		System.out.println("Enter the marks obtained out of 100 marks: ");
			
		//Type-cast and assigning the input value to a variable
		int num = Integer.parseInt(marks.nextLine());
			
		//Close the scanner object
		marks.close();
		
		Grading g = new Grading();
		g.grade(num);

	}
	
	public void grade(int marks) {
		if(marks>= 91 && marks<=100) {
			System.out.println("Grade AA");
		}
		else if(marks>= 81 && marks<=90) {
			System.out.println("Grade AB");
		}
		else if(marks>= 71 && marks<=80) {
			System.out.println("Grade BB");
		}
		else if(marks>= 61 && marks<=70) {
			System.out.println("Grade BC");
		}
		else if(marks>= 51 && marks<=60) {
			System.out.println("Grade CD");
		}
		else if(marks>= 41 && marks<=50) {
			System.out.println("Grade DD");
		}
		else if(marks >= 0 && marks<=40) {
			System.out.println("Fail");
		}
		else {
			System.out.println("You need to enter the marks in range from 0 to 100");
		}


	}

}
