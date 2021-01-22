package javasessionDay09;

public class Company {
	
	String nameString;
	int empCount;
	
	public String getCEOName() {
		return "Tom";
	}
	
	public int getTotalCount() {
		System.out.println("get total count of the shares");
		int totalShare = 2000;
		return totalShare;
	}

	public String[] getCoFounders() {
		System.out.println("get cofounders");
		String founder []= new String[3];
		founder[1]= "Tom";
		founder[1]= "Peter";
		founder[1]= "Steve";
		return founder;
	}
	
	public void getCustomerList() {
		System.out.println("get customer list");
	}
	
	public static void main(String[] args) {
		
		

	}

}
