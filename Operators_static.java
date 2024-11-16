package ab46_Class_5;

public class Operators_static 
{

		static void addition()
		{
			int a=10;
			int b=5;
			int sum=a+b;
			System.out.println("addition result->"+sum);
		}
		
		static void subtraction()
		{
			int a=10;
			int b=20;
			int sub=a-b;
			System.out.println("subtract result->" +sub);
		}
		
		static void multiple()
		{
			int a=5;
			int b=10;
			int multi=a*b;
			System.out.println("multiple result->" +multi);
		}
		static void division()
		{
			int a=10;
			int b=200;
			int div=a/b;
			System.out.println("division result->" +div);
		}
		static void modulus()
		{
			int a=10;
			int b=20;
			int mod=a%b;
			System.out.println("Modulus result->"  +mod);
		}
	  public static void main(String[] args)
	{
		addition();
		subtraction();
		multiple();
		division();
		modulus();
		System.out.println("static methods");
			

		}

	}
