package a_06_stack;

public class MyStack {

	int arr[];//instance variable array
	int size , top;//instance data member
	
	
	//int arr [] = new int [3];
	
	
	//parametrized cons
	public MyStack(int size)
	{
		this.size=size;
		arr = new int[size];
		this.top = -1;
	}
	
	
	//Is My Stack is Empty return boolean value
	public boolean isEmpty()
	{
		if(top == -1)//stack is empty
			return true;
		else//stack have some element
			return false;
	}
	
	//Is My Stack is FUll 
	public boolean isFull()
	{
		if(top == size-1)//stack is full
			return true;
		else//stack have some space 
			return false;
	}
	
	
	//add element in Stack 
	public void push(int ele)
	{
		if(!isFull())//Is My Stack is Not Full 
			arr[++top]=ele;//increase the top and add element in that index
		
		else
			System.out.println("Stack is full....!");
	}
	
	//remove element in Stack
	public int pop()
	{
		int ele =0;
		if(isEmpty())//
			ele = -9999;//stack is empty
		else if (!isEmpty())//stack is not empty
		{
			ele= arr[top];//top most element remove and dip into ele
			top--;//top will be decreased
		}
		return ele;
	}
	
	public int peek()
	{
		int ele = -9999;
		if(!isEmpty())
			ele = arr[top];
		else
			System.out.println("Stack is empty...!");
		
		return ele;
	}
	
	
	public void display()
	{
		if(!isEmpty())//if my Stack is not empty . my stack having some element, 
		{
			System.out.println("----------------Stack is -----------------");
			for(int i=top ; i >= 0 ; i--)
			{
				System.out.println(" "+arr[i]);
				System.out.println();
				System.out.println("--------------------------------");
			}
		}
	}
	
	
	
	
}
