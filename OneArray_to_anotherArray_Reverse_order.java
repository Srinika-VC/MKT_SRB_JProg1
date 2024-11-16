package all_Array_cons;

import java.util.Arrays;

public class OneArray_to_anotherArray_Reverse_order 
{
public static void main(String[] args) 
	{
		int student[]= {75,65,55,45};
		int Details[]=new int[4];
		
		for(int i=0,k=3;i<student.length;i++,k--)	
		{
			Details[k]=student[i];
		}
		System.out.println(Arrays.toString(student));
		System.out.println(Arrays.toString(Details));

	}

}
