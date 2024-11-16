package stringbuffbuild;

public class string_prog1 
{
public static void main(String[] args)
	{
	
	StringBuffer s = new StringBuffer ("Bangalore");
	        s.append(" city");
	        System.out.println(s);
			System.out.println(s.insert(9, " is a "));
			
			StringBuffer s2= new StringBuffer ("Manish Tiwari");
			System.out.println(s2.delete(0, 6));
			}
}
