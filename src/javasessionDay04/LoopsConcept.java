package javasessionDay04;

public class LoopsConcept {

	public static void main(String[] args) {
		
		//Print 1 to 10
		// While loop - When we don't know the number of iteration
		
		int i=1; //initialization
		while(i<=10) { //conditional
			System.out.println(i);  //statement
			i++; //Increment/decrement
			
		}
			//Practical example of an infinite loop
			
			//Welcome to my hotel
			//while(true) {
				//System.out.println("Welcome!! to my hotel");
			//}
			
		System.out.println("-------------------------------"); 
			// For loop - used when we have a known number of iteration
						
		for(int j=1; j<=10; j++) { //Initialize, conditional, statement execution, increment/decrement
			System.out.println(j); //Statement
		}
		
		System.out.println("-------------------------------"); 
		//Printing a to z with for loop
		for(char c = 'a'; c<='z'; c++) {
			System.out.println(c);
		}
		
		System.out.println("-------------------------------"); 	
		//3. do-while loop
		
		int k=1; //initialization
		do {
			System.out.println(k);  //statement
			k++; //Increment/decrement
		}
		while(k<=10); //conditional
			
		System.out.println("-------------------------------"); 	
		//4. for-each loop
		//5. streams: JDK 8 for ArrayList
		//6. for
		
	}

}
