package day_06_oopIII;

public class PublisherDemo {

	public static void main(String[] args) {
		
		Publisher p =new Publisher();
		p.display();
		
		Publisher p1 =new Publisher(101,"Amit rohra","Pune");
		p1.display();
		int pid = p1.getPubid();
		System.out.println("Pub id using getter(): "+pid);
		
		p1.setPubid(201);
		
	}

}
