//package is a keyword and all keywords start with lowercase
//statements end with ;
package JavaSessions;

//public is a access modifier
public class DataTypes {

	//main method 
	public static void main(String[] args) {
		
		//data types:
		//primitive data types: take the space in the memory directly, no object created
		//Integer family: byte, short, long, int
		//floating family: double, float
		//character: char
		//boolean: boolean - true/false
		//1. byte size - 8 bits
		//range: -128 to 127
		byte b = 10; //allocation
		b = 20;
		byte b1 = 0;
		byte b2 = -10;
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		
		//2. short:
		//size: 16 bits = 2 bytes
		//range: -32768 to 32767
		short s = 10;
		//10 vars --> 10 bytes / 20 bytes
		
		//3. int:
		//size: 4 bytes = 32 bits
		//range: -2^31 to 2^32
		int i = 10;
		
		//4. long:
		
		//5. float:
		//size: 4 bytes = 32 bits
		//range: after point it can take upto 7 digits
		float f = 12.33f;
		float g = (float)34.44;
		
		//6. double:
		//size: 8 bytes = 64 bits
		//range: after point it can take upto 15 digits
		double d = 12.3333;
		double d1 = -12.444;
		double d3 = 100; //100.0
		
		//7. char: only single digit value
		//size: 16 bits: 2 bytes
		char c = 'a';
		char c1 = '1';
		char c2 = '$';
		char gender = 'f';
		
		//8. boolean
				
		//Non primitive data types like classes, array - can't use without creating object

	}

}
