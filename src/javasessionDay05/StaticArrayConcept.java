package javasessionDay05;

public class StaticArrayConcept {

	public static void main(String[] args) {
		
			//int array:
			//limitations of array:
			//1. size is fixed: static array: to overcome this, we can use ArrayList (Collections)
			//2. similar data types u can store:to overcome this issues, we can Object array(static)
			//but we can use ArrayList<Object> - collection.
			
			int i[] = new int[4];
			//i[-1] = 5;
			i[0] = 10;
			i[1] = 20;
			i[2] = 30;
			i[3] = 40;
			
			System.out.println("Lowest Index in an Array = " + 0);
			
			int len = i.length;//4
			System.out.println("length = " + len);
			System.out.println("Highest Index is (Arraylength-1) = " + (len-1));

			System.out.println(i[0]);
			System.out.println(i[3]);
			//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
			//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException
			
			//how to print all the values from Array: for loop
			for(int k=0; k<i.length; k++) {
				System.out.println(i[k]);//10 20 30 40 
			}
			
			//for each loop:  declare a variable that is the same type as the base type of the array, followed by a colon, 
			//which is then followed by the array name
			for(Integer e : i) {
				System.out.println(e);
			}
			
			//double array:
			double d[] = new double[2];
			d[0] = 12.33;
			d[1] = 23.44;
			
			//char array:
			char c[] = new char[3];
			
			//String array:
			String lang[] = new String[3];
			lang[0] = "Java";
			lang[1] = "Python";
			lang[2] = "Ruby";

			for(String e : lang) {
				System.out.println(e);
			}
			
			for(int p=0; p<lang.length; p++) {
				System.out.println(lang[p]);
			}
			
			//Object Array: static array
			Object ob[] = new Object[5];
			ob[0] = "Nidhi";
			ob[1] = 25;
			ob[2] = 'f';
			ob[3] = 34.44;
			ob[4] = true;
			
			for(Object e : ob) {
				System.out.println(e);
			}

	}

}
