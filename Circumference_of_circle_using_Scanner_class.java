package ab46_programs_assngmnts;

import java.util.Scanner;

public class Circumference_of_circle_using_Scanner_class 
{
public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value PI");
		double pi = s1.nextDouble();
		System.out.println("Enter value radius");
		double r= s1.nextDouble();
		
		double Circumference =2*pi*r;
		System.out.println(Circumference);
	}

}
