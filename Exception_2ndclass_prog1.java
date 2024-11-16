package eXception_handling_proglist;

import java.util.Scanner;

public class Exception_2ndclass_prog1 
{
public static void main(String[] args) 
	{
	try
	{
	  Scanner s1=new Scanner(System.in);
	  int size= s1.nextInt();
		int[] rollno=new int [size];
	}
	catch(NegativeArraySizeException E1)
	{
		System.out.println("The array size can only be positive numeric vlues only");
		 Scanner s1=new Scanner(System.in);
		  int size= s1.nextInt();
			int[] rollno=new int [size];
	}
	}

}
