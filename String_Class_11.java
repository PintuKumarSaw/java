package sampleapplication;

public class String_Class_11 {
	public static void main(String args[]) {
		String s =new String ("hello"); // first type 
		String s1= "Ranchi";			// second type
		String s2 ="ranchi";
		System.out.println(s.length());// 5
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		System.out.println(s1.toUpperCase()); 
		System.out.println(s1.toLowerCase());
		System.out.println(s2.replace("ranchi","kokar")); //"kokar"
		System.out.println(s1.indexOf("i"));
		System.out.println(s2.charAt(2));
	}
	

}
