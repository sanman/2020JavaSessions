package Assignments;

public class FirstAssignment {

	public static void main(String[] args) {
		//WAP to find out the max number where four different numbers are given
		
		int a = 700;
		int b = 600;
		int c = 710;
		int d = 715;
		
		if(a>b && a>c && a>d) {
			System.out.println("a is greatest");
		}
		else if (b>c && b>d) {
			System.out.println("b is greatest");			
		} 
		else if (c>d) {
			System.out.println("c is greatest");
		}
		else {
			System.out.println("d is greatest");
		}
		

	}

}
