package day_07_stringsDemo;

public class A_01_CreationOfString {

	public static void main(String[] args) 
	{	
		//Declaration of String
		//String Literal 
		String str ="DebugShala";//Both mean same
		//String creation Using new Keyword

		String str1 = new String("Training and place centre");
		System.out.println(str +" "+str1);

		//iteration in string using for loop
		for(int i=0 ; i<str.length();i++)
		{
			System.out.print(str.charAt(i));
		}
		
		//String Methods in Java
		//1 length()
        System.out.println("\n------length()-------");
				System.out.println("\n"+str.length());//return 10 char in a String
		
		//2 charAt()
		        System.out.println("\n------charAt()-------");
				System.out.println(str.charAt(3));//return u
		
		//3 substring(3)
		        System.out.println("\n------substring(3)-------");
				System.out.println(str.substring(3));//return ugShala
				
		//4 substring(2,5)
		        System.out.println("\n------substring(2,5)-------");
				System.out.println(str.substring(2,5));//return bug
				
		//5 concat()
		        System.out.println("\n------concat()-------");
				String new_str = str.concat(str1);
				System.out.println(new_str);//DebugShala Traning and Placement Centre 
				
		//6 indexOf()
		        System.out.println("\n------indexOf()-------");
				String s = "Learn Share Learn";
				int output = s.indexOf("Share"); // returns 6
			    String s1 = "Learn Share Learn";
			    int output1 = s1.indexOf("Play");  // return -1
				String s3 = "Learn Share Learn";
				int output3 = s.indexOf("are",3);// returns 8
				System.out.println(output+" "+output1+" "+output3);
		
		//7 lastIndexOf()
		        System.out.println("\n------lastIndexOf()-------");
				String s4 = "Learn Share Learn";
			    int output4 = s.lastIndexOf("a"); // returns 14
			    System.out.println(output4);
		
	    //8 equals()
		        System.out.println("\n------equals()-------");
			    Boolean out = str.equals("DebugShala"); // returns true
			    Boolean out1 = str.equals("DebugShala "); // returns false
			    System.out.println(out + " " + out1);
			    Boolean out3= "DebugShala".equalsIgnoreCase("DebugShala"); // returns true
			    Boolean out4 = "DebugShala".equalsIgnoreCase("DebugShala "); // returns false
			    System.out.println(out3 +" "+ out4);
		
	    //9 toLowerCase() and toUpperCase()
		        System.out.println("\n------toLowerCase() and toUpperCase()-------");
			    String word1 = "HeLLo";
			    String word3 = word1.toLowerCase(); // returns “hello"
			    System.out.println(word3);
			    String word2 = "HeLLo";
			    String word4 = word2.toUpperCase(); // returns “HELLO”
			    System.out.println(word4);
	    
		//10 trim()
		        System.out.println("\n------trim()-------");
		        String word5 = "            Learn Share Learn ";//removed whitespaces from sides
		        System.out.println("Trim the word :" + word5.trim());
		
		//11 replace()
		        System.out.println("\n------replace()-------");
		        String word6 = "DebusShala";
		        System.out.println("Original String :" + word6);
		        String word7 = "DebusShala".replace('s' ,'g') ;
		        System.out.println("Replaced s with g -> " + word7);

		//12 startsWith(String prefix)
		        System.out.println("\n------startsWith(String prefix)-------");
		        boolean startsWith = str.startsWith("Hello");
		        System.out.println("Starts with 'Hello': " + startsWith);
		
		//13 endsWith(String suffix)
		        System.out.println("\n------endsWith(String suffix)-------");
		        boolean endsWith = str.endsWith("ala");
		        System.out.println("Ends with 'ala': " + endsWith);
		
		//14 split(String regex)
		        System.out.println("\n------Split parts:-------");
		        String var="Deb,ugS,hala";
		        String[] parts = var.split(",");
		        for (String part : parts) {
		            System.out.println(part.trim());
		        }
		//15 equals(Object anObject)
		        System.out.println("\n------equals(Object anObject)-------");
		        String str2 = "DebugShala";
		        boolean isEqual = str.equals(str2);
		        System.out.println("Strings are equal: " + isEqual);
		        
		//16 contains(CharSequence s)
		        System.out.println("\n------contains(CharSequence s)-------");
		        boolean contains = str.contains("Hello");
		        System.out.println("Contains 'Hello': " + contains);
		        boolean contains1 = str.contains("DebugShala");
		        System.out.println("Contains 'DebugShala': " + contains1);
		        
		//17 isEmpty()
		        System.out.println("\n------isEmpty()-------");
		        boolean isEmpty = str.isEmpty();
		        System.out.println("String is empty: " + isEmpty);
		        
		//18 isEqualIgnoreCase()
		        System.out.println("\n------isEqualIgnoreCase()-------");
		        String var1 = "HELLO";
		        String var2 = "hello";
		        boolean isEqualIgnoreCase = var1.equalsIgnoreCase(var2);
		        System.out.println("equalsIgnore case result: " + isEqualIgnoreCase);
		        
	}
}
/*

		
		
		
		
		
	   
	
*/