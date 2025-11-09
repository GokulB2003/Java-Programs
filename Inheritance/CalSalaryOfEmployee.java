/* Create a base class Employee with fields name and salary. Create subclasses Manager and Developer.
Manager gets a 20% bonus on salary.


Developer gets a 10% bonus.
 Write a program to calculate and display the total salary (base + bonus) for each employee.
Explanation:
 This tests how to use inheritance to share fields/methods and override logic for bonus calculations.
*/
import java.util.*;
class Employee
{
	String name;
	int salary;
	void setValue(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	
}
class Manager extends Employee
{
	double total=0.0;
	public void bonusCal()
	{
		total=salary*20/100;
	}
	public void display()
	{
		System.out.println(name+":Salary of the Employee after adding 10% salary:"+total);
	}
}
class Developer extends Employee
{
	double total=0.0;
	public void bonusCal()
	{
		total=salary*20/100;
	}
	public void display()
	{
		System.out.println(name+":Salary of the Developer after adding 20% salary:"+total);
	}

	
}
public class CalSalaryOfEmployee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Developer d=new Developer();
		d.setValue("Raju",20000);
		d.bonusCal();
		d.display();

		Manager m=new Manager();
		m.setValue("Rakesh",300000);
		m.bonusCal();
		m.display();
	}
}