package day_18_multithreadingAssignment;

//Creating Thread by extending Thread class
public class A_01_MyThread extends Thread {

	//task to be performed by thread
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Child thread : "+i);
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	

}
