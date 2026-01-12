/*Maximum Sum Subarray of Size K
Find the maximum sum of a subarray with size k.*/
import java.util.*;
public class MaxSumSubArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int arr[]={1,13,3,4,5,6};
		int k=2;
		int maxi=Integer.MIN_VALUE;
		for(int i=0; i<k; i++)
		{
			sum+=arr[i];
			if(sum>maxi)
			maxi=sum;
			
		}
		for(int i=k; i<arr.length; i++)
		{
			
						//sum+=arr[i];
			sum+=arr[i]-arr[i-k];
			if(sum>maxi)
			{
				maxi=sum;
			}
			
		}
		System.out.println(maxi);
	}
}