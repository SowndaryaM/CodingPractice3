package JavaSessions_Practice;

import java.util.ArrayList;



public class ArrayConcept {

	public static void main(String[] args) {
		
		// array: to store similar data type in a array variable
		
		//one dimensional array
		// dis-advantages of array: 
		//1. size is fixed--static array -- To overcome this problem we use Collections (Arraylist, HashTable) -- Collections or called as dynamic array
		//2. stores only similar values or similar data types --- To overcome this problem we use Object array
		
		//1. int array:
		
		int i[] = new int[4];
		
		
		// default array index will starts from "0"
		//lowest bound/index = 0
		//upper bound/index = n-1[ex: 4-1=3] ( n is the size of array)
		 i[0] =10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40;
		 
		 System.out.println(i[2]);
		 
		 //System.out.println(i[4]);// ArrayIndexOutOfBoundException error since location or index does not exist
		 
		 System.out.println(i.length);// will give you the length or size of array
		 
		 //print all the values of array: use for loop
		 for( int j=0; j<i.length;j++)
		 {
			 System.out.println(i[j]);
		 }

		 
		 System.out.println("**********************************");
		 
		 //2. double array
		 
		 double d[]= new double[3];
		 
		 d[0]=1;
		 d[1]=2;
		 d[2]=3;
		 
		 System.out.println(d[2]);
		
		 System.out.println("**********************************");
		 
		 
		 //3. char array:
        char m[]= new char[3];
		 
		 m[0]='1';
		 m[1]='q';
		 m[2]='*';
		 
		 System.out.println(m[2]);
		 
		 System.out.println("**********************************");
		 
		 //4. boolean array
        boolean n[]= new boolean[2];
		 
		 n[0]= true;
		 n[1]= false;
			 
		 System.out.println(n[0]);
		 
		 System.out.println("**********************************");
		 
		 //5. String array: string is a class
		 
        String t[]= new String[3];
		 
		 t[0]="test";
		 t[1]="hello 123";
		 t[2]="world";
		 
		 System.out.println(t.length);
		 
		 System.out.println(t[2]);
		  for (int z=0;z<t.length;z++)
		  {
			  System.out.println(t[z]);
			  System.out.println("^^^^^^^^^^^^^^");
		  }
		 
		 System.out.println("******************************************************");
		 
		 
		 //6. Object array: (Object is a class)---- is used to store diff data types values
		 //Object is a super class of all the classes
		 
		 Object ob[] = new Object[6];
		 ob[0]="Tom"; //name
		 ob[1]=25; //age
		 ob[2]= 12.33; // marks obtained
		 ob[3]= "1/1/1990"; //DOB
		 ob[4]= 'm'; // initial
		 ob[5] = "london"; //city
			
		 System.out.println(ob[2]);
		 System.out.println(ob.length);
		 
		 System.out.println("**************************");
		 
		 Object[] obj = new Object[6];
		 obj[0]="Tom"; //name
		 obj[1]=25; //age
		 obj[2]= 12.33; // marks obtained
		 obj[3]= "1/1/1990"; //DOB
		 obj[4]= 'm'; // initial
		 obj[5] = "london"; //city
		 
		 for (int k=0;k<obj.length;k++)
		 {
			 System.out.println(obj[k]);
		 }
		 // or 
		 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		 
		 for (Object s: obj )
			 
		 {
			 System.out.println(s);
		 }
		 
	}

}
