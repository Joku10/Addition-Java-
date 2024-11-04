import java.util.Scanner;



public class Exception_Handling 

{	





  public static void main(String[]args) 

		{

			Scanner sc=new Scanner(System.in);



				System.out.println("Enter");
                System.out.println("1 for Arithmetic exception"); 
                System.out.println("2 for Array Index out of bound exception");
                System.out.println("3 for Exit");


				int ch=sc.nextInt();

 

				do 

				

				{



				switch(ch) 

				

				{



				case 1:



				try 

				

				{



					System.out.println("Program to perform division");



					System.out.println("enter first number");



					int n1=sc.nextInt();



					System.out.println("enter second number");



					int n2=sc.nextInt();



					float n3=n1/n2;



					System.out.println("Result:"+n3);



				}



				catch(ArithmeticException e)

				

				{



					System.out.println(e);



				}



				finally 

				

				{



					System.out.println("Code is safe");



				}



				System.out.println("Enter 1 for Arithmetic exception , 2 for Array Index out of bound exception,3.Exit");



				ch=sc.nextInt();



				break;



				case 2:



				try 

				

				{



					System.out.println("enter the number of elements");



					int n=sc.nextInt();



					int arr[]=new int[n];



					System.out.println("enter elements of the array");



					for(int i=0;i<n;i++) 

					

					{



						arr[i]=sc.nextInt();



					}



					System.out.println("Array elements:");



					for(int i=0;i<n;i++) 

					

					{



						System.out.print(arr[i]+" ");



					}



					System.out.println();



					System.out.println("enter the position of the element");



					int pos=sc.nextInt();



					System.out.println(arr[pos-1]);



				}



				catch(ArrayIndexOutOfBoundsException e) 

				

				{



					System.out.println(e);



				}



				finally 

				

				{



					System.out.println("code is safe");



				}



				System.out.println("enter 1 for Arithmetic exception , 2 for Array Index out of bound exception,3.Exit");



				ch=sc.nextInt();



				break;



				}



				}while(ch==1||ch==2);



				System.out.println("exiting");



				}



	}

