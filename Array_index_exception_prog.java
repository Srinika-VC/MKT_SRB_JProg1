package all_Array_cons;

public class Array_index_exception_prog 
{

	public static void main(String[] args) 
	{
		int rollno[]=new int[4];
		rollno[0]=78;
		rollno[1]=7;
		rollno[2]=71;
		rollno[3]=6;
		
		for(int i=0; i<=5;i++)
		{
			System.out.println(rollno[i]);
		}
		
		String name[]=new String[4];
		name[0]="Ram";
		name[1]="Sri";
		name[2]="Barani";
		name[3]="Tiwari";
		
		for(int i=0; i<=5;i++)
		{
			System.out.println(name[i]);
		}

	}

}
