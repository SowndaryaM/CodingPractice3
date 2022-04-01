package JavaSessions_Practice;

public class ConstructorConcept {
	
	//constructor means class entity which is used to define some class features while creating the object
	//constructor name must be same as class name
	//it is not a method since it will not returns any value
	//whenever we wanted to declare global variable we use constructor to define it
	//no static, void, string and int etc..
	//constructor can be overloaded
	
	public ConstructorConcept()
	{
		System.out.println("called as default constructor since not declared anything inside the constructor");
		// it will be hidden always if we comment this also it wll be there and no need to create also
	}
	
	public ConstructorConcept(int i)
	{
		System.out.println("single parm constructor");
		System.out.println("printing the value of i: "+i);
	}
	
	public ConstructorConcept(int i, int j)//construction overloading
	{
		System.out.println("two parm constructor");
		System.out.println("printing the value of i and j: "+ i +" " +j);
	}


	public static void main(String[] args) {
		
		ConstructorConcept cc= new ConstructorConcept();//it will call only default constructor
		//as soon as we create the object constructor will be automatically called
		ConstructorConcept cc1= new ConstructorConcept(10);
		ConstructorConcept cc2= new ConstructorConcept(10, 20);
		

	}

}
