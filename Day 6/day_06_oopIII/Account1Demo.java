package day_06_oopIII;

public class Account1Demo {

	public static void main(String[] args) {
		
		
		Account1 a1; //declaration refrence variable 
		a1 = new Account1(); //initilization
		System.out.println(	a1.calBalance());
		
		Account1 a2; //declaration refrence variable 
		a2 = new Account1(); //initilization
		Account1.updateRate(6.0f);
		System.out.println(	a2.calBalance());
		
		
		
		Account1 a3; //declaration refrence variable 
		a3 = new Account1(); //initilization
		a3.updateRate(9.0f);
	    System.out.println(a3.calBalance());
		
	    
	    Account1 a4; //declaration refrence variable 
		a4 = new Account1(); //initilization
		//a4.updateRate(12.0f);
	    System.out.println(a4.calBalance());
	    
	    Account1 a5; //declaration refrence variable 
		a5 = a1; //initilization
		//a4.updateRate(12.0f);
	    System.out.println(a5.calBalance());
	    
	    Account1 a6; //declaration refrence variable 
		a6 = new Account1(a1); //initilization
		//a4.updateRate(12.0f);
	    System.out.println("a6 object "+a5.calBalance());
	    
	    if(a1==a2)
	    	System.out.println("same");
	    else
	    	System.out.println("different");
	    
	    if(a1==a5)
	    	System.out.println("same");
	    else
	    	System.out.println("different");
	    
	    if(a1==a6)
	    	System.out.println("same");
	    else
	    	System.out.println("different");
	    
	    
	    
	}

}
