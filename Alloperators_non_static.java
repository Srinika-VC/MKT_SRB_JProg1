package ab46_programs_assngmnts;

public class Alloperators_non_static 
{
	void addition()
	{
		int a=10;
		int b=5;
		int sum=a+b;
		System.out.println("addition result->"+sum);
	}
	
	void subtraction()
	{
		int a=10;
		int b=20;
		int sub=a-b;
		System.out.println("subtract result->" +sub);
	}
	
	void multiple()
	{
		int a=5;
		int b=10;
		int multi=a*b;
		System.out.println("multiple result->" +multi);
	}
	void division()
	{
		int a=10;
		int b=200;
		int div=a/b;
		System.out.println("division result->" +div);
	}
	void modulus()
	{
		int a=10;
		int b=20;
		int mod=a%b;
		System.out.println("Modulus result->"  +mod);
	}
  public static void main(String[] args)
{
	Alloperators_non_static Op=new Alloperators_non_static();
	Op.addition();
	Op.subtraction();
	Op.multiple();
	Op.division();
	Op.modulus();
		

	}

}
