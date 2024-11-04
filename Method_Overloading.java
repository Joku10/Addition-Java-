import java.util.*;

class area



{



double CalcArea(double x)



	{

      return 3.14*x*x;

	}



	

float CalcArea(float x,float y)



	{

	  return x*y;

	}



double CalcArea(double x,double y)



	{

		return 0.5*x*y;

	}



}





public class Method_Overloading {



	public static void main(String[]args)



	{  



		Scanner sc = new Scanner(System.in);



		area ar = new area();



		System.out.println("Enter the radius of the circle:");



		double radius = sc.nextDouble();



		double circle= ar.CalcArea(radius);



		System.out.println("Area of the Circle is :"+circle);

		

		

		



		System.out.println("Enter the length of the rectangle:");



		float length =sc.nextFloat();



		System.out.println("Enter the breadth of the rectangle:");



		float breadth =sc.nextFloat();



		float rectangle = ar.CalcArea(length, breadth);



		System.out.println("Area of Rectangle is:"+rectangle);

		

		

		

		



		System.out.println("Enter the baselength of the triangle:");



		double blength =sc.nextDouble();



		System.out.println("Enter the height of the triangle:");



		double height =sc.nextDouble();



		double triangle = ar.CalcArea(blength, height);



		System.out.println("Area of the Triangle is:"+triangle);



		}



	}
