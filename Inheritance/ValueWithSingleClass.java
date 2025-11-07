/*Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and we have to create three child classes name as Add with function int getAdd() , Mul with function getMul() and Div with function getDiv() and getAdd() function return addition of two value which is inherited from Value class , getMul() function return multiplication of two values which is inherited from Value class and gitDiv() function return division of two values which Is inherited from Value class.*/

import java.util.*;
class Value
{	
	int a;
	int b;
	public void setValue(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}
class Add extends Value
{
	public int getAdd()
	{
		return a+b;
	}
}
class Mul extends Value
{
	public int getMul()
	{
		return a*b;
	}
}
class Div extends Value
{
	public int getDiv()
	{
		return a/b;
	}
}
public class ValueWithSingleClass
{
	public static void main(String args[])
	{
		 
		
		Add a=new Add();
		a.setValue(100,20);
		int ans=a.getAdd();
		System.out.println("Addition of num is:"+ans);
		Mul m=new Mul();
		m.setValue(15,20); 
		int p=m.getMul();
		System.out.println("Multiplication of num:"+p);
		Div v=new Div();
		v.setValue(100,20);
		int q=v.getDiv();
		System.out.println("DIvision of num is:"+q);
	}
}
