package icarus;

import java.util.Scanner;

public class Frequency {
	public static void main(String[]args) {
	    int i,count = 0;
		Scanner sc = new Scanner(System.in);
		String word;
		System.out.println("Enter the String: ");
		word = sc.nextLine();
		//rd = word.toLowerCase();
		System.out.println("Enter the Element: ");
		char elt = sc.nextLine().charAt(0);
		int l = word.length();
		//ar[]b= word.toCharArray();
		for(i=0;i<l;i++) {
			if( word.charAt(i)== elt)
				count++;
			
			
		}
		if(count>=1)
			System.out.println("Frequency of Character is "+count);
		else
			System.out.println("Character not found");

	}
}
