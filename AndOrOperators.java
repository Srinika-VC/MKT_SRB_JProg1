package oPerator;

public class  AndOrOperators 
{
public static void main(String[] args) 
{
     int a=10;
     int b=20;
	 if(a==10 || b==a)//c1=true || c2=false
	{
		System.out.println("Learning Or operator");
	}
 
    if(a==10 && b==20)//c1=true && c2=true
    {
    	System.out.println("Learning And operator");
    }

    
    if(a==10 && b==a)//c1=true && c2=false so o/p will not come 
    {
    	System.out.println("Learning And operator");
    }
    else
    {
    	System.out.println("Or and else only exicuted nowS");
    }
    
    if(!(a==10 && b==a))//c1=true && c2=false =false,so not is reverse your answers(true)
    {
    	System.out.println("Learning NOT operator");
    }
  //BODMAS rule (division,multiplication,addition,subtraction)
    
    if(!(a==10 || b==a))//c1=true || c2=false = true so not is reverse your answers (False)
    {
    	System.out.println("Learning NOT operator");
    }
}
}


