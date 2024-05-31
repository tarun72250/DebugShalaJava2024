package a_01_arrays;

import java.util.Scanner;

public class A_01_LinkedListDemo {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		A_01_LinkedList list1 = new A_01_LinkedList();
		
		int ch=1;
		
		do
		{
			System.out.println("\n\n--------------------------------");
			System.out.println("1.Create Linked List :");
			System.out.println("2.Display records of LinkedList :");
			System.out.println("Enter your choice ");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1 :
					System.out.println("Enter size of nodes u want to add..");
					int no = sc.nextInt();
					list1.createLinkedList(no);
					break;
			case 2 :
					System.out.println("---------------Display-----------------");
					list1.display();
					break;
			}
		}while(ch!=0);
		
	}

}
