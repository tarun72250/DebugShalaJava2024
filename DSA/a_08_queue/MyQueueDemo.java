package a_08_queue;

import java.util.Scanner;

public class MyQueueDemo 
{
	public static void main(String[] args) 
	{
		MyQueue m1 = new MyQueue(5);
		
		Scanner sc = new Scanner(System.in);
		
		int ch = 1;
		
		do
		{
			System.out.println("1.EnQueue");
			System.out.println("2.DeQueue");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			System.out.println("Enter the choice...!");
			ch=sc.nextInt();
			int ele;
			switch(ch)
			{
			case 1 : System.out.println("Enter element ");
					 ele = sc.nextInt();
					 m1.enQueue(ele);
					 m1.display();
					 break;
			case 2 : 
					 ele = m1.deQueue();
					 System.out.println("Deletede element :-"+ele);
					 m1.display();
					 break;
			case 3 : m1.display();
					 break;
			case 4 : 
					 System.exit(0);
				     break;
			}
		}while(ch!=0);
	}
}
