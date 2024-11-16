package ab46_programs_assngmnts;

import java.util.Scanner;

public class Area_of_Circle
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of PI ");
		double pi = s1.nextDouble();
		System.out.println("Enter value of radius");
		double r= s1.nextDouble();
		System.out.println("Enter value of radius1");
		double r1= s1.nextDouble();
		
		
		double Circle =pi*r*r1;
		System.out.println(Circle);

	}

}
