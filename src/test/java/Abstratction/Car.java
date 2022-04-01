package Abstratction;

public interface Car {
	
	//In interface we can declare only static and final variables only in interface:
	
	int wheels =100;//by default it will be treated as final and static
	
	
	//****no abstract keyword by default all methods and classes are in abstract nature
	//*** no method body
	//*** no method declaration
	//*** WE ACHIVE 100% ABSTRACTION HERE
	//*** CAN NOT CREATE THE OBJECT OF BANK CLASS OR PARENT CLASS
	// CAN NOT CREATE THE OBJECT OF ABSTARCT CLASS OR INTERFACE
	
	public void start();
	public void stop();
	public void refuel();

}
