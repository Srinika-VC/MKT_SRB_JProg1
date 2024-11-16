package cLass_28_Prog_list;

import java.util.HashMap;
import java.util.Map;

public class Map_interface3 
{
	public static void main(String[] args) 
	{
		Map<String,Integer>m1=new HashMap<String,Integer>();
		//employee name and salary
		m1.put("Sri", 8532);
		m1.put("nika", 9999);
		m1.put("manish", 99878);
		m1.put("kumar", 59045);
		m1.put("tiwari", 7469);
		//System.out.println(m1.keySet());
		

		m1.replace("nika", 9999);
		System.out.println(m1);
		m1.replace("manish", 99878, 1000);
		System.out.println(m1);
		
		
		m1.remove("kumar");
		System.out.println(m1);
		m1.remove("tiwari", 7469);
		System.out.println(m1);
		
		
	}

}
