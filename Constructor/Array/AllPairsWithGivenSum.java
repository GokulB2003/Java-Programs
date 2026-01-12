/*Find All Pairs with Given Sum
Concept: Use nested loops or two-pointer technique to check sums.
 Use Case: Match contributors, tasks, etc., that add up to a budget.
arr = [1, 5, 7, -1, 5]
Target sum (S) = 6
Example: Pairs with sum 6:
(5, 1)
(-1, 7)
(5, 1)
*/

import java.util.*;
class Reverse
{
	void reverseArray(int arr[])
	{
		int s=0;
		int e=arr.length-1;
		while(s<e)
		{
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
	}
}
public class AllPairsWithGivenSum
{
	public static void main(String args[])
	{
		int arr[]={1,5,7,-1,5};
		int sum=6;
		Reverse obj=new Reverse();
		obj.reverseArray(arr);
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.print("(");
					System.out.print(arr[i]);
					System.out.print(",");
					System.out.print(arr[j]);
					System.out.print(")");
				}
			}
		}
	}
}