/* Minimum Size Subarray Sum ≥ S

Problem:
Given a positive integer array arr[] and an integer S, find the minimum length of a contiguous subarray such that its sum ≥ S. Return 0 if no such subarray exists.

Approach / Explanation:
Again sliding window with two pointers:

left = 0, sum = 0, minLen = ∞.

Iterate right from 0 to n - 1, adding arr[right] into sum.

After each addition, while sum ≥ S, try to move left forward (i.e. shrink window) to see if we can get a smaller subarray still satisfying sum ≥ S. Subtract arr[left] and left++.

Each time before shrinking further, update minLen = min(minLen, right - left + 1).

After loop, if minLen remains ∞, return 0, else return minLen.

Example:
arr = [2, 3, 1, 2, 4, 3], S = 7
Possible subarray [4,3] sum 7 length 2 is minimal, so answer = 2.
*/
public class SubArrayWithSumLessThanEk
{
	public static void main(String args[])
	{
		int arr[]={2,3,1,2,4,3};
		int ans=7;
		int i=0,j=0;
		int s=0,e=0,sum=0,length=0,max=Integer.MAX_VALUE;
		while(e<arr.length)
		{
			sum+=arr[e];
			while(sum>=ans)
			{	length=e-s+1;
				if(length<max)
				{
					max=length;
					i=s;
					j=e;
				}
				sum=sum-arr[s];
				s++;
				
				
			}
			
			e++;
		}
		while(i<=j)
		{
			System.out.print(arr[i]);
			i++;
		}
		System.out.println();
		System.out.println(max);
		
	}
}