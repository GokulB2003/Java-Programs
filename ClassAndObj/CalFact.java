/*1. Write program to create class name as Factorial with two functions
       void setValue(int x): this function accept number as parameter
      int getFactorial(): this function can calculate factorial of number and return it.
*/
import java.util.*;
class Factorial
{	int x;
	void setValue(int value)
	{
		this.x=value;
	}	
	int getFactorial()
	{
		int fact=1;
		//5*4*3
		while(x!=0)
		{
			fact=fact*x;
			x--;
		}
		return fact;
	}
}
public class CalFact
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Factorial obj=new Factorial();
		obj.setValue(5);
		int ans=obj.getFactorial();
		System.out.println(ans);
		
	}
}