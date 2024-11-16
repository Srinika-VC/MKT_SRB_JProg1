package ab46_programs;

public class ContinalStatement_Nested_if1 
{
public static void main(String[] args)
	{
		char gender1='M';
		char gender2='F';
		int age=10;
		//int age=40'
		//if(gender1=='F')
		if(gender1=='M')
		{
			if(age>12)
			{
				System.out.println("Adult fare");
			}
			else
			{
				System.out.println("Half ticket");	
			}
				
	}
	else
	{
	System.out.println("Free ticket for Female");	
		
	}

	}

}
