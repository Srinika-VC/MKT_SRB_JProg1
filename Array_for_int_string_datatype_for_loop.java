package all_Array_cons;

import java.util.Arrays;

public class Array_for_int_string_datatype_for_loop
{
public static void main(String[] args) 
	{
	int rollno[]=new int[4];
	rollno[0]=78;
	rollno[1]=7;
	rollno[2]=71;
	rollno[3]=6;
	
	for(int i=0; i<=3;i++)
	{
		System.out.println(rollno[i]);
	}
	String name[]=new String[3];
	name[0]="Ram";
	name[1]="Sri";
	name[2]="Barani";
	
	for(int i=0; i<=2;i++)
	{
		System.out.println(name[i]);
	}
     
	char gender[]=new char[3];
	gender[0]='F';
	gender[1]='M';
	gender[2]='C';
	
	System.out.println(Arrays.toString(gender));
	}

}
