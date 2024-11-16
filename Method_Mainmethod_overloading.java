package ab46_Class_5;

public class Method_Mainmethod_overloading
{

	public static void main(String[] args)
	{
		System.out.println("Main method");
		main();
		main("srini", 'F');
	}
	public static void main()
	{
		System.out.println("Main method with no argumnetts");
	}
	public static void main(String name,char gender)
	{
		System.out.println("Main method with argumanets as string and gender");
	}

}
