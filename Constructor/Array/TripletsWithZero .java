/*2. Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4]  
Output: (-1, 0, 1), (-1, -1, 2)
*/
import java.util.*;
public class TripletsWithZero 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[9];
		System.out.println("Enter");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		k=3;
		for(int i=0; i<arr.length; i++)
		{	int sum=0;
			for(int j=i; j<(i+k); j++)
			{
				sum+=(arr[j]);
				if(sum==0)
				{
					System.out.print("(j+",");				
				}
			}
		}
	}
