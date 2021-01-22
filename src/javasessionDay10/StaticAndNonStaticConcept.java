package javasessionDay10;

public class StaticAndNonStaticConcept {
	
	String name;
	static int age;
	
	public void getName() {
		System.out.println("get name");
	}
	
	public static void getInfo() {
		System.out.println("get info");
	}

	public static void main(String[] args) {
		//Illegal modifier for parameter error - static var not allowed at local level
		//Static methods and variables are allowed at class level only
		//static int i = 12;
		int i = 10; //local var
		
		//how to access non static vars and methods;
		//we have to create the object of the class
		//Only non-static properties are stored in the object - like var name and method getName()
		
		StaticAndNonStaticConcept obj= new StaticAndNonStaticConcept();
		obj.name = "Sanjiv";
		System.out.println(obj.name);
		
		obj.getName();
		
		//-------------------------------------------------
		//How to call static vars and methods
		//1. you can call them directly: No need to use the object
		
		
				

	}

}
