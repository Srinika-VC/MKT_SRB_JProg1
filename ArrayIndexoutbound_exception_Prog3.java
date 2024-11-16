package eXception_handling_proglist;

public class ArrayIndexoutbound_exception_Prog3 
{
public static void main(String[] args) 
{
	try
	{
		int[] mynumber= {1,2,3,4,5}; //exception will come 
		
        //int[] mynumber= {1,2,3,4,5,6,7,8,9,0,1};
		//exception will not come, try will executed
	System.out.println(mynumber[10]);
	
	}
	catch(ArrayIndexOutOfBoundsException a1)
	{
		System.out.println("Exception handled");
	}
		

	}

}
