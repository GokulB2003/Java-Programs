/*4. Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true
*/
import java.util.*;
public class CheckArrayIsSorted
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1, 2, 2, 3, 4,9};
		Boolean flag=false;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<arr[i-1])
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("true");
		}	
	}

}