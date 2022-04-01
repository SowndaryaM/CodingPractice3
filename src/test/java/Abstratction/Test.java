package Abstratction;

public class Test {

	public static void main(String[] args) {
		HDFC obj = new HDFC();
		obj.loan();
		//*** not only load method we can call all other methods of child class and parent class if we create the object of child class
		obj.credit();
		obj.debit();
		obj.funds();
		
		//***dynamic polymorphism means creating the ref of bank class and creating the child class obj we can access all the methods of bank class.
		Bank B = new HDFC();
		B.credit();
		B.debit();
		B.loan();
		//****B.funds(); since funds method is only available for hdfc customers and since ref is of type bank cannot avail the facilities from HDFC
		//*** CAN NOT CREATE THE OBJECT OF BANK CLASS OR PARENT CLASS
		
		//Interface concept results:
		BMWimplemetscarclass bmw = new BMWimplemetscarclass();
		bmw.start();
		bmw.stop();
		bmw.refuel();
		
		Car c = new BMWimplemetscarclass();
		c.start();
		c.stop();
		c.refuel();
		//***c.speed();since speed method is only available for BMW customers and since ref is of type car cannot avail the facilities from BMW
		//*** CAN NOT CREATE THE OBJECT OF CAR CLASS OR PARENT CLASS

	}

}
