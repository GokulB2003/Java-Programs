import java.util.*;
public class DivideByZeroException
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n:");
		int n=sc.nextInt();
		System.out.println("Factor of number is:");
		for(int i=0; i<=n/2; i++)
		{
			try
			{
				int ans=n%i;
				if(ans==0)
				{
				System.out.println(i);
				}
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			
		}
		
	}
}