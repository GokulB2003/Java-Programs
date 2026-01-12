/*3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)
*/
import java.util.*;
public class PairsWithDiffArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1, 5, 3, 4, 2};
		int k=2;
		for(int i=0; i<arr.length; i++)
		{	int sum=0;
			for(int j=i+1; j<arr.length; j++)
			{
				sum=arr[i]-arr[j];
				if(sum<0)
				{
					sum=sum*(-1);
				}
				if(sum==k)
				{
					System.out.print("("+arr[i]+","+arr[j]+")");
				}
			}	
		}
	}
}