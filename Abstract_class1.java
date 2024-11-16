package abstractclass;

interface Amazon
{
	void login();
	void registration();
	
}
public class Abstract_class1 implements Amazon
{

	public static void main(String[] args) 
	{
		

	}
	@Override
	public void login() 
	{
		System.out.println("Rea;l logic");
	}

	@Override
	public void registration()
	{
	 System.out.println("Rea;l logic");
	}

}
