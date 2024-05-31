package a_01_arrays;

public class A_01_Node
{
	int data;
	A_01_Node next;//refrence of next node 
	
	//default cons
	public A_01_Node()
	{
		data=0;
		next = null;
	}
	
	//para cons
	public A_01_Node(int data)
	{
		this.data= data;
		next = null;
	}
}
