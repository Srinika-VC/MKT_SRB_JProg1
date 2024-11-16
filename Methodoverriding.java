package oPerator;

class parent
  {
	  void login()
	  {
		System.out.println("Login using email id"); 
	  }
  }
public class Methodoverriding extends parent
{
   void login()
   {
	   System.out.println("Login using mobile no"); 
	   super.login();
   }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Methodoverriding m1 = new Methodoverriding();
		m1.login();
	}

}
