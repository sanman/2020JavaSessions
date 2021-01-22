package String.Manipulations;

public class StringManipulationConcepts {

	public static void main(String[] args) {
	//Finding the indices for all the occurrences of character s in a string
		String str = "This is my java code and I am so happy that I have written so many lines in such a super language" ;
		
	// Using for loop	
		for (int index = str.indexOf("s");
			     index >= 0;
			     index = str.indexOf("s", index + 1))
			{
			    System.out.println("Index values for s is " + index);
			}

	// Using while loop
		int index = str.indexOf("s");
		while (index >= 0) {
			System.out.println("Index values for s is " + index);
		    index = str.indexOf("s", index + 1);
		}

	//Substring numeric from alphanumeric string, type-cast to integer, adding 2 integers)	
		String t = "200A";
		System.out.println(Integer.parseInt(t.substring(0, t.indexOf("A"))) + 20);

}
}
