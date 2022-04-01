package codingpractice;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
		int num = 12321;
		String convertnumtostring = Integer.toString(num);
		String finalString="";
		String reversestring="";
		for (int i=convertnumtostring.length()-1;i>=0;i--)
		{
			char a =convertnumtostring.charAt(i);
			
			finalString =finalString.concat(Character.toString(a));
			
			
		}
		
		System.out.println(finalString);
		//compare and decide palindrome or not
		

	}

}
