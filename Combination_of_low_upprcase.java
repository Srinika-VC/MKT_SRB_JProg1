package strin_funpack;

public class Combination_of_low_upprcase 
{
public static void main(String[] args)

	{
		String input="Manish Kumar Tiwari";
		String input1=input.toLowerCase();
		System.out.println(input1);

		
		boolean b1=input1.contains("tiwari");
		System.out.println(b1);
		
		boolean b2=input1.equals("kumar");
		System.out.println(b2);
		
		boolean b3=input1.contains("kumar");
		System.out.println(b3);
		

	}

}
