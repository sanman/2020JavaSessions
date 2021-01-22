package EncapsulationConcepts;

public class Company {

	public String name;
	public int empCount;
	private int sharePrice; //Private variables can be accessed in the same class
	
	public String getCEOName() {
		return "Tom";
	}
	
	private int totalSharePrice() {
		return 1000;
	}
	
	public static void main(String[] args) {
		Company c1 = new Company();
		c1.name ="TCS";
		c1.empCount = 100000;
		c1.sharePrice = 3000;
		System.out.println(c1.name);
		System.out.println(c1.empCount);
		System.out.println(c1.sharePrice);
		System.out.println(c1.getCEOName());
		System.out.println(c1.totalSharePrice());
		

	}

}
