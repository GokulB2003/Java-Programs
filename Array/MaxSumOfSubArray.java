/*Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1, -3, 4, -1,  2,  1,   -5.  ,4]  
//[1,2,3,5,2,6]
Output: 6.  (from subarray [4,-1,2,1])
*/
import java.util.*;
public class MaxSumOfSubArray
{
	public static void main(String args[])
	{
		
		int arr[]={-2,1,-3,4,-1,2,1,-5,4};
		int sum=0;
		int maxi=Integer.MIN_VALUE;	
		for(int i=0; i<arr.length; i++)//
		{
			sum+=arr[i];//4 5 6 
			if(sum>maxi)
			{
				maxi=sum;//6
			}
			if(sum<0)
			{
				sum=0;//0
			}
		}
		System.out.println(maxi);
	}
}