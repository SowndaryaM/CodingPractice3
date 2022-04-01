package codingpractice;

public class ReverseTheGivenStatement {

	public static void main(String[] args) {
		
		String str = "Good morning chotu";
		String[] strarray= str.split("\\s+");
		String reversedstringresult="";
		char reversechar;
		for(int i=0;i<=strarray.length-1;i++)
		{
			//System.out.println(strarray[i]);
			String arrayofone = strarray[i];
			//System.out.println(arrayofone);
			for(int j=arrayofone.length()-1;j>=0;j--)
			{
				//System.out.println(arrayofone.charAt(j));
				reversechar = arrayofone.charAt(j);
				reversedstringresult = reversedstringresult.concat(Character.toString(reversechar));
								
			}
			reversedstringresult= reversedstringresult + " ";
			
		}   
		System.out.println(reversedstringresult);
	}

}
