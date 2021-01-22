package javasessionDay03;

public class IfElseConditional {

	public static void main(String[] args) {
		
		//Conditional Operators - <> == != <= >=
		
		int a = 10;
		int b = 10;
		
		System.out.println(a==b);
		
		
		if (a==b) {
			System.out.println("Hi");
		}
		else {
			System.out.println("Bye");
		}
		
		//After if the conditional should be a boolean value
		//Dead code example 1
		if(true) {
			System.out.println("Testing");
		}
		else {
			System.out.println("Develiopment");
		}
		
		//Dead code example 2
		if(false) {
			System.out.println("Testing");
		}
		else {
			System.out.println("Develiopment");
		}
		
		
		
		String s1 = "Selenium";
		String s2 = "Selenium";
		
		if(s1.equals(s2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("both are equal");
		}
		
		
		//Avoid using == for comparing strings as this compares object references
		
		
		
		//nested if:
		int marks = 60;
		
		if(marks>=60) {
			System.out.println("A Grade");
			
			if(marks<=80) {
				System.out.println("B Grade");
				
				if(marks<=60) {
					System.out.println("C Grade");
				}
			}
		}
		else {
			System.out.println("FAIL");
		}

		
		
		String browser= "Chrome";
		//if(browser.eq)
		
		
		
		
	}

}
