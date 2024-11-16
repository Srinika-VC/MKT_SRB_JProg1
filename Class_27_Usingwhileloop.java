package cLass_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Class_27_Usingwhileloop
{
public static void main(String[] args) 
	{
		List l1=new ArrayList();
		l1.add(76);
		l1.add(7);
		l1.add(6);
		l1.add(760); // all add from list inteface 
		l1.add(706);
		l1.add(607);
		l1.add(67);
		
		//it will accept null
		//indexing
		//order of insertion
		//Duplicates-yes
		Collections.sort(l1);
		System.out.println(l1);
		
	Iterator i1= l1.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
		
	}}
