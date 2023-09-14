package sampleapplication;

public class Array {
	public static void main (String args[]) {
		int arr []= {12,14,8,9,34,81} ;
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			if(arr[i]%2==0) {
				System.out.println("Number  is Even "+arr[i]);
			}
			else {
				System.out.println("Number  is odd "+arr[i]);
				
			}
		}

		System.out.println("This is a array");
		
	}

}
