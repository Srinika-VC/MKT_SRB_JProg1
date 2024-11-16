package strin_funpack;

public class Reverse_String {

	public static void main(String[] args) 
	{ 
		String input="abcd";
		String output="";
		
		for(int i=3; i>=0;i--)
		{
			char c1= input.charAt(i);
			output=output+c1;
		}
		System.out.println(output);
		//input.charAt(3);
		//input.charAt(2);
		//input.charAt(1);
		//input.charAt(0);
	
	}

}
