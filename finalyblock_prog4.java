package eXception_handling_proglist;

public class finalyblock_prog4 
{
public static void main(String[] args) 
	{
	try
	{
	int[] mynumber= {1,2,3};
	System.out.println(mynumber[10]);
	
	}
	catch(ArrayIndexOutOfBoundsException a1)
	{
		System.out.println("Exception handled");
	}
	finally 
	{
		System.out.println("the try and catch is finished");
		}
	}}
	

