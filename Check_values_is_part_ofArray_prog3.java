package all_Array_cons;

public class Check_values_is_part_ofArray_prog3 
{
public static void main(String[] args)
	{
	int students1[]=new int[4];
	students1[0]=74;
	students1[1]=96;
	students1[2]=70;
	students1[3]=72;
	
	int notocheck=34;
	//for(int i=0;i<4;i++)
	for(int i=0;i<students1.length;i++)
	{
		if(notocheck==students1[i])
		{
			System.out.println(notocheck +" is a part of array at the index position" + i);
		}
		else
		{
			System.out.println("the given number is not a part of array at the index position" + i);
		}
		
	}}}
