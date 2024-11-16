package iMportant_Array_prog;

import java.util.Arrays;

public class Check_alpha_values 
{
public static void main(String[] args) 
{
	String input ="kv no 2 bangalore";
	//1st convert to tochararray
	char c1[]= input.toCharArray();
	System.out.println(Arrays.toString(c1));

for(int i=0;i<input.length();i++)
{
	boolean b1=Character.isAlphabetic(c1[6]);
	System.out.println(b1);

}
	
}

}
