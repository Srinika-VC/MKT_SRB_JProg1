package ab46_Class_5;

import java.util.Scanner;

public class Howto_accept_thehuman_inputatthe_run_time 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		int a= s1.nextInt();
		System.out.println("Enter the value of a--->"+a);
		int b= s1.nextInt();
		System.out.println("Enter the value of b-->"+b);
	    int sum=a+b;
	    System.out.println("Enter total values--->"+sum);

	}

}
