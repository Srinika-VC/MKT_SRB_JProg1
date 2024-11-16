package cLass_26;

import java.util.ArrayList;
import java.util.Collection;

public class Class26_PGRAMS_1 
{
public static void main(String[] args)
	{
		Collection c1= new ArrayList();
			c1.add(45);
			c1.add("Manish");
			c1.add(171);
			c1.add(6.8);
			c1.add(true);
			c1.add('c');
			System.out.println(c1);
			
			Collection c2= new ArrayList();
					c2.addAll(c1);
					c2.add(123);
					System.out.println(c2);
					
					
				boolean b1=		c1.equals(c2);		
				System.out.println(b1);
				
		boolean b2=	c1.contains("Manish");	
					System.out.println(b2);
			boolean b3=		c2.containsAll(c1);
					System.out.println(b3);
					
			//	c1.clear();
				System.out.println(c1);
				System.out.println(c2);
				boolean b5=	c1.isEmpty();
				System.out.println(b5);
				
				c1.remove("Manish");
				System.out.println("teh new c1 is-> "+c1);
				c2.removeAll(c1);
				System.out.println("the new c2 is -> "+c2);
				
			//indexing->TRUE
			//Order of insertion=true	
	}}
