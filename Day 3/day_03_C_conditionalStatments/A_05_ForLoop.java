package day_03_C_conditionalStatments;

public class A_05_ForLoop {

	public static void main(String[] args) {


		for(int i = 10 ; i >=1 ; i--)
		{
			System.out.println(i);
		}

		
		for(int i = 1 ; i<=5 ; i++)
		{
			for(int j = 1 ; j <=i ; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
