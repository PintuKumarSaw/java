package sampleapplication;
import java.util.Random;

public class random{
	public static void main(String args[]) {
		 
		Random r = new Random();
		System.out.println(r.nextInt()); //  any random number output
		System.out.println(r.nextInt(10));// under 10 coming out 
		System.out.println(r.nextInt(10,20));// number b/w 10 and 20
		System.out.println(r.nextInt(100,999));// number b/w  coming output 100 and 300
		System.out.println(r.nextInt(1000,9999));
		
	}

	

}