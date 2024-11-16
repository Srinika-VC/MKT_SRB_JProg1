package cLass_25_all_programs;

import java.util.Date;

public class Program_3 
{	
public static void main(String[] args) 
{
     	Date d1=new Date();
     	long l1=d1.getTime();
     	System.out.println(l1);
     	
     	Date d2=new Date(d1.getTime());
     	System.out.println(d2);
     	
     	String d3=d2.toString();
     	String month=d3.substring(4, 7);
     	System.out.println(month);
     	
     	String year=d3.substring(d3.length()-4); // substring with one para
     	System.out.println(year);
     	
     	String date=d3.substring(8, 10);
     	System.out.println(date);
     	
     	String dateformate=date.concat(month).concat(year);
    	//String dateformate1=date.concat("-").conate(month).concat("-").concat(year).concat("");
    	System.out.println(dateformate);
}

}
