package day_18_multithreadingAssignment;

//Creating Thread by implementing Runnable interface
<<<<<<< HEAD
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
=======
public class A_02_MyTask implements Runnable {

	//task to be performed by thread
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
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
<<<<<<< HEAD
   */
=======
}
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
