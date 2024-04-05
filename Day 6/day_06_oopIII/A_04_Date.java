package day_06_oopIII;

public class A_04_Date {
	
	private int dd; // data members
	private int mm;
	private int yy;
	int a;
	
	static int count; //static data members
	static // static block
	{
		count=0;
	}
	public A_04_Date() //default constructor
	{
		count++;
		a=count;
		dd=1;
		mm=1;
		yy=1970;
	}
	public A_04_Date(int dd,int mm,int yy) // parametrized constructor
	{
		count++;
		a=count;
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
	}
	
	public A_04_Date(Date d) // para constructor
	{
		count++;
		a=count;
		this.dd=d.dd;
		this.mm=d.mm;
		this.yy=d.yy;
		
	}
	public void showDate(char ch) // method
	{
		System.out.println(dd+""+ch+mm+""+ch+yy);
	}
	
	public void showDate()
	{
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	
	public boolean isLeapYear()
	{
		if(yy%4==0 && yy%100!= 0)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

}
