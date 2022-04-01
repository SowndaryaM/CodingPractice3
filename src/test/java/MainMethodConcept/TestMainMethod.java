package MainMethodConcept;

public class TestMainMethod {

	// **we can override the main method by passing different parameters
	// ** if we try to execute only JVM will search for String[] args parameter
	// inside the main method and only that it will execute
	public static void main(String[] args) {

		System.out.println("Main method1");
    // ***to call other overloading methods:
		main("selenium");// static method
	}

	public static void main(String args) {

		System.out.println("Main method2");
	}

	public static void main(int a) {
		System.out.println("Main method3");

	}
}
