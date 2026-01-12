/*    Q2. Write a java program to print 1 to nth Strong number. */
import java.util.*;
public class Q2
{
	public static void main(String args[])
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<n)
		{
			int temp=i,sum=0;
			while(temp!=0)
			{
				int rem=temp%10;
				int fact=1;
				while(rem!=0)
				{
					fact=fact*rem;//cal factorial
					rem--;
					
				}
				sum+=fact;
				temp=temp/10;//divide number
			}
			if(sum==i)
			{
				System.out.print(i+" "); //print number	
			}
			i++;
		}
	}
}