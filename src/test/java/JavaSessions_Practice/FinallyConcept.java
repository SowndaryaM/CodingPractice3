package JavaSessions_Practice;

import java.util.*;

public class FinallyConcept {

	public static void main(String[] args) {
		//FinallyConcept.start();
		start();
		test1();
		division();
		division1();

	}
	 public static void start()
	 {
		 try
		 {
			 System.out.println("i am inside the try block");
			 throw new RuntimeException("test");
			 //Deliberately we want to throw the exception 
		 }
		 catch(Exception e)
		 {
			System.out.println("i am inside the catch block"); 
		 }
		 
		 //finally is a block
		 //finally will get executed after try catch block
		 //even it throws exception or it may be any condition but whatever written inside the finally method will be get executed
		 //finally method will be used only with the try catch block
		 finally
		 {
			 System.out.println("i am inside the finally block");
		 }
	 }
	 
	 public static void test1()
	 {
		 try
		 {
			 System.out.println(" i am inside test1 method of try block");
		 }
		 finally
		 {
			 System.out.println("i am inside the test1 method of finally block");
		 }
	 }
	 
	 public static void division()
	 {
		 int i=10;
		 try
		 {
			 System.out.println(" i am inside division method of try block");
			 int k=i/0;
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("i am inside the division method of catch block");
			 System.out.println(e);
		 }
		 finally
		 {
			 System.out.println("i am inside the division method of finally block");
		 }
	 }
	 
	 public static void division1()
	 {
		 int i=10;
		 try
		 {
			 System.out.println(" i am inside division1 method of try block");
			 int k=i/0;
		 }
		 catch(NullPointerException e)
		 {
			 System.out.println("i am inside the division1 method of catch block");
			 System.out.println(e);
		 }
		 finally
		 {
			 System.out.println("i am inside the division1 method of finally block");
		 }
	 }

}
