/*7. Trapping Rain Water (Two-pointer)

Problem:
Given height[], compute how much water can be trapped between the bars after raining.

Approach / Explanation (two-pointer variant):
Instead of using stack or preprocessing arrays, there is the two-pointer approach:

left = 0, right = n - 1.

Maintain leftMax = 0, rightMax = 0, and water = 0.

While left < right:
  - If height[left] < height[right]:
   - If height[left] ≥ leftMax, update leftMax = height[left].
   - Else, water += leftMax - height[left].
   - left++.
  - Else:
   - If height[right] ≥ rightMax, update rightMax = height[right].
   - Else, water += rightMax - height[right].
   - right--.

At end, water holds total trapped.


Example:
height = [0,1,0,2,1,0,1,3,2,1,2,1]
Trapped = 6

*/
import java.util.*;
public class TrappingRainWater
{
	public static int leftMaxRightMax(int arr[],int s,int e)
	{
		int maxi=Integer.MIN_VALUE;
		for(int i=s; i<=e; i++)
		{
			if(arr[i]>maxi)
			{
				maxi=arr[i];
			}
			
		}
		return maxi;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
		int sum=0,s=0,mini=0;
		for(int i=0; i<arr.length; i++)
		{
			if(i!=0 && i!=arr.length-1)
			{
			int leftMax=leftMaxRightMax(arr,0,i);
			int rightMax=leftMaxRightMax(arr,i+1,arr.length-1);
			
			if(leftMax<rightMax)
			{
				mini=leftMax;
			}
			else
			{
				mini=rightMax;
			}
			
			if(mini>arr[i])
			{	
				s=mini-arr[i];
				sum+=s;
				
			}
			else
			{
				sum+=0;
			}
			}
			else
			{
				sum+=0;
			}
			
		}
		System.out.println("the maximum water it can store is:"+sum);
	}
}