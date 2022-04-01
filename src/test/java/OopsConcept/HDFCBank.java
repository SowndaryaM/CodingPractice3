package OopsConcept;

public class HDFCBank implements USbank, BrazilBank{//we are achieving multiple inheritance
	//we are achieving Is-a relationship in interface
	
	// need to write all the methods and body which is mentioned in the USBank interface otherwise it will give error
	// along with those things we can add other own methods also
	// if a class is implementing any interface, then its mandatory to define/override all the methods of interface.
	
	//Multiple inheritance::[Child can inherit the properties from more than one parents]
	//below 3 are the methods from USBank
	public void credit() 
	{
		System.out.println("hdfc----credit");
	}
	public void debit() 
	{
		System.out.println("hdfc----debit");
	}
	public void transfermoney()
	{
		System.out.println("hdfc--transfermoney");
	}
	
	// below 2 are saperate methods from hdfc bank
	public void educationloan()
	{
		System.out.println("hdfc--education loan");
	}
	public void carloan()
	{
		System.out.println("hdfc---car loan");
	}
	// brazil bank method: overriding from brazil bank
	public void mutualfund()
	{
		System.out.println("hdfc---mutualfund");
	}

}
