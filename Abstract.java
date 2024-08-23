package icarus;

abstract class shape
{

	void numberOfSides()

	{

		

	}

}

class rectangle extends shape

{

	int side;

	rectangle(int side)

	{

		this.side=side;

	}

	

	

	int numberOfSides(int side) 

	{

		return 4;

	}

	

	

	int sumOfAngles(int side) 

	{

		return (side-2)*180;

	}

	

}

class triangle extends shape

{

	int side;

	triangle(int side)

	{

		this.side=side;

	}

	

	

	int numberOfSides(int side) 

	{

		return 3;

	}

	

	

	int sumOfAngles(int side) 

	{

		return (side-2)*180;

	}

	

}





class hexagon extends shape

{

	int side;

	hexagon(int side)

	{

		this.side=side;

	}

	

	

	int numberOfSides(int side) 

	{

		return 4;

	}

	

	

	

	int sumOfAngles(int side) 

	{

		return (side-2)*180;

	}

	

	

}





public class Abstract 

{

	public static void main(String[]args) 

	{

		rectangle rect = new rectangle(4);

		int r1 = rect.side;

		

		

		triangle tri = new triangle(3);

		int t1 = tri.side;

		

		

		hexagon hex = new hexagon(6);

		int h1 = hex.side;

		

		

		System.out.println("The number of sides of a rectangle is: "+r1);

		System.out.println("The sum of angles of a rectangle is: "+rect.sumOfAngles(r1));

		System.out.println("The number of sides of a triangle is: "+t1);

		System.out.println("The sum of angles of a triangle is: "+tri.sumOfAngles(t1));

		System.out.println("The number of sides of a hexagon is: "+h1);

		System.out.println("The sum of angles of a hexagon is: "+hex.sumOfAngles(h1));

	}

}

