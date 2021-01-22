package javasessionDay06;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		//If you want to store any kind of data
		//ArrayList<Object> ar1 = new ArrayList<Object>();
		ar.add(100);
		ar.add("testing");
		ar.add(12.33);
		ar.add(true);
		ar.add(500);
		ar.add('m');
		
		System.out.println(ar.get(1));
		//generics in ArrayList
		
		//int arrayList
		ArrayList<Integer> markList = new ArrayList<Integer>();
		
		markList.add(100);
		markList.add(200);
		markList.add(300);
		//markList.add("testing"); // not allowed
		
		System.out.println(markList.get(0));
		//System.out.println(markList.get(3)); //Index out of bound error
		//System.out.println(markList.get(-1));  //Index out of bound error
		
	
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Tom");//0
		namesList.add("Peter");//1
		namesList.add("Ashiwni");//2
		namesList.add("Naveen");//3
		
		System.out.println(namesList.size());

		//namesList.remove(1);
		System.out.println(namesList.size());
		
		System.out.println(namesList.get(1));
		
		for(int i=0; i<namesList.size(); i++) {
			System.out.println(namesList.get(i));
		}

		for(String e : namesList) {
			System.out.println(e);
			
				if(e.equals("Peter")) {
					System.out.println("Peter is found...");
				}
		}
		
	}

}
