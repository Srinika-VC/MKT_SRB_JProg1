package ab46_Class_5;

public class Method_over_loading_nonstaticwith_static 
{
	static void Addition(double a, double b)
	{
		double sum=a+b;
		System.out.println(sum);
		
	}
	void Addition(int a, int b)
	{
	 int sum=a+b;
	 System.out.println(sum);
	 
	}
public static void main(String[] args) 
	{
        Method_over_loading M1= new Method_over_loading();
		M1.Addition(100, 200);
		Addition(6.25, 5.765);
		
	}

}
