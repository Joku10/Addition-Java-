package icarus;
import java.util.Scanner;
public class Addition {
	public static void main(String[]args) {
		int a,b,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		a = sc.nextInt();
		System.out.println("Enter the Second number: ");
		b = sc.nextInt();
		sum = a+b;
		System.out.println("The sum is "+sum);
	}

}

