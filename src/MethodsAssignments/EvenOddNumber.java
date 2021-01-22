package MethodsAssignments;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		EvenOddNumber numcheckobj= new EvenOddNumber();
		numcheckobj.checkNumber(0);
		numcheckobj.checkNumber(1);
		numcheckobj.checkNumber(488);
		numcheckobj.checkNumber(557);
		numcheckobj.checkNumber(4654);

	}

	public void checkNumber(int num) {
		if (num % 2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is Odd");
		}
	}
}
