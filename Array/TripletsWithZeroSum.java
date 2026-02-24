/*2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4] 
Output: (-1, 0, 1), (-1, -1, 2)*/

import java.util.*;
public class TripletsWithZeroSum
{
	public static void main(String args[])
	{
		
		int arr[]={-1,0,1,2,-1,-4};
		int sum=0;
		int e=0,f=0,g=0;
		int maxi=Integer.MIN_VALUE;
		int k=3;
		//int j=0;
		for(int i=0; i<k; i++)
		{
			sum+=arr[i];
			
		}
		if(sum==0)
		{
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
		}
		int s=0;
		for(int j=k; j<arr.length; j++)
		{
			sum+=arr[j];
			int l=j-s+1;
			if(l==k)
			{
				if(sum==0)
				{
					sum=sum-arr[j-k+1];
					System.out.println(arr[j-2]+","+arr[j-1]+","+arr[j]);
					
				}
				s++;
				
			}
			
			
		}
		
		
	}
}