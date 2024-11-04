import java.util.Scanner;
public class Float_Multiplication {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        float n1,n2, multi;

        System.out.println("Enter you first number: ");
        n1= sc.nextFloat();

        System.out.println("Enter the Second Number: ");
        n2= sc.nextFloat();

        sc.close();

        multi= n1*n2;

        System.out.println("The multiplication of two numbers are: "+multi);

        
    }

}
