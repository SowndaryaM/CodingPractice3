package JavaSessions_Practice;

public class ConstructorWithThisKeyword {
	
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age)
	{
		//this.globalvariable = local variable or name which is initialized inside the constructor
		this.name=name;
		this.age=age;
		System.out.println(name +" "+age);
	}

	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom", 27);
	}

}
