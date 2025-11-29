/*
5. Two-Sum in Sorted Array (two pointers)

Problem:
Given a sorted array arr[] and a target T, find whether there exists a pair i < j such that arr[i] + arr[j] = T. Return their indices or a boolean.

Approach / Explanation:
Use two pointers:

left = 0, right = n - 1.

While left < right:
 - If arr[left] + arr[right] == T, answer found.
 - If sum < T, move left++ (to increase sum).
 - If sum > T, move right-- (to decrease sum).

If no such pair, return false / [-1, -1].

Example:
arr = [1, 2, 3, 4, 6], T = 6 → pairs: (2,4) or (1,5?)  
Actually 2 + 4 = 6 → return indices (1, 3)
*/
public class TwoSum
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,6};
		int target=6;
		int sum=0,e=arr.length-1,s=0;
		while(s<e)
		{
			sum=arr[s]+arr[e];
			if(sum==target)
			{
				System.out.println(arr[s]);
				System.out.println(arr[e]);
				s++;
				e--;
			}
			else if(sum>target)
			{
				e--;
			}
			else
			{
				s++;
			}
			
		}
	}

}
