package JavaSessions_Practice;

import java.util.ArrayList;
import java.util.List;

public class loopspractice1 {

	public static void main(String[] args) {
		int[] arraylist = new int[] {10,11,2,5,7,2,4,3,5,9,13};
		List<Integer> repeatednumberslist = new ArrayList<Integer>();
		int count;
		int selectedno;
		if(arraylist.length > 0)
		{
			for(int i=0;i<=arraylist.length-1;i++)
			{
				count=0;
				selectedno=arraylist[i];
				
			for(int j=0;j<=arraylist.length-1;j++)
			{
				if(selectedno == arraylist[j])
				{
					count=count+1;
					if(count > 1) 
					{
						System.out.print("Selected number:"+ selectedno);
						System.out.println(" "+"Repeated count:" +count);
						if(!repeatednumberslist.contains(selectedno))
						{
							repeatednumberslist.add(selectedno);
							//System.out.println("this no is already exiting in the array");
						}
						//else 
						//{
					//repeatednumberslist.add(selectedno);
						//}
					
					}
				}
			}
			
			}
			System.out.println("Repeated number list:" + repeatednumberslist);
		}
		else
		{
			System.out.println("arraylist length is less than zero");
		}

	}

}
