/* Write a java program to find maximum and minimum number in array

[10,30,89,11,23,43]
*/
import java.util.*;
public class MaxiAndMin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elments:");
		int[] arr=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int mini=Integer.MAX_VALUE;//21473648
		int maxi=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<mini)
			{
				mini=arr[i];//10
			}
			else if(arr[i]>maxi)
			{
				maxi=arr[i];//30 
			}
			
			 			
			
		}
		System.out.println("minimum value is:"+mini+"\n");
		System.out.println("Maximum value is:"+maxi);
	}
}