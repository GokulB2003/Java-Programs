/*1. Longest Subarray with Sum ≤ K (non-negative numbers)

Problem:
Given a non‑negative integer array arr[] and an integer K, find the length of the longest contiguous subarray whose sum is ≤ K.

Approach / Explanation:
Because the array has non-negative values, adding more elements increases the sum (it doesn’t go negative). Use a variable-size sliding window:

Maintain two pointers left = 0, right = 0, and a running sum = 0.

Expand right (i.e. include arr[right]) and add to sum.

While sum > K and left ≤ right, shrink from the left: subtract arr[left], increment left.

At each step, if sum ≤ K, consider updating the maximum window length: maxLen = max(maxLen, right - left + 1).

Continue until right traverses whole array.

Example:
arr = [1, 2, 1, 0, 1, 1, 0], K = 4

We can pick subarray [1,2,1,0] (sum 4) length 4, or [0,1,1,0,1] (sum 3) length 5, etc.
The answer would be 5 (subarray [1,0,1,1,0] or similar).
*/
import java.util.*;
public class LongestSubarrayWithSumLessThanOrEqual
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,1,0,1,1,0};
		int l=0,r=0,length=0,max=0,i=0,j=0,sum=0,k=4;
		while(r<arr.length)
		{
			sum+=arr[r];
			if(sum<=k)
			{
				length=(r-l)+1;
				if(length>max)
				{
					max=length;
					i=l;
					j=r;
					
				}
				
			}
			if(sum>k)
			{
				sum=sum-arr[l];
				l++;
			}
			r++;
		}
		System.out.println("the LongestSubarray WithSumLess Than Or Equal:"+max);
		System.out.println("the window is:");
		while(i<=j)
		{
			System.out.println(arr[i]+" ");
			i++;
		}
	}

}