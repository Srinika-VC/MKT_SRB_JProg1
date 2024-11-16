package ab46_programs_assngmnts;

import java.util.Scanner;

public class Aea_of_Rectangle_using_Scanner_class 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of length ");
		int l = s1.nextInt();
		System.out.println("Enter value of width");
		int w= s1.nextInt();
		
		int Rectangle =l*w;
		System.out.println(Rectangle);
	

	
	}

}
