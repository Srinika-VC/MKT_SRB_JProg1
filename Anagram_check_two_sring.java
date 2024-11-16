package all_Array_cons;

import java.util.Arrays;

public class Anagram_check_two_sring 
{
public static void main(String[] args)
	{
		String s1="cafe";
		String s2="face";
		if(s1.length()!=s2.length())
		{
			System.out.println("They are anogram");
		}
		else
		{
		  char c1[]= s1.toCharArray();
		  char c2[]= s2.toCharArray();
		  
		/*  Arrays.sort(c1);
		  Arrays.sort(c2); 
		  sysout(Arrays.toString(c1));
		  sysout(Arrays.toString(c2));
		  //sorting
		  
		 boolean b1= Arrays.equals(c1, c2);
		  if(b1==true)
		  {
			  System.out.println("They are anagram");
		  }
		  else
		  {

			  System.out.println("They are not anagram");
		  }*/
	}

}}
