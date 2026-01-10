import java.util.*;
public class NumberformException
{
	static int arr[];
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n:");
		int n=sc.nextInt();
		
		try
		{
			String a="123";
			int aa=Integer.parseInt(a);
			System.out.println(aa);
		}
		catch(Exception x)
		{
			System.out.println("the type of the Error is:"+x);
		}
		finally
		{
			System.out.println("Successfully completed the programming flow:");
		}
	}		
}