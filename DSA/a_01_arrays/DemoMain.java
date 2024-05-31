package a_01_arrays;


class DemoMain
{
	public static void main(String[] args) {
		
		Demo d = new Demo();//default cons calling
			d.display();
		Demo d1 = new Demo(12,12,2024);//parametrized cons cons calling
			d1.showDate('-');
		Demo d2 = new Demo(11,12);//partially parametrized cons
			d2.showDate('/');
			
			
		Demo.staticDisplay(22);
		Demo.staticDisplay(13);
		
	}
	 
}