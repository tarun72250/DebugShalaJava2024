package a_01_arrays;

public class A_01_LinkedList 
{
	A_01_Node head;//refrence of Node
	
	
	public A_01_LinkedList()
	{
		head =null;
	}
	
	
	//1. create LinkedList of size
	public void createLinkedList(int size)
	{
		for(int i =1 ; i<=size ; i++)
		{
			A_01_Node record = new A_01_Node();
			//if head is null , means no ele are there
			if( head == null)
			{
				head =record;
			}
			
			else
			{
				//this move is use here for iterating from start to end
				A_01_Node move = head ;
				while(move.next != null)
				{
					move = move.next;
				}
				//last node assign new record
				move.next=record;
			}
		}
	}
	
	//2.display datat in all nodes
	public void display()
	{
		A_01_Node move = head ;
		while(move!=null)
		{
			System.out.print(" |"+move.data);
			move= move.next;
		}
	}
	
	
}
