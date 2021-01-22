package Assignments;

public class FindEvenNumber {

	public static void main(String[] args) {
		
		//Find even number between 1 to 100 using increment operator
		for(int i=2; i<=100; i=i+2) {
		System.out.println(i);
		}

		System.out.println("--------------------------------------------------------");
		
		//Find even number between 1 to 100 using modulus operator
		for(int i=1; i<=100; i++) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		

	}

}
