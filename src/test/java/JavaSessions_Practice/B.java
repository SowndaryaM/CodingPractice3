package JavaSessions_Practice;

public class B extends A {
	// *** if any child class extends parent class and if we call the child class by
	// creating the object by default parent class will be called first and it will
	// print the default constructor first then it will print the child class
	// default constructor.

	public B() {
		super();
		//super10();// this can not be 2nd statement
		// ****super keyword is used to call parent constructor manually and also we can
		// pass the value of the required constructor to be called
		//****super keyword must be the first statement of child constructor if we want to execute
		System.out.println("Constructor B is called");
	}

	public B(int i)
	{
		super(i);
		System.out.println("obj1");
	}
	public static void main(String[] args) {

		B obj = new B();
		B obj1 = new B(10);

	}

}
