package day_18_multithreadingAssignment;

//Creating Thread by implementing Runnable interface
public class A_02_MyTask implements Runnable 
{

	@Override
	public void run() {

		for(int i=0 ;i<=5;i++)
		{
				System.out.println("Child Thread...!"+i);
				try
				{
					Thread.sleep(1500);
				} 
				catch (InterruptedException e) 
				{
					
					e.printStackTrace();
				}
				
		}
	}
}
  /*
   //task to be performed by thread
		@Override
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Child thread : "+i);
				try 
				{
					Thread.sleep(200);
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
   */