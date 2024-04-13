package day_07_stringsDemo;

public class A_01_CreationOfString {

	public static void main(String[] args) {
		
		//Declaration of String
		//String Literal 
		String str ="DebugShala ";//Both mean same
		//String creation Using new Keyword
		String str1 = new String("Traning and Placement Centre");
		System.out.println(str +" "+str1);
		
		//String Methods in Java
		//1 length()
		System.out.println("DebugShala".length());//return 10 char in a String
		//2 charAt()
		System.out.println("DebugShala".charAt(3));//return u
		//3 substring(3)
		System.out.println("DebugShala".substring(3));//return ugShala
		//4 substring(2,5)
		System.out.println("DebugShala".substring(2,5));//return bug
		//5 concat()
		String new_str = str.concat(str1);
		System.out.println(new_str);//DebugShala Traning and Placement Centre 
		//6 indexOf()
		String s = "Learn Share Learn";
		int output = s.indexOf("Share"); // returns 6
	    String s1 = "Learn Share Learn";
	    int output1 = s1.indexOf("Play");  // return -1
		String s3 = "Learn Share Learn";
		int output3 = s.indexOf("ea",3);// returns 13
		System.out.println(output + " " + output1 +" " +output3);
		//7 lastIndexOf()
		String s4 = "Learn Share Learn";
	    int output4 = s.lastIndexOf("a"); // returns 14
	    System.out.println(output4);
	    //8 equals()
	    Boolean out = "DebugShala".equals("DebugShala"); // returns true
	    Boolean out1 = "DebugShala".equals("DebugShala"); // returns false
	    System.out.println(out + " " + out1);
	    Boolean out3= "DebugShala".equalsIgnoreCase("DebugShala"); // returns true
	    Boolean out4 = "DebugShala".equalsIgnoreCase("DebugShala"); // returns true
	    System.out.println(out3 +" "+ out4);
	    //9 toLowerCase() and toUpperCase()
	    String word1 = "HeLLo";
	    String word3 = word1.toLowerCase(); // returns “hello"
	    System.out.println(word3);
	    String word2 = "HeLLo";
	    String word4 = word2.toUpperCase(); // returns “HELLO”
	    System.out.println(word4);
	    //10 trim()
        String word5 = " Learn Share Learn ";
        System.out.println("Trim the word " + word5.trim());
        //11 replace()
        String word6 = "DebusShala";
        System.out.println("Original String " + word6);
        String word7 = "DebusShala".replace('s' ,'g') ;
        System.out.println("Replaced s with g -> " + word7);
	}
}
