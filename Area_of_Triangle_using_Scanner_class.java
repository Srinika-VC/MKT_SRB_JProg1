package ab46_programs_assngmnts;

import java.util.Scanner;

public class Area_of_Triangle_using_Scanner_class
{
	public static void main(String[] args) 
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter value of base ");
			int b = s1.nextInt();
			System.out.println("Enter value of height");
			int h= s1.nextInt();
			
			double Triangle =0.5*b*h;
			System.out.println(Triangle);
		}

}
