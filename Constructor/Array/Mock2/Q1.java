/* Q1. Task: For a number n, calculate: 
   Sum of digits at even places (from right) 
   Sum of digits at odd places (from right) 
   Finally print the difference of these sums. 
   Example: n = 572631 → even places sum = 7+6+1 = 14,  
odd places sum = 5+2+3 = 10 → difference = 4.
*/
import java.util.*;
public class Q1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	//used for takes input Scanner class

		System.out.println("ENter the value of n:");
		int n=sc.nextInt();
		int i=2,evensum=0,odds=0;		//Initialize variables
		
		while(n!=0)
		{
			int rem=n%10;
			if(i%2==0)
			{
				evensum+=rem;		//add even places digit
			}
			else
			{
				odds+=rem;		//add odd places didgit
			}
			i++;
			n=n/10;
		}
		int total=evensum-odds;
		System.out.print("sum is="+total);	//print total
	}
}
