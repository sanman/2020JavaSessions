package JavaSessions;

public class IncrementalDecrementalOperators {

	public static void main(String[] args) {
		
		//post increment
		int a = 1;
		int b = a++;
		
		System.out.println(a);//2
		System.out.println(b);//1

			
		int c = -99;
		int d = c++;
		
		System.out.println(c);//-98
		System.out.println(d);//-99
		
		int g = -1000;
		int h = g++;
		
		System.out.println(g);//-999
		System.out.println(h);//-1000
		
		
		//pre-increment
		
		int e = 1;
		int f = ++e;
		
		System.out.println(e);//2
		System.out.println(f);//2
		
		int u = -99;
		int o = ++u;
		
		System.out.println(u);//-98
		System.out.println(o);//-98
		
		//Post decrement
		
		int total = 100;
		System.out.println(total++); //100
		System.out.println(total); //101
		System.out.println(++total); //102
		System.out.println(total); //102
		System.out.println(total--); //102
		System.out.println(--total); //100
		System.out.println(total); //100

		
	}

}
