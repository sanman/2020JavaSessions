package OOP_Inheritance;

//Use extends keyword for creating a parent child relationship
//Can access all the methods defined in the car class, the parent class for BMW
public class BMW extends Car{
	//Method overriding
	//When we have a parent class having the same method with the same name and same number of parameters
	//in the child class -- is call method overriding
	//Override a method that exists in parent class
	//Why - Incase the child class want to add some enhancement/update specific to this method
	// for BMW class only
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	public void autoParking() {
		System.out.println("BMW -- autoparking");
	}
	
	//Trying to override a static method- Not allowed - never part of object but part of CMA
	//Static methods can be overloaded

		public static void sunRoof() {
		System.out.println("Car - sunRoof");
	}
		//Method overloading - same method name with different parameters
		public void musicSystem() {
			System.out.println("BMW - musicSystem");
		}
		
		public void musicSystem(String CD) {
			System.out.println("BMW - musicSystem with " + CD);
		}

		public void musicSystem(String radio, double radioFrequency) {
			System.out.println("BMW - musicSystem with " + radio + " frequency -> " + radioFrequency);
	
}
}
