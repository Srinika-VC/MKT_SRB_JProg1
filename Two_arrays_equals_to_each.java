package all_Array_cons;

import java.util.Arrays;

public class Two_arrays_equals_to_each 
{
public static void main(String[] args) 
	{
	int no1[]=new int[4];
	no1[0]=70;
	no1[1]=20;
	no1[2]=40;
	no1[3]=30;
	
	int no2[]=new int[4];
	
	boolean b1= Arrays.equals(no1, no2);
	System.out.println(b1);
	for(int i=0;i<4;i++)
	 if(b1==true)
	 {
		 System.out.println("Arrays are equals to each other");
	 }
	 else
	 {
		 System.out.println("Arrays are not equals to each other");	 
	 }
	
	}

}
