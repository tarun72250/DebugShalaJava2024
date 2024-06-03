package setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
//The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements. 
//where we maintain the insertion odf order.
//duplicates are not allowed .
//only one null value can be stored 
//insite of hasing insertion of order will be preserved
//it is not useful for searching operations.
public class A_07_LinkedHashSetDemo 
{
	public static void main(String[] args) 
	{
		
		
		//Insertion of order will be presereved
		Set <String> set = new LinkedHashSet<>();
		set.add("Nitesh");
		set.add("Vishal");
		set.add("Pravesh");
		set.add("Arpit");
		set.add("Balkrishna");
		set.add("Hitanshi");
		set.add("Rajat");
		set.add("Prakash");
		set.add("Sumit");
		set.add("Nitesh");//duplicates are not allowed
		set.add(null);//only one null value should be allowed
		
		//1.way
//		for( String s : set)
//		{
//			System.out.println(s);
//		}
		 
		Set <A_06_Student> s = new LinkedHashSet<>();
		s.add(new A_06_Student(101,"Nitesh",94.0f,"pune"));  // s.add new A_06_Student(same);
		s.add(new A_06_Student(102,"Mehak",92.0f,"pune"));
		s.add(new A_06_Student(103,"Asfiya",93.0f,"nashik"));
		s.add(new A_06_Student(104,"Sumir",96.0f,"Indore"));
		s.add(new A_06_Student(105,"Manas",91.0f,"pune"));
		s.add(new A_06_Student(106,"Farhan",92.0f,"Indore"));
		s.add(new A_06_Student(107,"Mahesh",98.0f,"mumbai"));
		s.add(new A_06_Student(108,"Nikhil",94.0f,"mumbai"));
		s.add(new A_06_Student(109,"Anup",92.0f,"nashik"));
		s.add(new A_06_Student(103,"Asfiya",94.0f,"nashik"));//s.add new A_06_Student(same);
		
		//2 way
		Iterator <A_06_Student> i = s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}



/*
//insertion of order will be preserved
		Set <Integer> numbers = new LinkedHashSet<>();
		numbers.add(10);
		numbers.add(50);//asskcdsjk
		numbers.add(20);//snjsdjdskj hashing internally used 
		numbers.add(30);//reason why no are random
		numbers.add(20);//no duplicates are allowed
		numbers.add(40);
		
		System.out.println(numbers);//toSting() call

		System.out.println(numbers.contains(20));//true
		
		System.out.println(numbers.isEmpty());//false
		
		System.out.println(numbers.size());//5
		
		
		Set <Integer> set = new LinkedHashSet<>();
		set.add(70);
		set.add(20);
		set.add(90);
		set.add(60);
		set.add(40);
		set.add(20);//duplicates are not allowed in Set
		set.add(10);
		set.add(30);
		
		for(Integer i:set)
		{
			System.out.println(i);
		}
		
		Set<String> set1=new LinkedHashSet<>();
		set1.add("java");
		set1.add("int");
		set1.add("double");
		set1.add("class");
		set1.add("interface");
		set1.add("implements");
		set1.add("default");
		set1.add("class");//duplicates are not allowed in Set
		set1.add("Double");
		
		for(String s:set1)
			System.out.println(s);
		
		
		
		
		System.out.println();//insertion of order will be preserved
		Set<A_06_Student> s = new LinkedHashSet<>();
		s.add(new A_06_Student(101,"Tarun",94.0f,"Indore"));
		s.add(new A_06_Student(102,"Mehak",92.0f,"pune"));
		s.add(new A_06_Student(103,"Asfiya",93.0f,"nashik"));
		s.add(new A_06_Student(104,"Sumit",96.0f,"Indore"));
		s.add(new A_06_Student(105,"Manas",91.0f,"pune"));
		s.add(new A_06_Student(106,"Farhan",92.0f,"Indore"));
		s.add(new A_06_Student(107,"Mahesh",98.0f,"mumbai"));
		s.add(new A_06_Student(108,"Nikhil",94.0f,"mumbai"));
		s.add(new A_06_Student(109,"Anup",92.0f,"nashik"));
		
		//advanced for loop
		for(A_06_Student stu :s)
		{
			System.out.println(stu);
		}
		


*/