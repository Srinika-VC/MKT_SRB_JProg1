package ab46_programs;
class one //parent class
{
	static void add()
	{
		System.out.println("add");
	}
	static void sub()
	{
		System.out.println("sub");
	}	
	
}
public class Class_15_Single_inheritance_prog1 extends one //child class
{
	static void mul()
	{
		System.out.println("mul");
	}
	static void div()
	{
		System.out.println("div");	
	}
public static void main(String[] args) 
{
	mul();
	div();
	add();
	sub();
	
}

}
