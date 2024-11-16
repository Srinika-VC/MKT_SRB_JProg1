package ab46_Class_5;

public class Constructor_overloading 
{
	Constructor_overloading()
	{
		System.out.println("1st");
	}
	Constructor_overloading(int a)
	{
		System.out.println("2st");
	}
	Constructor_overloading(int a,int b )
	{
		System.out.println("3st");
	}
	public static void main(String[] args)
	{
		//Constructor_overloading c1=new Constructor_overloading();
		
		new Constructor_overloading();
		new Constructor_overloading(500);
		new Constructor_overloading(500, 1000);
	}

}
