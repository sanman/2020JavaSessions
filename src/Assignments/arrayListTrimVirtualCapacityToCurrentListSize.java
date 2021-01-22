package Assignments;

import java.util.ArrayList;

public class arrayListTrimVirtualCapacityToCurrentListSize {

	public static void main(String[] args) {
		 ArrayList<Integer> al = new ArrayList<Integer>(50);
		    al.add(1);
		    al.add(2);
		    al.add(3);
		    al.add(4);
		    al.add(5);
		    al.add(6);
		    al.add(7);
		    al.add(1);
		    al.add(1);
		    al.add(1);

		    al.trimToSize();
		    System.out.println(al);

	}

}
