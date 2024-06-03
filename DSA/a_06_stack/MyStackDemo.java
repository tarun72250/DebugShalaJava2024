package a_06_stack;

import java.util.Scanner;

public class MyStackDemo 
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Stack...!");
		int size = sc.nextInt(); 
		MyStack sourabh = new MyStack(size);
	
		
		
		int ch ;
		do
		{
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.display");
			System.out.println("4.peek");
			System.out.println("5.exit");
			System.out.println("Enter your choice");
			int ele ;
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter ele to insert in Stack...");
				ele = sc.nextInt();
				sourabh.push(ele);
				sourabh.display();
				break;
			case 2 :
				System.out.println("---------------------------");
				ele = sourabh.pop();
				if(ele == -9999)
				{
					System.out.println("Stack is Empty...");
				}
				else
				{
					System.out.println("deleted element :-"+ele);
				}
				sourabh.display();
				break;
			case 3 :
				System.out.println("------------------------------");
				sourabh.display();
				break;
			case 4 :
				System.out.println("--------------------------------");
				System.out.println("TOp element ...!"+sourabh.peek());
				break ;
			case 5 :
				System.exit(ch);
				break;
			}
		}
		while(ch!=0);
		
	}

}
