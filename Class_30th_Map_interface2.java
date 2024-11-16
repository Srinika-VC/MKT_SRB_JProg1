package cLass_28_Prog_list;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Class_30th_Map_interface2
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
	
	for(String s1:    m1.keySet())
	{
		System.out.println(s1);
	}
	//System.out.println(m1.values());
	
	for	(Integer i1: m1.values())
	{
		System.out.println(i1);
	}
	//System.out.println(m1.entrySet());
	
	for	(Entry<String, Integer> i2:   m1.entrySet())
	{
		System.out.println(i2);
	}
	System.out.println("key an values u can print ");
	Iterator<Entry <String, Integer>> i3= m1.entrySet().iterator();
	while (i3.hasNext())
		{
		System.out.println(i3.next());
		}
	}}
