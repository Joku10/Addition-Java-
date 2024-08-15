package icarus;
import java.util.Scanner;
 class employee
 {
   String name;
   int age;
   String address;
   String ph_no;
   double salary;
   void PrintSalary()
   {
	   System.out.println("salary: "+salary);
   }
 }
class officer extends employee
   {
	  String specialization;
   }
   
   class manager extends employee
   {
	   String department;
   }
   
   public class Inheritance
  {
	   public static void main(String[]args) 
	   {
		   Scanner sc=new Scanner(System.in);
	       officer of=new officer();
	       manager mg=new manager();
	       System.out.print("Enter the name of the officer: ");
	       of.name=sc.next();
	       System.out.print("Enter the age of the officer: ");
	       of.age=sc.nextInt();
	       System.out.println("Enter the address of the officer: ");
	       of.address=sc.next();
	       System.out.print("Enter the phone number of the officer: ");
	       of.ph_no=sc.next();
	       System.out.print("Enter the salary of the officer: ");
	       of.salary=sc.nextDouble();
	       System.out.print("Enter the name of the manager: ");
	       mg.name=sc.next();
	       System.out.print("Enter the age of the manager: ");
	       mg.age=sc.nextInt();
	       System.out.print("Enter the address of the manager: ");
	       mg.address=sc.next();
	       System.out.print("Enter the phone number of the manager: ");
	       mg.ph_no=sc.next();
	       System.out.print("Enter the salary of the manager: ");
	       mg.salary=sc.nextDouble();
     }
   
 }