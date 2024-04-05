package day_06_oopIII;

public class Person {

	String name;//non-static/instance members
	Date bdate;//object , refrence variable
	
	public Person()
	{
		//isko likhne ki need nhi h ab//name and bdate will remain null
//		name=null;
//		bdate=null;
		this.name="not assigned";
		this.bdate = new Date();///
	}
	
	public Person(String name,int dd , int mm , int yy)
	{
		//this.name=new String(name); // this will also correct bcoz String is a also class 
		this.name=name;
		this.bdate=new Date(dd,mm,yy);
	}
	
	
	public void display()
	{
		System.out.println("Name :"+name);
		bdate.showDate();
		/*if(bdate != null)
			bdate.showDate();
		else
			System.out.println("BirthDate is null");*/
	}
}
