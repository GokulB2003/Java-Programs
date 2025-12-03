/*Q2. Employee Payroll System – Multiple Child Classes
Create:
Parent class: Employee
Fields: id, name, baseSalary
 Method: calculateSalary()
Child classes:
Manager:

Allowance = 40% of baseSalary

Bonus = ₹10,000 if teamSize > 10


Developer:


Allowance = 30%


Extra pay = ₹2000 × numberOfProjects


Intern:


Stipend = 50% of baseSalary


Task:
Create an array of 10 employees (mix of all types).


Implement salary calculation using overrides.


Display:


Employee with maximum salary


Count how many employees earn above 60,000.


Concepts Used
Inheritance + overriding


Polymorphism with reference array


Logical operations for filtering and counting
*/
import java.util.*;
class Employee
{
	int id;
	String name;
	double baseSal;
	Employee(int id,String name,double baseSal)
	{
		this.id=id;
		this.name=name;
		this.baseSal=baseSal;	
	}
	
	public double calSalary()
	{
		return baseSal;
	}	
}
class Manager extends Employee
{
	int teamSize;
	Manager(int id,String name,double basSal,int teamSize)
	{	super(id,name,basSal);
		this.teamSize=teamSize;
		
	}
	/*blic double allowance()
	{
		return 0.4*baseSal;
	}*/
	public double calSalary()
	{	int b=0;
		double allo=0.4*baseSal;
		if(teamSize>10)
		{
			 b=10000;
		}
		return b+allo+baseSal;
	}	
} 
class Developer extends Employee
{
	int noOfPro;
	Developer(int id,String name,double basSal,int noOfPro)
	{
		super(id,name,basSal);
		this.noOfPro=noOfPro;
		
	}
	
	public double calSalary()
	{
		double allo=0.3*baseSal;
		int ExtraPay=2000*noOfPro;
		return (allo+ExtraPay+baseSal);
			
	}


}
class Intern extends Employee
{
	Intern(int id,String name,double basSal)
	{
		super(id,name,basSal);
	}
	public double calSalary()
	{
		return 0.5*baseSal;
	}

}
public class EmployeePayrollSystem
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Employee E[]=new Employee[3];
		for(int i=0; i<E.length;i++)
		{
			
			System.out.println("Select the Employee Type:");
			System.out.println("1.Manager");
			System.out.println("2.Developer");
			System.out.println("3.Intern");
			int type=sc.nextInt();

			System.out.println("Enter the id of the Employee:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name of the Employee:");
			String name=sc.nextLine();

			System.out.println("Enter the BasicSalary of the Employee:");
			int basSal=sc.nextInt();

			System.out.println("Enter the no.of projects:");
			int noOfPro=sc.nextInt();

			System.out.println("Enter the Team size:");
			int team=sc.nextInt();
			
			double salary1=0.0;
			double salary2=0.0;
			double salary3=0.0;
			if(type==1)
			{
				E[i]=new Manager(id,name,basSal,team);
				salary1=E[i].calSalary();
				System.out.println("the salary of the Employee:"+name+":"+salary1);
			
			}
			else if(type==2)
			{
				E[i]=new Developer(id,name,basSal,noOfPro);
				salary2=E[i].calSalary();
				System.out.println("the salary of the Employee:"+name+":"+salary2);

			}
			else if(type==3)
			{
				
				E[i]=new Intern(id,name,basSal);
				salary3=E[i].calSalary();
				System.out.println("the salary of the Employee:"+name+":"+salary3);

			}
			else
			{
				System.out.println("Wrong choice:");
			}
			

			
		}
		
		//display Highest Salary
		double maxi=0.0;
		String nameE=" ";
		int id1=0,count=0;
		for(int i=0; i<E.length; i++)
		{
			double s=E[i].calSalary();
			if(s>maxi)
			{
				maxi=s;
				nameE=E[i].name;
				id1=E[i].id;
				
			}
			if(s>60000)
			{
				count++;
			}
		}
		sc.nextLine();
		System.out.println("id"+id1+"\t\t:"+"Name of the Employee is:"+nameE);
		System.out.println("Maximum Salary of the Employee is:"+maxi);
		System.out.println("total no. of Employee whose salary is greater than 60000: "+count);
		
		
	}
	
	
}