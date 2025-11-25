/*Write a program in java to find the smallest missing element from a sorted array?
		Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2
*/

import java.util.*;
public class SmallestMissingNum
{
	public static void main(String args[])
	{
		int nums[]={0,1,3,4,5,6,7,9};
		int i=0;
		while(i<nums.length-1)
		{
			if(nums[i+1]-nums[i]!=1)
			{
				System.out.println(nums[i]+1);
				break;
			}
			i++;
			
		}
	}
}