package codingpractice;

public class Diamondpattren {

	public static void main(String[] args) {
		int row =6;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=row-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			
			System.out.println(" ");
		}

		for(int k=1;k<=row-1;k++)
		{
			for(int l=1;l<=k;l++)
			{
			System.out.print(" ");
			
			}
			for(int m=row-1;m>=k;m--)
			{
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}

}
