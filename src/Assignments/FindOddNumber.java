package Assignments;

public class FindOddNumber {

	public static void main(String[] args) {
		
		//Find odd number between 1 to 100 using increment operator
		for(int i=1; i<=100; i=i+2) {
		System.out.println(i);
		}

		System.out.println("--------------------------------------------------------");
		
		//Find odd number between 1 to 100 using modulus operator
		for(int i=1; i<=100; i++) {
			if (i%2 != 0) {
				System.out.println(i);
			}
		}
		

	}

}
