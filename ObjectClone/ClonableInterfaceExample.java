/*Object clone*/
import java.util.*;
class Square implements Cloneable
{
	public int no;
	void setValue(int no)
	{
		this.no=no;
	}
	public int getValue()
	{
		return no;
	}
	/*1. clone() is not accessible

The clone() method belongs to Object

It is protected, so you must override it in your class and make it public*/


	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class ClonableInterfaceExample
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		Square obj1=new Square();
		obj1.setValue(5);
		
		Square obj2=(Square)obj1.clone();
		

		obj2.setValue(10);
		System.out.println(obj2.getValue());
		System.out.println(obj1.getValue());
		
		
		
		
		
	}
}