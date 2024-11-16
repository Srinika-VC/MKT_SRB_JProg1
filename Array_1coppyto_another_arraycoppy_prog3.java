package all_Array_cons;

import java.util.Arrays;

public class Array_1coppyto_another_arraycoppy_prog3 
{
public static void main(String[] args)
	{
		int first[]= {10,20,30,40};
		int second[]=new int[4];
		
		for(int i=0,k=second.length-1;i<first.length;i++,k--)	
		{
			second[k]=first[i];
		}
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));
	}

}
