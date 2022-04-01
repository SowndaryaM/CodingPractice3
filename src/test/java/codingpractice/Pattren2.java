package codingpractice;

public class Pattren2 {

	public static void main(String[] args) {
		//System.out.println("ASDSA");
		int row =4;
		for(int i=1;i<=row;i++)
		{
			for(int j=row-1;j>=i;j--)
			{
				System.out.print(" ");
				//System.out.print(i);
			}
			for (int j=1; j<=i; j++ )   
			{   
			//prints star      
			System.out.print("*");   
			}  
			System.out.println("");
		}

	}

}
