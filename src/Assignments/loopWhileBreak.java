package Assignments;

public class loopWhileBreak {

	public static void main(String[] args) {
		// while loop with break
		int i=1;
		
		while (i <= 10) {
			System.out.println(i);
			if (i%7==0) {
				break;			
			}
			i++;
		}

	}

}
