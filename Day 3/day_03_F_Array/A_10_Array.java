package day_03_F_Array;

//
//1.Find Subarray with given sum | Set 1 (Non-negative Numbers)
//
//https://www.geeksforgeeks.org/find-subarray-with-given-sum/
//
//2.Move all negative numbers to beginning and positive to end with constant extra space
//
//https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/
//
//3.Union and Intersection of two sorted arrays
//
//https://www.geeksforgeeks.org/union-and-intersection-of-two-sorted-arrays-2/
//
//4.Sort an array of 0s, 1s and 2s | Dutch National Flag problem
//
//https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
//
//5.Count number of occurrences (or frequency) in a sorted array

//https://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/


//10.Write a program to reverse the array and find average.
public class A_10_Array
{
	public static void reverseFun(int [] a)
	{
		for(int i=a.length-1 ; i >=0 ; i--) 
		{
			System.out.print(a[i]+" ");
		}
	}
	
	public static int averageFun(int [] sourabh)
	{
		int sum = 0;
		int avg = 0;
		for(int i=sourabh.length-1 ; i >=0 ; i--) 
		{
			sum = sum+ sourabh[i];
			avg = sum / sourabh.length;
		}
		
		return avg;
	}
	
	
	 public static void main(String[] args)
	 {
		 int arr[] = {4,2,8,9,1,6,7};
		 
		 reverseFun(arr);
		 int avg =averageFun(arr);
		 System.out.println("\nAverage of array is :- "+avg);
	 }

}
