package ab46_programs;
class two //parent class
{
	void add()
	{
		System.out.println("add");
	}
	 void sub()
	{
		System.out.println("sub");
	}		
}
public class Class_15_Single_inheritnce_nonstatic extends two
{
	 void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("div");	
	}
	public static void main(String[] args) 
	{
Class_15_Single_inheritnce_nonstatic C1= new Class_15_Single_inheritnce_nonstatic ();

			C1.mul();
			C1.div();
			C1.add();
			C1.sub();
			
		}

	}



