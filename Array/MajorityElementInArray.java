/*.Find Majority Element (Occurs > n/2 Times)
Concept: Use count method or Boyer-Moore Voting Algorithm.
 Use Case: Identify the dominating product, preference, etc.
Inut : arr = [2, 2, 1, 1, 2, 2, 2]
Size (n) = 7
Majority element is: 2

*/

import java.util.*;

public class MajorityElementInArray
{
	public static void main(String args[])
	{
		 int[] arr = {2,2,1,1,2,2,2};
		 int count=0;
		 int i=1;
			Arrays.sort(arr);
		 while(i<arr.length)
		{
			if(arr[i]==arr[i-1])
			{
				count++;
				i++;
			}
			else
			{	
				if(count>=arr.length/2)
				{
					System.out.println(arr[i-1]);
				}
				count=0;
				//1,2,3,3,4
				i++;
				
			}
			
		}

			
	}
}