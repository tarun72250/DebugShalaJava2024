package day_06_oopIII;

public class Account {
	

	   //instance - non-static data members
	   private int accno;
	   private float balance;
	   
	   //static data member	
	   //its not a good approach to initialize the static data member value at time of declaration
	   private static double int_rate; 
	    
	   //static block 
	   static
	   {
		System.out.println("in static block");
		int_rate = 4.5f;
		//accno=1;  //Cannot make a static reference to the non-static field accno
	   }

	   //default constructor
	   public Account()
	   {
		   this.accno=1002;
		   this.balance=2000;
	   }

	   //parametrized constructor
	   public Account(int accno, float balance , double i)
	   {
		this.accno = accno;
		this.balance = balance;
		//this.int_rate=i; //The static field Account.int_rate should be accessed in a static block or we shoulc always initialized in static block
	   }
	   
	 //copy constructor
	   public Account(Account a)
	   {
		this.accno = a.accno;
		this.balance = a.balance;
		//this.int_rate=i; //The static field Account.int_rate should be accessed in a static block or we shoulc always initialized in static block
	   }

	   
	   //static method which is called directly by class name
	   public static void updateRate(float new_rate)
	   {
		System.out.println("In updateRate Static method");
		int_rate=new_rate;
		System.out.println(int_rate);
		//this.balance = 14000.00f;   //not allowed to access non-static
	   }

	   //static method to access this class static method value direct with classname
	   public static double getIntRate()
	   {
		return int_rate;
	   }		

	   //no static method which is called by creating object
	   public double calBalance()
	   {
		return balance+(balance*int_rate/100);
	   }	

}
