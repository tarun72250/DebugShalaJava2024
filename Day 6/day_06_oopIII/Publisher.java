package day_06_oopIII;

public class Publisher {
	
	private int pubid;
	private String pub_name;
	private String pub_loc;
	
	//default cons
	public Publisher() {
		
		
	}

	//para cons
	public Publisher(int pubid, String pub_name, String pub_loc) {
		super();
		this.pubid = pubid;
		this.pub_name = pub_name;
		this.pub_loc = pub_loc;
	}

	
	public void display() {
		System.out.println( "Publisher [pubid=" + pubid + ", pub_name=" + pub_name + ", pub_loc=" + pub_loc + "]");
	}

	//getter method
	public int getPubid() {
		return pubid;
	}

	//setter method
	public void setPubid(int pubid) {
		this.pubid = pubid;
		System.out.println("Updated pubid : "+pubid);
	}
		
}
