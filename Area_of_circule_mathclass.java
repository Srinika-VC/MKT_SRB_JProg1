package ab46_programs;

public class Area_of_circule_mathclass 
{
	static final double pivalue=Math.PI;

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		double radius=Math.random();
				//double area=pivalue*radius*radius;
		double area=Math.PI*radius*radius;
		Thread.sleep(1000);
		System.out.println(area);
		

	}

}
