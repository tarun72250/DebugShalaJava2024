package a_04_linkedList;

public class Node
{
	int data;
	Node next;//refrence of next node 
	
	//default cons
	public Node()
	{
		data=0;
		next = null;
	}
	
	//para cons
	public Node(int data)
	{
		this.data= data;
		next = null;
	}
}
