package day_14_exceptionHandling_customException;

public class A_06_PasswordTooLongExp extends Exception {
	
	String msg="Pass Too Long";
	 
	public A_06_PasswordTooLongExp ()
	{
		msg="Pass too long";
	}
	
	public String getmessage() {
		return msg;
	}
	
	public String tostring()
	{
		return msg;
	}
}
