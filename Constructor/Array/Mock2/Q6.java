/*Q6. Write a java program to Check If a Number Is a Spy Number or Not spy number using function 
recursion. */
//square sum=
//product sum
//if they ===
import java.util.*;
public class Q6
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	//used for takes input Scanner class

		System.out.println("ENter the value of n:");
		int n=sc.nextInt();
		int sum=0,p=1;
		
		int temp=n;
	
		while(temp!=0)
		{	int rem=temp%10;
			p=p*rem;
			temp=temp/10;

		}
		boolean abc=check(n,sum,p);
		//System.out.print(abc);
		if(abc==true)
		{
			System.out.print("true");
		}
		else
		{
			System.out.print("false");
		}
		
	}
	public static boolean check(int n,int sum,int p)	//created a recursion function...
	{
		if(n!=0)
		{
			int rem=n%10;
			sum+=rem*rem;
			//p=p*rem;
			n=n/10;
			//check(n/10,sum,p);	
		}
		if(sum==p)
		{
			return true;
		}
		else
		return false;						//if not found
			
		
	}
	
}