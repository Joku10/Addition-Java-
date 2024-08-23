package icarus;

import java.util.Scanner;

class Emp

{

	double grossSalary,salary,DA,HRA;

	void display()

	{

		System.out.println("......Employee......");

	}

	

	void calcSalary() 

	{

		grossSalary = salary+(DA/100)*salary+(HRA/100)*salary;

		System.out.println("The Gross Salary of the Employee is "+grossSalary);

	}

}

class engineer extends Emp

{

	engineer(double salary,double DA,double HRA)

	{

		this.salary= salary;

		this.DA=DA;

		this.HRA=HRA;

	}

	

	

	void display()

	{

		super.display();

		super.calcSalary();

		System.out.println("......Engineer......");

	}

	

	

	

	void calcSalary()

	{

		System.out.println("Salary of the Employee is "+grossSalary*2);

	}

}



public class OverrRidingUsingSuper

{

	

	

	public static void main(String[]args)

	{

		Scanner sc = new Scanner(System.in);

		double salary,DA,HRA;

		System.out.println("Enter the basic amount of salary: ");

		salary= sc.nextInt();

		System.out.println("Enter the DA% of the employee: ");

		DA= sc.nextDouble();

		System.out.println("Enter the HRA% of the employee: ");

		HRA= sc.nextDouble();

		engineer en= new engineer(salary,DA,HRA);

		en.display();

		en.calcSalary();

	}





}
