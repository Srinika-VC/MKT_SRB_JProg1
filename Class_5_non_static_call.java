package ab46_Class_5;

public class Class_5_non_static_call
{
  void addition()
  {
	  System.out.println("adding 2 number");
  }
	public static void main(String[] args) 
	{
	System.out.println("My main method");
	 Class_5_non_static_call C1= new  Class_5_non_static_call();
	 C1.addition();

	}

}
