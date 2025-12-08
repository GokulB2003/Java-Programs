/*Create a class Person with method setDetails(String name, int age).
Create two subclasses:

Student → method getDetails() → prints student's name & age

Teacher → method getDetails() → prints teacher's name & age
Demonstrate runtime polymorphism using Person reference.

*/
import java.util.*;
class Person
{
	String name;
	int age;
	public void setDetails(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void getDetails()
	{
	}
}
class Student extends Person
{
		public void getDetails()
		{
			System.out.println("name"+name);
			System.out.println("age"+age);
		}
		
}
class Teacher extends Person
{
		public void getDetails()
		{
			System.out.println("name"+name);
			System.out.println("age"+age);
		}
}
class TargetClass
{
	public void getDetails(Person p)
	{
		p.getDetails();
	}
}

public class LooseCoupling
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Person p=new Person();
		TargetClass t=new TargetClass();
		Teacher te=new Teacher();
		te.setDetails("gokul",23);
		t.getDetails(te);
		
		Student s=new Student();
		s.setDetails("Raju",23);
		t.getDetails(s);
		
		
		
		
	}
}