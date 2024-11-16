package anograms_prog_list;

import java.util.Arrays;

public class Anogram_practice_prog1 
{
public static void main(String[] args) 
	{
	String a="arm";
	String b="ram";
	
	if(a.length()!=b.length())
	{
		System.out.println("yes both are equals");
	}
	else
	{
		System.out.println("yes both are not equals");
	}
	char c1[]= a.toCharArray();
	char c2[]= b.toCharArray();
	
	
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	System.out.println(c1);
	System.out.println(c1);
	
	
    boolean b1=Arrays.equals(c1, c2);
    if(b1==true)
    {
    	System.out.println("yes true");
    }
    else
    {
    	System.out.println("false");
    }
}}
