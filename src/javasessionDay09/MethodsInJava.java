package javasessionDay09;

public class MethodsInJava {
	//main method is entry point for java program execution
	public static void main(String[] args) {
		//Method - a generic code that do something specific
		//Rule 1- Can not create a method in side a method (No method inside main method)
		//Object never store static method inside the object - main methods is never stored in object
		
		// Calling a method inside the main method: Create the object
		MethodsInJava obj = new MethodsInJava();
		//Calling the method
		obj.test();
		int p = obj.getMarks();
		System.out.println(p);
		
		int s1 = obj.sum(10,20);
		System.out.println(s1);
	}

	// 1. No input and no return
	// return type: void - means does not return any value
	public void test() {
		System.out.println("test method");
	}
	
	// 2. no input but return some
	//return type: int
	public int getMarks() {
		System.out.println("get marks");
		int total = 100;
		int bonus = 50;
		int totalMarks = total + bonus; //150
		return totalMarks;
	}
	
	public String getName() {
		System.out.println("get name method");
		String s = "Sanjiv";
		return s;
		
	}
	
	public int sum(int a, int b) {
		System.out.println("Sum method");
		int z = a + b;
		return z;
		
	}
	
}
