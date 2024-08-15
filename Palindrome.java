package icarus;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.println("Enter the String: ");
		int flag =0;
		word = sc.nextLine();
		word = word.toLowerCase();
		int l = word.length();
		char[]b= word.toCharArray();
		for(int i=0;i<l;i++) {
			if( word.charAt(i)== word.charAt(l-i-1))
				flag =1;
			else
				flag=0;
				break;
			
		}
		if(flag ==1)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		

	}
}
