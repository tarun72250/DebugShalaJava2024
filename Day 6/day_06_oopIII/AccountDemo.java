package day_06_oopIII;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account a1; //declaration refrence variable 
		a1 = new Account(); //initilization
	    System.out.println("Current rate : "+Account.getIntRate());//Account.getIntRate() is static method to access Account class int_rate value .
		System.out.println(a1.calBalance()); // calling by object

		Account a2 = new Account(200,200,3.5);//default cons calling
		System.out.println(a2.calBalance());//  calling by object

		//Account.updateRate(4.8f);// calling static method directly  
		System.out.println("Current rate : "+Account.getIntRate()); // called static variable directly
		System.out.println(a1.calBalance()); // calling by object
	    System.out.println(a2.calBalance()); // calling by object

	}

}
