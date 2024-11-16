package ab46_programs;

import java.util.Scanner;

public class CondtionalStatement_if_else 
{
public static void main(String[] args) {
	
	Scanner s1=new Scanner(System.in);
	int ageofperson=s1.nextInt();
	
	//int age=10; for this we can use scanner class 
    if (ageofperson>=18)
    {
    	System.out.println("your age is eligibal");
    }
    else
    {
    	System.out.println("your age is eligibal");
    }
    s1.close();
}

}
