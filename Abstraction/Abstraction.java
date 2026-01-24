import java.util.*;
abstract class Employee
{
	int a,b;
	Employee(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	abstract int ADD();
	int mul()
	{	
		return a*b;
	}
}
class ABC extends Employee
{
	ABC(int a,int b)
	{
		super(a,b);
	}
	int ADD()
	{
		return a+b;
	}
}
public class Abstraction
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			Employee e=new ABC(10,20);
			int result=e.mul();
			System.out.println("multiplication"+result);
			e=new ABC(10,20);
			int ans=e.ADD();
			System.out.println(ans);
		
		
	}
}