package oPerator;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_1 
{
public static void main(String[] args) 
{
	
		Collection c1= new ArrayList();
		c1.add("Age");
		c1.add("Colour");
		System.out.println(c1);
		c1.add(76);
		c1.add(6.88);
		c1.add(false);
		System.out.println(c1);
		
		
	Collection c2 = new ArrayList();
	c2.addAll(c1);
	c2.add("rice");
	c2.add("Sugar");
	System.out.println(c2); 
		
}

}
