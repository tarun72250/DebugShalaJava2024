package day_13_interfaceAssignment.demos;

import java.util.Scanner;

import day_13_interfaceAssignment.shapes.A_02_MyNumber;

public class A_02_Demo {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        A_02_MyNumber myNumber = new A_02_MyNumber();

	        System.out.println(num + " is Odd? " + myNumber.isOdd(num));
	        System.out.println(num + " is Even? " + myNumber.isEven(num));
	        System.out.println(num + " is Prime? " + myNumber.isPrime(num));
	        System.out.println("Factorial of " + num + " is " + myNumber.calFactorial(num));
	    }
}
