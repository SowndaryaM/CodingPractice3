package codingpractice;

import java.util.HashMap;

public class Missingletters {

	public static void main(String[] args) {
		String givenstr = "manjunath";
		String alphabets= "abcdefghijklmnopqrstuvwxyz";
		char charofgivenstr;
		char charofalphabetstr;
				int count=0;
				for(int i=0;i<=alphabets.length()-1;i++)
		{
			 charofalphabetstr= alphabets.charAt(i);
			
			
			
			for(int j=0;j<=givenstr.length()-1;j++)
			{
				charofgivenstr= givenstr.charAt(j);
				
				if(charofgivenstr == charofalphabetstr)
				{
					count=count+1;
					if(count > 1)
					{
						count=count-1;
						System.out.println("char repeated 2 time:"+count+":"+charofalphabetstr );
					}
					else if(count==1)
					{
						count=count;
						System.out.println("each char count:"+count+":"+charofalphabetstr);
					}

										
				}

				
			}
			
		}
		

	}

}
