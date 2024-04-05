package day_06_oopIII;

public class A_03_Book {
	
	int bookid; 		 // data members
	float price;
	
	static int count; 	//static members
	
	
	static 				//static block
	{
		count=0;
	}
	
	
	public A_03_Book()  			//default constructor
	{
		count++;
		bookid=count	;
		this.price=0;
	}
	public A_03_Book(float price)	//parametrized constructor
	{
		count++;
		bookid=count;
		this.price=price;
	}
	public void showDetails()		//methods
	{
		System.out.println("Book id :" +bookid+" price : "+price);
	}

}
