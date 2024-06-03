package treeSetDemo;

import java.util.Comparator;

//public class A_09_Employee implements  Comparable<A_09_Employee>
public class A_09_Employee implements Comparator<A_09_Employee>
{
	int eid;
	String name;
	int sal;
	
	
	public A_09_Employee() 
	{
		super();
	}


	public A_09_Employee(int eid, String name, int sal) 
	{
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}

	
	public int compare(A_09_Employee o1, A_09_Employee o2) 
	{
		int diff=o1.sal-o2.sal;
		
		return diff;
	}

}