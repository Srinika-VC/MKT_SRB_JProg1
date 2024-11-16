package sCannerClass_class11;

public class StringFunction 
{ 	
  public static void main(String[] args) 
  {
		String a1="Manish"; // replace 'M' to 'Z'
		System.out.println(a1.replace("M", "Z"));
		
		String a2= "Manish Kumar Tiwari"; //Remove all space
		System.out.println(a2.replaceAll(" ", ""));
		
		String a3= "AVInash Yadav"; //Remove capitals
		System.out.println(a3.replaceAll("[A-Z]", ""));
		
		String a4= "AVInash Yadav"; //Remove lower case
		System.out.println(a4.replaceAll("[a-z]", ""));
		
		String a5= "KV no 123456 Bangalore"; //Remove numeric
		System.out.println(a5.replaceAll("[0-9]", ""));
		
		
		

	}

}
