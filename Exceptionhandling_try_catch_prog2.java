package eXception_handling_proglist;

public class Exceptionhandling_try_catch_prog2
{
public static void main(String[] args) 
	{
  try 
	{
	 int c=1/0;
	 System.out.println(c);
	}
   catch(ArithmeticException a1)
   {
  System.out.println("I have handled the exception ");	
    }
	}

}
