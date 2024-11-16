package anograms_prog_list;

import java.util.Arrays;

public class Anograms_prog_2 
{
public static void main(String[] args) 
{
    String s1="cafe";
	String s2="face";
	
	if(s1.length()!=s2.length())
	{
		System.out.println("they are not anogram");
	}
	
	else {
		char[] c1=    s1.toCharArray();
	    char[] c2=    s2.toCharArray();
	
	Arrays.sort(c2);
	Arrays.sort(c1);
	//sorting
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2)); 
	      
	      }

}}
