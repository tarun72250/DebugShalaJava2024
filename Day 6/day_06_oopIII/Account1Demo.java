package day_06_oopIII;

public class Account1Demo {

	public static void main(String[]args)
	{
		Account1 a;//refrence variable
		a = new Account1(2001,20000);
		a.display();
		
		
		Account1.updateRate(4.8f);
		
		Account1 a1;//refrence variable
		a1 = new Account1(2002,20000);
		a1.display();
		
		
		System.out.println();
		
	}
}
