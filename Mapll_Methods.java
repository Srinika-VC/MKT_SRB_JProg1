package oPerator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mapll_Methods {

	public static void main(String[] args) {
	Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Mohan", 93);
		m1.put("Sham", 85);
		m1.put("Vinod", 74);
		m1.put("Hari",90);
		System.out.println(m1);
		
Map<String,Integer> m2=new HashMap<String,Integer>();
	m2.put("Swati",85);
	m2.put("Pradeep", 86);
	m2.put("Priya", 87);
	m2.put("Anusha", 880);
	
	
	Set<String> s1= m2.keySet();
	
	}

}
