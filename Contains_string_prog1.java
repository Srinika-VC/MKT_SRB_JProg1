package strin_funpack;

public class Contains_string_prog1 
{
public static void main(String[] args) 
	{
		String input="Manish Kumar Tiwari";
		boolean b1=input.contains(input);
		System.out.println(b1);
		
		
		boolean b2=input.contains("Tiwari");
		System.out.println(b2);
		
		boolean b3=input.contains("tiwari");
		System.out.println(b3);
		
		boolean b4=input.equals("manish");
		System.out.println(b4);
		
		
		
		

	}

}
