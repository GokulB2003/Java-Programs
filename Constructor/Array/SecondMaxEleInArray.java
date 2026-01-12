/*write a Java program to find the Second Maximum element in Array
Input:[10,2,3,50,70,23];
output:50
*/

import java.util.*;
public class SecondMaxEleInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value in the Array:");
		int arr[]=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int smax=Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];	
			}
			else if(arr[i]>smax && arr[i]!=max)
			{
				smax=arr[i];
			}
			else
			{
			}

			
		}
		System.out.println("The second max value is the:"+smax);
		
	}
}