package OOP_Inheritance;

public class TestCar {

	
	public static void main(String[] args) {
		//create a BMW class object
		//Major advantage is that all child classes will automatically have all the methods and vars 
		//defined in the parent class 
		System.out.println("----Calling child class (BMW) methods------");
		
		BMW b = new BMW();
		b.start(); //Overridden method - called from BMW class
		b.stop();  // Inherited method - Called from Car class
		b.refuel();	// Inherited method	- Called from Car class
		
		b.autoParking();//child class - ref type check passes here
		BMW.sunRoof(); //static methods can be called with class name and not abject name as they are not part of object
		System.out.println("From child BMW class object: " + b.engine); //inheriting a variable
		//Access methods from a grandparent
		b.engine();
		//Calling overloaded methods
		b.musicSystem();
		b.musicSystem("Hollywood");
		b.musicSystem("Radio Mirchi", 94.5);
		
		System.out.println("----Calling Parent class (Car) methods------");
		//Calling car class methods
		Car c = new Car();
		c.start(); // Called from Car class
		c.stop(); //Called from Car class
		c.refuel(); //Called from Car class
		System.out.println("From Parent Car class object: " + c.engine); //inheriting a variable
		//c.autoParking() // Not allowed as there is no method as autoparking in the car object
		//Accessing methods from parent class
		c.engine();
		
		System.out.println("----Top Casting- child class object referred by parent class ref variable-----");
		//BMW object can be refered by Car class reference variable
		//Top Casting - child class object can be referred by parent class ref variable
		Car c1 = new BMW();
		c1.start(); //BMW method is called - overridden method
		c1.stop(); //Car class method is called
		c1.refuel(); //Car class method is called
		//c1.autoParking(); //parent class ref variable can't access the method declared in child class due to
		//reference type check. c1 is car reference type while autoparking() is accessible to bmw (child class) 
		//ref variable
		
		//Down Casting
		//BMW b1 = (BMW)new Car(); //ClasscastException

	}

}
