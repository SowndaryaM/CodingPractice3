package codingpractice;

public class Tofindmissingalphabets {

	public static void main(String[] args) {
		String givenstr = "manjunath";
		String alphabets= "abcdefghijklmnopqrstuvwxyz";
		char charofgivenstr;
		char charofalphabetstr;
		char charofnew=0;
		for(int i=0;i<=givenstr.length()-1;i++)
		{
			charofgivenstr = givenstr.charAt(i);
			//System.out.println(charofgivenstr);
			
			
			for(int j=0;j<=alphabets.length()-1;j++)
			{
				charofalphabetstr= alphabets.charAt(j);
				//System.out.println(charofalphabetstr);
				if(charofgivenstr == charofalphabetstr)
				{
					givenstr=givenstr.replace(charofgivenstr, charofnew);
					System.out.println(givenstr);
					alphabets=alphabets.replace(charofgivenstr, charofnew);
					System.out.println(alphabets);
										
				}

				
			}
			
		}
		

	}

}
