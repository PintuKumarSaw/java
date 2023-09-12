package sampleapplication;
import java.util.Scanner;

public class Switch_08 {
	public static void main (String args[]) {
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		switch(n) {
		case 1:
			System.out.println();
			break;
		case 2:
			System.out.println("Sunday");
			break;
		case 3:
			System.out.println("Monday");
			break;
		case 4:
			System.out.println("Tuesday");
			break;
		
		case 5:
			System.out.println("Wed");
			break;
		case 6:
			System.out.println("Thr");
			break;
		case 7:
			System.out.println("Frd");
			break;
		default:
			System.out.println("Sat");
			break;
		    
	}
	}
}


