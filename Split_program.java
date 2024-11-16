package sCannerClass_class11;

import java.util.Arrays;

public class Split_program 
{
  public static void main(String[] args) 
	{
	  String a1="Manish Kumar Tiwari";
      String []name =     a1.split(" "); // where u want to split
	     System.out.println(Arrays.toString(name));
		
	  String []name1 =     a1.split(" ", 2);
	     System.out.println(Arrays.toString(name1));
		
		
	  String a3="School";
	     System.out.println(a3.repeat(4)); 
	}

}
