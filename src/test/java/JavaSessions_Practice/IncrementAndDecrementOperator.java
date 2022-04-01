package JavaSessions_Practice;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		// ++
		// --
		
		int i = 1;
		int j = i++; //post increment
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("**************************************************************");
		
		int a = 1;
		int b = ++a;//pre increment
		
		System.out.println(a);
		System.out.println(b);
		
	System.out.println("**************************************************************");
		
		int m = 2;
		int n = m--;//post decrement
		
		System.out.println(m);
		System.out.println(n);
		

	System.out.println("**************************************************************");
		
		int o = 2;
		int p = --o;//pre decrement
		// decrease the value of "o" and assign it to "o" and then assign value of "o" to p
		System.out.println(o);
		System.out.println(p);
	}

}
