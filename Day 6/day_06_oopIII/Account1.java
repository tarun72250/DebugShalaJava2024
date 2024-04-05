package day_06_oopIII;

public class Account1 {

	   //instance - non-static data members
	   private int accno;
	   private float balance;
	   
	   //static data member	
	   //its not a good approach to initialize the static data member value at time of declaration
	   private static double int_rate; 
	    
	   //static block 
	   static
	   {
		int_rate = 4.5f;
		//accno=1;  //Cannot make a static reference to the non-static field accno
	   }
	   
	   //default constructor
	   public Account1()
	   {
		   this.accno=1002;
		   this.balance=2000;
	   }

	   //parametrized constructor
	   public Account1(int accno, float balance)
	   {
		this.accno = accno;
		this.balance = balance;
		//this.int_rate=i; //The static field Account.int_rate should be accessed in a static block or we shoulc always initialized in static block
	   }
	   
	   //copy constructor
	   public Account1(Account1 a)
	   {
		this.accno = a.accno;
		this.balance = a.balance;
		//this.int_rate=i; //The static field Account.int_rate should be accessed in a static block or we shoulc always initialized in static block
	   }
	  
	   //non static method which is called by creating object
	   public double calBalance()
	   {
		return balance+(balance*int_rate/100);
	   }


	   //My need and task is update int_rate of this class, static method ,  
	   public static void updateRate(double new_rate)
	   {
		  // this.int_rate=new_rate;//error bcoz static variable is declared for class not for object.
		   int_rate=new_rate;
		   System.out.println("updated int_rate"+int_rate);
	   }
	   //this method call with their classname as well.
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 //final keyword
	    final int var =80;
	    	//	var =90;//this get error bcoz final value once initialized can't changed 
		//we cannot re assigned final variable.
	  
	   
	 //finalize() this method is called just before the object is garbage collected, 
	    protected void finalize()
	    {
	    	
	    }
	  
}
