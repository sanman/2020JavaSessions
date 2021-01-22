package OOP_Inheritance;
//Parent class for BMW class
public class Car extends Vehicle {
	int engine = 10; //variable can be inherited as well
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	//Static method can not be overridden as they are not part of object but CMA (Common Memory Allocation)
	public static void sunRoof() {
		System.out.println("Car - sunRoof");
	}
}
