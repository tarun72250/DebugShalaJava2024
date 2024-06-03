package a_08_queue;

public class MyQueue 
{
	int arr [];//instance dm
	int front , rear , size ;
	
	
	//int arr [] = new int[3];
	
	//parametrized constructor
	public MyQueue(int size)
	{
		arr = new int[size];
		this.rear = -1;
		this.front = -1;
		this.size=size;
	}
	
	//Queue is Empty  ,return boolean value
	public boolean isEmpty()
	{
		if(front == -1 && rear == -1)//queue is empty
			return true;
		else //queue is not empty.
			return false;
	}
	
	//queue is full
	public boolean isFull()
	{
		if(rear == size-1)//rear is size-1 means queue is full
			return true; // return true
		else//queue have some space to add elements
			return false;
	}
	
	
	//add element in queue
	public void enQueue(int element)
	{
		if(isFull())
		{
			System.out.println("Queue is Full....!");
		}
		else
		{
			if( front == -1 && rear ==-1 )
			{
				front = 0;
				rear++;
				arr[rear] = element;
			}
		}
	}
	
}
