package ab46_Class_5;

public class Method_over_loading 
{
	static void Addition(double a, double b)
	{
	  double sum=a+b;
	  System.out.println(sum);
	}
	
	static void Addition(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	static void Addition(int b, double a)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	
	/*static void Addition(double a, int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}*/
public static void main(String[] args) 
	{
		Addition(32,64);
		Addition(6.96,9.98);
		Addition(78, 63.254);
	   //Addition(5.34,64);
		}

}
