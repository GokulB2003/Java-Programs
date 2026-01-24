/*Happy Number*/
import java.util.*;
public class HappyNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of n:");
		int n=sc.nextInt();

		if(isHappy(n))
		{
			System.out.println("Happy number");
		}
		else
		{
			System.out.println("Not a Happy number:");
		}
	}
	public static boolean isHappy(int n)
	{
		while(n!=1 && n!=4)
		{
			n=calSqr(n);
			if(n==1)
			{
				return true;
			}
		}
		return false;
	}
	public static int calSqr(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum+=rem*rem;
			n=n/10;
		}
		return sum;
	}
}