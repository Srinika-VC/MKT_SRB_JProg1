package all_Array_cons;

import java.util.Arrays;

public class Array_one_another_coppy_diff_logics
{
public static void main(String[] args) 
	{
		int a[]={10,20,30,40};
		int b[]=new int[4];
		
		for(int i=0;i<a.length;i++)
		{
			b[(a.length-1)-i]=a[i];
			
		}
	System.out.println(Arrays.toString(a));	
	System.out.println(Arrays.toString(b));
	}

}
