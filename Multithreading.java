
import java.util.*;




class evenNum

{

	int a;

    evenNum(int n) 

    {

    	this.a=n;

    }


    void run(int a) 

    {

    	System.out.println("The Thread is even and square is :"+a*a);  

    }

}


class oddNum

{

	int a;

    oddNum(int n)

    {

    	this.a=n;

     }

  

    void run(int a) 

    {

    	System.out.println("The Thread is odd and cube is :"+a*a*a);

    }

}


class RandomNumGenerator extends Thread

{

	public int l;

    public void run() 

    {

    	int n=0,i;

        Random x=new Random();

        for(i=0;i<l;i++) 

        {

        	n=x.nextInt(100);

            System.out.println("Generated Number is:"+n);

            if(n%2==0)

            {

            	evenNum even=new evenNum(n);

                even.run(n);

            }

            else

            {

            	oddNum odd=new oddNum(n);

                odd.run(n);

             }


          }

       }

}



public class Multithreading 

{

	public static void main(String [] args) 

	{

		System.out.println("Enter the limit:");

        RandomNumGenerator r=new RandomNumGenerator();

        Scanner sc=new Scanner(System.in);

        r.l=sc.nextInt();

        r.start();

     }

}
