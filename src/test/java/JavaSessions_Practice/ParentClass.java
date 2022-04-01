package JavaSessions_Practice;

public class ParentClass {
	// to prevent inheritance (we can use final in class and in method also ex: public final class parentclass)
	//to prevent method overriding
	
	//public final void start()---> this gives you error in child class
	public void start()
	{
		System.out.println("start method of parent class");
	}

}
