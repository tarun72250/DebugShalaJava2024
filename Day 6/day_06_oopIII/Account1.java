package day_06_oopIII;

public class Account1 {

	private int accno;//instance dm , instance level info  
	private double balance;
	
	private static float int_rate;//decalaration of static dm , class level info
	
	//static block 
	static
	{
		int_rate = 3.5f;
	}
	
	
	public Account1()
	{
		
	}
	
	public Account1(int accno , double balance)
	{
		this.accno = accno;
		this.balance = balance;
	}
	
	public void display()
	{
		System.out.println("Account no :"+accno);
		System.out.println("Balance "+this.balance);
		double bal = calInterest();
		System.out.println("Balance with Interest :"+bal);
	}
	
	public double calInterest()
	{
		return balance * 100 / int_rate;
	}
	

	public static void updateRate(float rate)
	{
		int_rate = rate;
	}
	
	
}
