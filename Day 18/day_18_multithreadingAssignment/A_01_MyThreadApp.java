package day_18_multithreadingAssignment;

public class A_01_MyThreadApp extends Thread{

	public static void main(String[] args) 
	{
		//main thread
		A_01_MyThread t = new A_01_MyThread();
		t.start();
		for(int i=1;i<=5;i++)
		{
			System.out.println("Main thread : "+i);
			try {
				Thread.sleep(500);//static method
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
