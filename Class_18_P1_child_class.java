package super_this_calling_progList;
class parent_class
{
	void login()
	{
		System.out.println("login with email id");
	}
}
public class Class_18_P1_child_class extends parent_class
{
		void login()
		{
			super.login();
			System.out.println("login with mobile number");
		}

	public static void main(String[] args)
	{
               Class_18_P1_child_class s1= new Class_18_P1_child_class();
				s1.login();
}
	}
