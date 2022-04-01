package codingpractice;

public class PrimeNumbers {

	public static void main(String[] args) {
		int count=1;
		for(int i=2;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
			if(i/j == i && i%1 == 0)
			{
				System.out.println(i);
			}
			}
		}

	}

}
