package icarus;

import java.util.Scanner;

public class Factorial {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int i,n,fact =1;
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		for (i=0;i<n;i++) {
			fact += fact*i;
			}
		System.out.println("The Factorial is "+fact);

	}
}