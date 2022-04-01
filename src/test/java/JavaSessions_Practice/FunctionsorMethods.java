package JavaSessions_Practice;

public class FunctionsorMethods {

	//****Functions or Methods means: Functions means to perform specific task we will write the particular code which will reduce the duplicate work or repetative work 
	public static void main(String[] args) {
		// ****create the object of this class
		//****object will store only non static methods and functions
		//**** we can create n number of objects with different ref names
		FunctionsorMethods fn = new FunctionsorMethods();
		FunctionsorMethods obj = new FunctionsorMethods();
		
		//****calling all the methods using classname.method name since all the below methods are non static methods
		
		//****1. results:
		fn.nino();
		
		//****2. results:
		fn.sum();
		System.out.println(fn.sum());
		//****or 
		int d= fn.sum();
		System.out.println(d);
		
		//3. ****results
		System.out.println(fn.div(10, 5));
	
	}
	
	//**** 1. cannot create a functions inside a function
	//****2. functions are independent to each other
	// ****3. functions are parallel to each other
	//****4. we can call functions inside the functions
	//****5. main method will not return any value, hence it i void
	
	
	//****1. no input no output
	//****void -- does not return any value
	public void nino() 
	{
		System.out.println("test");
	}
	
	public void nino(int i) //1 parm
	{
		System.out.println("test");
	}
	
	public void nino(int i, int j)// 2 parm 
	{
		System.out.println("test");
	}
	
	public void nino(String i, String j)// 2 parm 
	{
		System.out.println("test");
	}
	
	//****Method Overloading: when in the same class, functions are having the same name with different parameters
	
	//****2. no input some output
	
	public int sum()
	{
		int a=10;
		int b=20;
		int sum = a+b;
		return sum;
	}
	
	//3. some input some output
	public int div(int a, int b)
	{
		int c = a/b;
		return c;
	}

}
