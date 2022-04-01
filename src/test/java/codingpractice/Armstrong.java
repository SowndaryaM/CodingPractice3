package codingpractice;

import java.util.ArrayList;
import java.util.List;

public class Armstrong {

	public static void main(String[] args) {
	int givennum= 1121;
	String stringofgivennum= Integer.toString(givennum);
	char result;
	int armstrong =0;
	for(int i=0;i<=stringofgivennum.length()-1;i++)
	{
		//System.out.println(stringofgivennum.charAt(i));
		result = stringofgivennum.charAt(i);
		int charcovertedtoint = Integer.parseInt(Character.toString(result));
		int outputofeachdigit= charcovertedtoint * charcovertedtoint * charcovertedtoint;
		System.out.println(outputofeachdigit);
		armstrong = armstrong + outputofeachdigit;
	}

	System.out.println(armstrong);
	}

}
