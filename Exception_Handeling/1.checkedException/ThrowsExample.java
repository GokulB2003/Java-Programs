/*throws*/
import java.util.*;
class Div
{
	int a;
	int b;
	public void setValue(int a,int b)throws ArithmeticException,ClassNotFoundException
	{
		System.out.println(a);
	}
	
	
}
public class ThrowsExample
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of B:");
		int b=sc.nextInt();
		try
		{
			Div obj=new Div();
			obj.setValue(a,b);
		}
		catch(Exception e)
		{
			System.out.println("Exception...."+e);
		}
		
	}
}