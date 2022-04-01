package OopsConcept;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		
		ar.add(100);//0
		ar.add("Tom");//1
		ar.add('h');//2
		ar.add(12.33);//3
		
		System.out.println(ar.size());
		
		ar.add(200);//4
		
		System.out.println(ar.size());
		System.out.println(ar.get(3));
		
		//to print all the values of array list
		
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		
		// to restrict array list to only integer value
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Tom"); it will not allow since array list is of type integer

		ArrayList<Object> ar3 = new ArrayList<Object>();
		  ar3.add("Abc");
	        ar3.add(123);
	        ar3.add("Xyz");
	        for(int j=0;j<=ar3.size()-1;j++)
			{
				System.out.println(ar3.get(j));
			}
	}

}
