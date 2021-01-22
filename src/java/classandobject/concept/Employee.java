package java.classandobject.concept;

public class Employee {
	
	//class variables - can be access but with some rule - like access with object reference (here e1)
	String name;
	int age;
	double salary;
	boolean isActive;

	public static void main(String[] args) {
		// Class is an entity
		
		//create object of this class
		//e1 - is object reference
		//Object is RHS (new Employee)
		Employee e1 = new Employee();
		
		e1.name = "Tom";
		e1.age = 25;
		e1.salary = 34.44;
		e1.isActive = true;
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		System.out.println(e1.isActive);
		

	}

}
