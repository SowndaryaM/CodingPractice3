package codingpractice;

public class FibonacciNumber {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		System.out.print("Fibonacci series of 1st 10 values are: ");
		System.out.print(a+" ");
		System.out.print(b+" ");
		
		for(int x=1;x<=10;x++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
				
	}

}
