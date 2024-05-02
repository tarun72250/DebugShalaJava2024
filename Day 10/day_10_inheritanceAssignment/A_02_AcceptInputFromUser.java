package day_10_inheritanceAssignment;

import java.util.Scanner;

public class A_02_AcceptInputFromUser {

	public static void main(String[] args) {
	
	Scanner sc ; // refrence variable 
	sc = new Scanner(System.in);
	
	System.out.println("Enter integer value :");
	int num = sc.nextInt();
	
	System.out.println("Enter Float value :");
	float floatNum = sc.nextFloat();
	
	System.out.println("Enter Boolean value :");
	boolean booleanValue = sc.nextBoolean();
	System.out.println("Enter String value :");
	String str = sc.next();
	
	System.out.println("Integer Value :"+num);

	System.out.println("Float Value :"+floatNum);

	System.out.println("Boolean Value :"+booleanValue);

	System.out.println("String Value :"+str);
	
	System.out.println("Enter 1 no :");
	int x = sc.nextInt();
	System.out.println("Enter 2 no :");
	int y = sc.nextInt();
	
	
	A_05_Point p = new A_05_Point(x,y);
	System.out.println(p.toString());
		
		
		
		
	}

}
/*
 Scanner sc = new Scanner(System.in);
//		System.out.println("Accept integer value :");
//		int no = sc.nextInt();
//		System.out.println("Integer value :"+no);
		
//		System.out.println("Accept String value :");
//		String msg = sc.next();
//		System.out.println("String value :"+msg);
//		
//		System.out.println("Accept Floating value :");
//		float fl = sc.nextFloat();
//		System.out.println("String value :"+fl);
		
		System.out.println("Accept integer value :");
		int dd = sc.nextInt();
		int mm = sc.nextInt();
		int yy = sc.nextInt();
		
		Date d = new Date(dd,mm,yy);
		d.showDate();
*/