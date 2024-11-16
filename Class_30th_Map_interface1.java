package cLass_28_Prog_list;

import java.util.HashMap;
import java.util.Map;

public class Class_30th_Map_interface1
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
	
	System.out.println(m1);
	
	Map<String,Integer>m2=new HashMap<String,Integer>();
	//employee name and salary
	m2.put("ramesh", 8532);
	m2.putAll(m1);
	System.out.println(m2);
	
	
	boolean b1=m1.isEmpty();
	System.out.println(b1);
	
	/*m1.clear();
	System.out.println(m1);
	
	boolean b2=m1.isEmpty();
	System.out.println(b2);*/
	
	

	}

}
