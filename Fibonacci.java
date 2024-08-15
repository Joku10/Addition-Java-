





package icarus;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int i=0,f1=0,f2=1,f3,n;
		System.out.println("Enter the number of terms: ");
		n = sc.nextInt();
		System.out.print(f1+" ");
		System.out.print(f2+" ");
		for (i=0;i<n-2;i++) {
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
			System.out.print(f3+" ");
		}
	}

}
