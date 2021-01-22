package JavaSessions;

import java.awt.font.NumericShaper.Range;

public class StringCancatenate {

	public static void main(String[] args) {
		
		String s1 = "Hello World";
		System.out.println(s1);
		
		String s2 = "1000";
		System.out.println(s2);
		
		double d1 = 12.33;
		double d2 = 23.33;
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "Selenium";
		
		System.out.println(a + b);
		System.out.println(x + y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println();
		System.out.println();
				

		char c = 'a';
		char c1 = 'b';
		System.out.println(c+c1); // ASCII values
		
		// ASCII Range - a-z: 97-122
		// ASCII Range - A-Z: 65-90
		// ASCII Range - 0-9: 48-57
		
		System.out.println(2/4);
		System.out.println(5/2); //2 as both are integer
		System.out.println(5.0/2); //2.5 as one number in point format
		System.out.println(5/2.0); //2.5 as one number in point format
		System.out.println(5.0/2.0); //2.5 as both number in point format
		
		//System.out.println(9/0); // / by zero arithmatic exception
		System.out.println(0/10); //0
		
		System.out.println(4%2); //0 modulus gives remainder
		System.out.println(5%2); //1 modulus gives remainder
		System.out.println(17%3); //2 modulus gives remainder
		
		
		
		
		
	}

}
