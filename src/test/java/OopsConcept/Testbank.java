package OopsConcept;

public class Testbank {

	public static void main(String[] args) {
		
		//it will not allow to create or not able to create the object of interface so create the object of class
		System.out.println(USbank.min_bal);
		//USbank.min_bal=200;--once value is declared in the interface it will not allow to change
		
		HDFCBank hd=new HDFCBank();
		hd.credit();
		hd.debit();
		hd.transfermoney();
		hd.educationloan();
		hd.carloan();
		
		
		//Dynamic polymorphism:(same as inheritance)
		//child class object can be referred by parent interface reference variable
		USbank b= new HDFCBank();
		b.credit();
		b.debit();
		b.transfermoney();
		//b.educationloan();--can not access using parent class ref only overridden methods will be called

	}

}
