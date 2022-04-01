package JavaSessions_Practice;

public class LoopsConcept {

	public static void main(String[] args) {
		// 1. while loop
		// any word which starts with the small letter is known as keyword (Ex: while)
		
		// write a program to print 1 to 10 numbers
		int i = 1;
		
		 while(i<=10)
		 {
			 System.out.println(i);
			  i= i + 1; // or i++ 
			  //disadvantage: suppose if we skip this line the loop will get printed infinite time so this is the disadvantage of while loop
		 }
		 
		 System.out.println("******************************************************");
		
		 //2. for loop:
		 
		 // printing 1 to 10
		 for (int j=1;j<=10;j++)//Initialization, Conditional and Incremental/Decremental part
		 {
			 // in 1st loop: it will check j<=10 or 1<10 if true then it will get inside the loop
			 System.out.println(j);
		 }
		 
		 
		 System.out.println("******************************************************");
		 
		 
		 //print 10 to 1
		 //k-- means k=k-1
		 for (int j=10; j>=-10 ;j--)
		 {
			 //for first time: it will check j>=1(if we write j=1 then it will show error) or 10>=1 if yes then only it come inside the loop
			 System.out.println(j);
		 }
	}

}
