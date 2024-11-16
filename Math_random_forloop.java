package ab46_programs;

public class Math_random_forloop {

	public static void main(String[] args) throws InterruptedException 
	{
		for (int i=1; i<10; i++)
		{
			System.out.println(Math.random());
			Thread.sleep(1000);
		}
		//double pivalue=Math.PI;
 //System.out.println(pivalue);
	}

}
