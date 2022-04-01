package codingpractice;

public class Factorial {

	public static void main(String[] args) {
		int num=10;
		int result=1;
		
		for(int i=num;i>0;i--)
		{
			result=result*i;
		}
		System.out.println("Factorial of the given number is:" + result);

	}

}
