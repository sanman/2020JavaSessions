package Assignments;

public class cricDataArray {

	public static void main(String[] args) {
		
		 String cricdata[] = new String[6];
		 
		 cricdata[0] = "Name: Rohit Gurunath Sharma";
		 cricdata[1] = "Age: 33";		 
		 cricdata[2] = "Team: Mumbai Indians";
		 cricdata[3] = "DOB: April 30 1987";
		 cricdata[4] = "Gender: Male";
		 cricdata[5] = "Strike Rate: 130.78";
		// accessing the elements of the specified array using for loop
		 for (int i = 0; i < cricdata.length; i++)
		   System.out.println(cricdata[i]);
		 
		   System.out.println("--------------------------------------------------------");
		 
		 cricdata[0] = "Name: Mahendra Singh Dhoni";
		 cricdata[1] = "Age: 39";		 
		 cricdata[2] = "Team: Chennai Super Kings";
		 cricdata[3] = "DOB: Jul 7 1981";
		 cricdata[4] = "Gender: Male";
		 cricdata[5] = "Strike Rate: 137.85";
		 
		// accessing the elements of the specified array using for each loop

		 for(String e : cricdata) {
				System.out.println(e);
		 }
		 
		   System.out.println("--------------------------------------------------------");
			 
		 cricdata[0] = "Name: Virat Kholi";
		 cricdata[1] = "Age: 31";		 
		 cricdata[2] = "Team: Royal Challengers Bangalore";
		 cricdata[3] = "DOB: Nov 5 1988";
		 cricdata[4] = "Gender: Male";
		 cricdata[5] = "Strike Rate: 131.26";
		 
		// accessing the elements of the specified array using for each loop

		 for(String e : cricdata) {
				System.out.println(e);
		 }

	}

}
