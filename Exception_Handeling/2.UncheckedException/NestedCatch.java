/*Nested catch*/
import java.util.*;
public class NestedCatch
{
	public static void main(String args[])
	{
		try
		{
				
			System.out.println("try block");//
			int c=2/0;	
		}
		catch(ArithmeticException a)
		{	
			
			System.out.println(a.getMessage());
			try
			{
				int c=8/0;
			}
			catch(ArithmeticException ar)
			{
				System.out.println(ar.toString());//get Exception Name
			}
		}
	}
}