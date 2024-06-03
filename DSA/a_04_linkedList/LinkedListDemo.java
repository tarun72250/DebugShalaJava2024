package a_04_linkedList;

import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList list1 = new LinkedList();
		
		int ch=1;
		
		do
		{
			System.out.println("\n\n--------------------------------");
			System.out.println("1.Create Linked List :");
			System.out.println("2.Add node at beginning :");
			System.out.println("3.Add node at end :");
			System.out.println("4.Display records of LinkedList :");
			System.out.println("5.Addnode at particular position ");
			System.out.println("6.Delete Node at Beginning ");
			System.out.println("7.Delete node at Last");
			System.out.println("0. Exit :");
			
			System.out.println("Enter your choice ");
			ch = sc.nextInt();
			
			switch(ch)
			{
			case 1 :
					System.out.println("Enter size of nodes u want to add..");
					int size = sc.nextInt();
					list1.createLinkedList(size);
					break;
			case 2 :
					System.out.println("Enter data you want to add at beginning..");
					int data = sc.nextInt();
					list1.addBeginning(data);
					list1.display();
					break;
			case 3 :
				System.out.println("Enter data you want to add at Last..");
				int data1 = sc.nextInt();
				list1.addEnd(data1);
				list1.display();
				break;	
			case 4 :
					System.out.println("---------------Display-----------------");
					list1.display();
					break;
			case 5 :
					System.out.println("Enter data to node");
					int data2 = sc.nextInt();
					System.out.println("Enter position");
					int pos = sc.nextInt();
					list1.addNode(data2, pos);
					list1.display();
					break;
			case 6 :
					list1.delNodeAtBeg();
					list1.display();
					break;
			case 7 :
					list1.delNodeAtEnd();
					list1.display();
					break;
			}
		}while(ch!=0);
		
	}

}
