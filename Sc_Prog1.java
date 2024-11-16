package sCannerClass_class11;

import java.util.Scanner;

public class Sc_Prog1 {
	public static void main(String[] args) 
	{
		//basic program
		/*Scanner s1= new Scanner(System.in);
		System.out.println("please enter ur age");
		int age= s1.nextInt();*/
		
		//lets do addition of 2 number at run time

		Scanner s1= new Scanner(System.in);
		System.out.println("please enter value if a");
		int a= s1.nextInt();
		System.out.println("please enter value if b");
		int b= s1.nextInt();
		
		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		int mod=a%b;
		int divi=a/b;
		System.out.println("sub=" +sub);
		System.out.println("mult=" +mult);
		System.out.println("mod=" +mod);
		System.out.println("div=" +divi);
		System.out.println("Sum=" +sum);
		
	}

}
