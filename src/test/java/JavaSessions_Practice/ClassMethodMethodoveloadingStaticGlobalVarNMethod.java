package JavaSessions_Practice;

public class ClassMethodMethodoveloadingStaticGlobalVarNMethod {

	String name = "Sowndarya";// non static global variable
	static int age = 21;//static global variable

	public static void main(String[] args) {
		// we can do method overloading of main method using diff parameters or using diff data types
		//[do not create multiple main methods it is not a good practice]
		//main methods will never returns any values so always it contains void
		
		int i=20;// this local var can be called only inside the main method
		
		//how to call static methods and variables?
		//1. direct calling:
		sum();
		System.out.println(age);
		//2. calling by classname:
		ClassMethodMethodoveloadingStaticGlobalVarNMethod.sum();
	    System.out.println(ClassMethodMethodoveloadingStaticGlobalVarNMethod.age);
	    
	    
	  //how to call non static methods and variables?
	    //by creating object of class:
	    ClassMethodMethodoveloadingStaticGlobalVarNMethod objofclass= new ClassMethodMethodoveloadingStaticGlobalVarNMethod();
	    
	    //1. calling method:
	    objofclass.sendmail();
	    System.out.println(objofclass.name);
	    
	    // can i access static methods using object reference?: yes
	    objofclass.sum();//warning will be given but don't use and it is not good practice.
	    
	}

	public void sendmail()
	{
		//can not call this local variable into main methods or inside other methods 
		int i=10;//local variable of send mail method
		System.out.println("send mail non static method");
		System.out.println(i);
	}
	
	public static void sum()
	{
		System.out.println("Sum static method");
	}
}
