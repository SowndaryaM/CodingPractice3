package Abstratction;

public abstract class Bank {
	
	//*** Var declaration types: we can declare all below three types
	int amount =100;
	static int a= 10;
	final int b = 20;

	// *****any method or class is declared with abstract keyword is know as
	// abstract class or abstract method
	// *** abstract method should be declared without method body
	// *** at-least one abstract method is compulsory for one abstract class
	//*** Abs class can have abs methods and non abs methods
	//*** CAN NOT CREATE THE OBJECT OF BANK CLASS OR PARENT CLASS

	// *** this is call as partial abstraction ( credit and debit is common methods
	// or all the classes and but only we are over riding the load method)
	//***hiding the implementation logic is called as Abstraction

	public abstract void loan();// ***abstract method -- no method body

	//***non abstract methods
	public void credit() {
		System.out.println("Bank---credit");
	}

	public void debit() {
		System.out.println("Bank---debit");
	}

}
