package OopsConcept;

public interface USbank {

	// In interface it will not have main method
	// instead of class it will be mentioned as Interface
	
	int min_bal=100;
	
	public void credit();
	//interface will not have method body and no need to declare method body
	// no method body - only method prototype
	// in interface, we can declare the variables, vars are by default static in nature
	// we can not change the value of variables- It is final/constant in nature.
	// no static methods are allowed in interface
	// we can not create object of interface it means Interface is abstract(can not instantiate) in nature
	
	public void debit();
	
	public void transfermoney();
	
}
