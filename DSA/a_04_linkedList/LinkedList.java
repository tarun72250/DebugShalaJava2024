package a_04_linkedList;

public class LinkedList 
{
	Node head;//refrence of Node
	
	
	public LinkedList()
	{
		head =null;
	}
	
	
	//1. create LinkedList of size
	public void createLinkedList(int size)
	{
		//iterate through the user size
		for(int i =1 ; i<=size ; i++)
		{
			//Creating a new node   
			Node record = new Node();
			//if head is null , means no ele are there
			if( head == null)
			{
				head =record;
			}
			
			else
			{
				//this move is use here for iterating from start to end
				Node move = head ;
				while(move.next != null)
				{
					move = move.next;//iterating 
				}
				//last node assign new record
				move.next=record;
			}
		}
	}
	
	//2.add node at beginning
	public void addBeginning(int data)
	{
		Node record = new Node(data);
		
		if(head == null)
		{
			head = record;
			return;
		}
		record.next = head;
		head = record;
	}
	
	
	//3.add node at last
	public void addEnd(int data)
	{
		Node record = new Node(data);
		
		if(head == null)
		{
			head = record;
			return;
		}
		
		Node move = head;
		while(move.next!=null)//iterate through last 2
		{
			move = move.next;//iteration
		}
		move.next=record;
	}
	
	
	//4.display data in all nodes
	public void display()
	{
		Node move = head ;
		while(move!=null)
		{
			System.out.print(" |"+move.data);
			move= move.next;//iterating
		}
	}
	
	
	//5.add value at this position
	public void addNode(int data , int pos)
	{
		//new record 
		Node record = new Node(data);
		//for iterating
		Node move = head ;
		
		if(pos == 1)
		{
			addBeginning(data);
			return;
		}
		
		//middle pos 
		for(int i=1  ; i<pos-1 ; i++)
		{
			move = move.next;
		}
		
		record.next = move.next;
		move.next=record;
		
	}


	    //6.delete node at beginning
		public void delNodeAtBeg() {
			// TODO Auto-generated method stub
			Node temp = head ;
			head = head.next;
			System.out.println("Deleted Data :"+temp.data);
			temp=null;
		}

	
		//7.delete node at end 
		public void delNodeAtEnd()
		{
			//iterator
			Node move = head ;
			Node temp = head;
			while(move.next.next != null)
			{
				move = move.next;
				temp= move.next;
			}
			move.next=null;
			
			System.out.println("Deleted data :"+temp.data);
		}
}
