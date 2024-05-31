package day_19_multithreading2Assignment;

public class A_01_CountDownJob implements Runnable  //1
{
	//2 create Thread instance as well 
	private Thread t;
	
	private int num;
	private String name;
	
	//default cons
	public A_01_CountDownJob()
	{
		//3 
		t = new Thread(this);
	}
	
	
	//para cons
	public A_01_CountDownJob(String name,int num)
	{
		this.name = name;
		this.num = num;
		//3
		t = new Thread(this);
	}	
	
	//return instance 
	public Thread getT() {
		return t;
	}

	@Override
	public void run() {
		while(num > 0)
		{
			System.out.println(name+" counting : "+num);
			num--;
		}
	}

}
