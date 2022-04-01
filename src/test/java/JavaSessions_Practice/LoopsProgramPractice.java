package JavaSessions_Practice;

public class LoopsProgramPractice {

	public static void main(String[] args) {
		
		
		//1. Program to print array of elements
		
		//Numbers= 23,17,20,29,30
		
		int[] number = new int[]{23,17,20,29,30};
		int count=0;
		for(int i=0;i<=number.length-1;i++)
		{
			//System.out.println(number[i]);
			count=count+number[i];
			
		}
		System.out.println(count);
		
		System.out.println("********************************************************************************");
		
		//2. Program to print array length
		
		int[] number1 = new int[]{23,17,20,29,30};
		
		count=0;
		for(int j=0;j<=number1.length-1;j++)
		{
			count=count+1;
			
		}
		
		System.out.println(count);
		
		System.out.println("********************************************************************************");
		
		//3. Program to print the highest number in the given array
		
		int[] number2 = new int[]{23,52,20,29,30};
		int count1=0;
		int Highestnumber=0;
		for(int k=0;k<=number2.length-1;k++)
		{
			System.out.println(count1+ ":"+number2[k]);
			//count1=number2[k];
			if(number2[k] > count1)
			{
				count1=number2[k];
				Highestnumber = count1;
			}
			else
			{
				System.out.println("not found any highest number in the given array list");
			}
		}
		
		System.out.println(Highestnumber);
		
		System.out.println("********************************************************************************");
		
		//4. Program to print lowest number from the given array
		
		int[] number3 = new int[]{23,52,20,32,30};
		int count3=0;
		int Lowestnumber=0;
		for(int l=0;l<=number3.length-1;l++)
		{
			System.out.println(number3[l]+":"+count3);
			if(number3[l] < count3)
			{
				System.out.println("i am inside the if condition and the given statement is true");
				
				Lowestnumber= number3[l];
				System.out.println("lowest no inside the loop:"+ Lowestnumber);
				count3 =number3[l];
			}
			else
			{
				System.out.println("something went wrong in the loop");
				
			}
			
		}
		
		System.out.println("lowestnumber:" +Lowestnumber);
		
		
		
		//4. to find lowest number from the array
		int[] arraylist= new int[]{23,52,20,32,30};
		int lowestno =arraylist[0];
		if(arraylist.length > 0)
		{
			for(int m=1;m<=arraylist.length-1;m++)
			{
				if(arraylist[m] < lowestno)
				{
					lowestno=arraylist[m];
				}
				else
				{
					System.out.println("not found any lowest number");
				}
			}
			System.out.println("lowest number:"+lowestno);
		}
		else 
		{
			System.out.println("array length is less than zero");
		}
		
		//3. to find highest number from the array
		int[] arraylisttofindhighestno= new int[]{23,52,20,32,30,10};
		int highestno= arraylisttofindhighestno[0];
		if(arraylisttofindhighestno.length > 0)
		{
			for(int n=1;n<=arraylisttofindhighestno.length-1;n++)
			{
				if(arraylisttofindhighestno[n] > highestno)
				{
					highestno=arraylisttofindhighestno[n];
				}
			}
			System.out.println("highest no:"+highestno);
		}
		else
		{
			System.out.println("array lenght is not greater than zero");
		}
		
	}

}
