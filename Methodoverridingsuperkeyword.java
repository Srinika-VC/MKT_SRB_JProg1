package oPerator;

class parent1
  {
	  void login()
	  {
		System.out.println("Login using email id"); 
	  }
  }
public class Methodoverridingsuperkeyword extends parent
{
   void login()
   {
	   System.out.println("Login using mobile no"); 
	   super.login();
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverridingsuperkeyword m1 = new Methodoverridingsuperkeyword();
		m1.login();

	}

}
