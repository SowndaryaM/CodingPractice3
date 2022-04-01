package OopsConcept;

public class TestCar {

	public static void main(String[] args) {
		
		//this is called static polymorphism or compile-time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.turonac();
		b.refuel();
		b.price();
		b.quality();
		b.engine();//inheriting engine method from its grand parent
		
		System.out.println("*********************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.turonac();
		//c.price();-- can not access properties of child class
		
		// Ex: Parent can have multiple child and child will have all the qualities of there parents but 
		//child can have single parent and parent can not have qualities of child 
		
		System.out.println("***************************");
		
		// Top or Up casting
		Car c1=new BMW();// child class object can be referred by parent class reference variable--- called as dynamic polymorphism or run time polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.price();--can not access bmw properties using parent class ref 
		
		// Down casting
		//BMW b1 = new Car(); parent class can not be referred to child class
		BMW b1 = (BMW)new Car();// this is allowed but it will through the Class cast exception

	}

}
