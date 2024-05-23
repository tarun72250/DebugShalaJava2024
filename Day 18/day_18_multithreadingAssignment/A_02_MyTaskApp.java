package day_18_multithreadingAssignment;

//here execution get execute their own way .for seen in simultneously execution seen in next demo
public class A_02_MyTaskApp 
{

	public static void main(String[] args) 
	{
		Runnable r = new A_02_MyTask();
		Thread t = new Thread(r);
		t.start();   //r.run() ready to run
		for(int i=1;i<=5;i++)
		{
			try 
			{
				System.out.println("Main thread : "+i);
				Thread.sleep(500);//static method
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		

	}

}

/*
 Main thread : 1
Child thread : 1
Child thread : 2
Child thread : 3
Main thread : 2
Child thread : 4
Child thread : 5
Main thread : 3
Main thread : 4
Main thread : 5
Here one task not completed like main or child , else executing their own way so we use something in next demo 

*/
//This non-deterministic interleaving is typical of multithreading environments. 
//To control the order, you would need to use synchronization mechanisms, but in many cases,
//the exact order is not critical, and this interleaving is acceptable or even desirable.