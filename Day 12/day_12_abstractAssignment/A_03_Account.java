package day_12_abstractAssignment;

public class A_03_Account {

	    protected int accNumber;
	    protected String accName;
	    protected double balance;

	    public A_03_Account()
	    {
	    	
	    }
	    
	    public A_03_Account(int accNumber, String accName, double balance) {
	        this.accNumber = accNumber;
	        this.accName = accName;
	        this.balance = balance;
	    }

	    public void withdraw(double amount) {
	        // To be implemented in subclasses
	    }

	    public void calculateBalance() {
	        // To be implemented in subclasses
	    }

	    public void display() {
	        System.out.println("Account Number: " + accNumber);
	        System.out.println("Account Name: " + accName);
	        System.out.println("Balance: " + balance);
	    }
}
