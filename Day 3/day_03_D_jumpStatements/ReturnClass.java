package day_03_D_jumpStatements;

public class ReturnClass {
	
	//static method
	public static int findSum(int a , int b)
	{
		return a+b;
	}
	
	//static method
	public static String namePrinting(String name)
	{
		return "Welcome " +name;
	}
	
	//non static method
	public void floatSum(float x , float y)
	{
		System.out.println("Floating value sum :"+(x+y));
	}
	
	public static void main(String[] args) {
		
		ReturnClass r = new ReturnClass();
		r.floatSum(23.0f, 23.0f);
		
		System.out.println(ReturnClass.namePrinting("Sumit"));
		System.out.println("\nFinal Result "+ReturnClass.findSum(2, 3));
	}
	
}











































/*

public static int findSum(int n , int m)
	{
	
		int sum = n+m;
		return sum;
	}
	
	public static String namePrinting(String name)
	{
		return " Hello "+name; 
	}
	
	public static float floatingNumber(float a , float b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		
//		    boolean t = false;
//	        System.out.println("Before the return.");
//	 
//	        if (t==true)//if(t)
//	        {
//	        	System.out.println("inner scope ");
//	            return;
//	        }   
//	        System.out.println("outer scope");
		
		ReturnClass obj = new ReturnClass();
		System.out.println(obj.findSum(2, 3));
		System.out.println(obj.namePrinting("Sumit"));
		System.out.println(obj.floatingNumber(1.2f, 2.3f));

	}

*/