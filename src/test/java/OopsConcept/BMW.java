package OopsConcept;

public class BMW extends Car{
	//we are achieving has-a relationship [ class to class relationship ]
	
	//when same method is present class in parent class as well as in child class with the same name and same no of arguments, is called method overriding
	//and preference will be given to child class or overridden method
	public void start()// overridden method
	{
		System.out.println("car...starts");
	}
	
	public void price()
	{
		System.out.println("cost is high");
	}
	
	public void quality()
	{
		System.out.println("price is high but quality is good");
	}

}
