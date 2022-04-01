package JavaSessions_Practice;

public class IfElseConcept {

	public static void main(String[] args) {
		
        int a = 30;
        int b = 20;
        
        
        //inside if condition we can check only true or false statement
        // if 1st condition is satisfied then it will print "b is greater than a" 
        //or else it will print next else statement
        if(b>a)
        {
        	System.out.println("b is greater than a");
        }
        else
        {
        	System.out.println("a is greater than b");
        }
        
        // comparison operators
        // < > <=  >= == !=
        // == is used to compare the values and a=c is used to assigning a value to c
        
        int c = 40;
        int d = 40;
        
        if(c==d)
        {
        	System.out.println("c and d are equal");
        }
        
        else
        {
        	System.out.println(" c and d are not equal");
        }
        
        // write a logic to find the highest number
        int a1 = 500;
        int b1 = 500;
        int c1 = 900;
        
        if (a1>b1 & a1>c1)//true & true = true; true & false = false; false & true = false; false & false = false
        {
        	System.out.println("a1 is the greatest");
        }
        else if(b1>c1)
        {
        	System.out.println("b1 is the greatest");
        }        
        else
        {
        	System.out.println("c1 is the greatest");
        }
	}

}
