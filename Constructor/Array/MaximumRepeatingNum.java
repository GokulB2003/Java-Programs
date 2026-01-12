/*Q10. Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7
*/
import java.util.*;
public class MaximumRepeatingNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={2,3,3,5,3,4,1,7,7,7,7};
		Arrays.sort(arr);
		int count=0,maxi=0;
		int a=0;
		for(int i=1; i<arr.length; i++)
		{

			if(arr[i]==arr[i-1])
			{
				count++;
				if(count>maxi)
				{
					a=arr[i-1];
				}

				maxi=Math.max(count,maxi);
							}
			else
			{
				count=0;
			}
		}
		System.out.println(a);
	}
}