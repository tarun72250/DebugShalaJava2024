package day_18_multithreadingAssignment;

//Show the name and priority of the default thread in a Java application.
public class B_01_DefaultThreadInfo 
{
    public static void main(String[] args) 
    {
    
    	
    	Thread t = Thread.currentThread();
    	System.out.println("Thread name :- "+t.getName());
    	System.out.println("Thread Priority :- "+t.getPriority());
    	
    	
    	
    }
}
 