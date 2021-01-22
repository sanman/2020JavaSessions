package javasessionDay06;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		//ArrayList - Dynamic Array
				//its a class
				//its a index based collection -- linear collection
				
				
				ArrayList ar = new ArrayList(20);
				
				System.out.println(ar.size()); //0
				
				ar.add(100);//0
				ar.add(200);//1
				
				System.out.println(ar.size());//2
				
				ar.add(300);//2
				ar.add(400);//3
				
				System.out.println(ar.size());//4

				ar.add(500);//4
				ar.add(600);//5
				ar.add(700);//6
				
				System.out.println(ar.size());//7
				
				ar.add(800);//7
				ar.add(900);//8
				ar.add(1000);//9
				
				System.out.println(ar.size());//10 --> PC = 10
				
				ar.add(1100);//10
				
				System.out.println(ar.size());//11
				
				//how to print all the values from arraylist: for loop:
				
				for(int i=0; i<ar.size(); i++) {
					System.out.println(ar.get(i));
				}
				
				
				//for each loop:
				for(Object e : ar) {
					System.out.println(e);
				}

	}

}
