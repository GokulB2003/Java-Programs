/*7. Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3
*/
import java.util.*;
public class IntersectionOfTwoArr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr1[]={1,2,3};
		int arr2[]={2,3,4};
		
		int maxi=Math.max(arr1.length,arr2.length);
		int i=0,j=0;
		for(i=0; i<arr1.length; i++)
		{
			j=0;
			while(j<arr2.length)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+",");
				}
				j++;
			}
		}

		
	}
}