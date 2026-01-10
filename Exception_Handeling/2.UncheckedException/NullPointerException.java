import java.util.*;
public class NullPointerException
{
	static int arr[];
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n:");
		int n=sc.nextInt();
		
		try
		{
			 arr[0]=n;
			System.out.println("the value at Index 0 is:"+arr[0]);
			
		}
		catch(Exception e)
		{	
			System.out.println(e);
			int newArr[]=new int[5];
			newArr[0]=n;
			System.out.println("the value at the first Index is:"+newArr[0]);

		}
		finally
		{
			System.out.println("program execution completed successful");
			
		}
		
		
	}
}