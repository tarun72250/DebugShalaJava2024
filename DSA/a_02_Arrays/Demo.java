package a_02_Arrays;

public class Demo 
{
	//instance dm non-static dm
	int dd ; int mm ; int yy ;

	//static dm
	static int date ;
	
	//static block
	static {
		date = 2024;
	}
	
	//Constructor :- Cons is special methodn , because same name as class name ,difference in their parameters , cons does not have any return type.
	//Purpose of constructor :- creating object of class
	//default cons
	public Demo()
	{
//		this.dd=0;
//		this.mm=0;
//		this.yy=0;
	}
	
	//para cons
	public Demo(int dd , int mm , int yy)
	{
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	public Demo(int dd , int mm)
	{
		this.dd=dd;
		this.mm=mm;
	}
	
	
	//instance member method 
	//non-static method
	public void display()
	{
		System.out.println(dd+" "+mm+" "+yy);
	}
	
	public void showDate(char ch)
	{
		System.out.println(dd+" "+ch+" "+mm+" "+ch+" "+yy);
		
	}
	
	
	//static method
	public static void staticDisplay(int date)
	{
		date=date;
		System.out.println(date);
	}

}
