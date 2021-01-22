package ConstructorConcepts;

public class Employee {

	String name;
	int age;
	String dob;
	String city;
	boolean isPermenant;
	
	//constructor
	//name of the constructor remains same as class name
	//constructor overloading
//	public Employee() {
//		System.out.println("default const");
//	}
//	
//	public Employee(int a) {
//		System.out.println("1 param constructor...." + a);
//	}
//	
//	
//	public Employee(int a, String b) {
//		System.out.println("2 param constructor...." + a + b);
//	}
	
	public Employee() {
		
	}
//	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
		//What is the issue without constructor
		//constructor is called when user create the object
		
		Employee e1 = new Employee("Sanjiv");
		System.out.println(e1.name);
		Employee e2 = new Employee("Elena", 25);
		System.out.println(e2.name + " " + e2.age);
		
	}

}
