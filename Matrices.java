package icarus;
import java.util.Scanner;
public class Matrices 
{

	public static void main(String[]args) 
{

		int i,j,k,R1,R2,C1,C2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no. of rows of first matrix:");
        R1=sc.nextInt();
        
        System.out.println("Enter the no. of columns of first matrix:");
        C1=sc.nextInt();
        
        System.out.println("Enter the no. of rows of second matrix:");
        R2=sc.nextInt();
        
        System.out.println("Enter the no. of columns of second matrix:");
        C2=sc.nextInt();

        int A[][]= new int[R1][C1];
        int B[][]= new int[R2][C2];
        int C[][]= new int[R1][C2];

        if (C1==R2)

        {

        	System.out.println("Enter the elements of first matrix:");

        	for (i=0;i<R1;i++)
        	{

        		for (j=0;j<C1;j++)
        		{

        			A[i][j]= sc.nextInt();

        		}

        	}

        	System.out.println("Enter the elements of second matrix:");

        	for (i=0;i<R2;i++)

        	{

        		for (j=0;j<C2;j++)

        		{

        			B[i][j]= sc.nextInt();

        		}

        	}
//multiplication

        	for (i=0;i<R1;i++)

        	{

        		for (j=0;j<C1;j++)

        		{

        			for (k=0;k<R2;k++)

        			{

        				C[i][j]+= A[i][k]*B[k][j];

        			}

        		}

        		System.out.println("\n");


        	}

        	System.out.println("Resultant Matrix is:");

        	for (i=0;i<R2;i++)

        	{

        		for (j=0;j<C2;j++)

        		{

        			System.out.print(C[i][j]+" ");

        		}

        		System.out.println(" ");

        	}

        }

        else

        {

        	System.out.println("Matrix Multiplication not possible");

        }

}

}
