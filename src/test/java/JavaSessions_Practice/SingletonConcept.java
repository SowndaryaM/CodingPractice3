package JavaSessions_Practice;

public class SingletonConcept {

	// ***In oop, a singleton class is a class that can have only one object (or
	// instance of the class) at a time.

	// ****How to design singleton class:
	// ****1. make a constructor as private always
	// ***2. write a static method(getInstance method) that has return type of
	// object of this singleton class (this is also called as lazy initialization)
	
	//diff btwn normall class and singleton class:
	//for normal class we use constructor
	//for singleton class we use getInstance() method for instantiation

	private static SingletonConcept ref_var = null;// this is how to create singleton class

	public String str;

	private SingletonConcept() {
		str = "hey, i am using singleton class pattern";
	}

	public static SingletonConcept getInstance() {
		if (ref_var == null) {
			ref_var = new SingletonConcept();

		}
		return ref_var;
	}

	public static void main(String[] args) {

		SingletonConcept x = SingletonConcept.getInstance();
		SingletonConcept y = SingletonConcept.getInstance();
		SingletonConcept z = SingletonConcept.getInstance();

		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
