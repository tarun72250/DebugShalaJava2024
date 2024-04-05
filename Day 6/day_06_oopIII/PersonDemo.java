package day_06_oopIII;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Asfiya",11,11,1917);
		p1.display();
		
		Person p2 = new Person();//this will through error if we can't handle in display method
		p2.display();//because "this.bdate" is null
	}

}
