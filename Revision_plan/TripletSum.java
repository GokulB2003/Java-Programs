/* Check for Triplets with Zero Sum
Problem:
Check if any three elements in the array sum to 0.
Example:
Input: [-1, 0, 1, 2, -1, -4] 
Output: (-1, 0, 1), (-1, -1, 2)
*/
import java.util.*;
public class TripletSum
{
	public static void main(String args[])
	{
		int arr[]=new int[]{-1,0,1,2,-1,-4};
		Arrays.sort(arr);
		for(int i=0; i<arr.length-2; i++)
		{
			for(int j=i+1; j<arr.length-1; j++)
			{
				for(int k=j+1; k<arr.length; k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.println(arr[i]);
						System.out.println(arr[j]);
						System.out.println(arr[k]);
					}
				}
			}
		}
		
		/*int sum=0;
		int e=0,s=0;
		while(e<arr.length)
		{
			sum+=arr[e];
			while((e-s+1)>3 && s<e)
			{						// [-1, 0, 1, 2, -1, -4]
				sum=sum-arr[s];
				s++;
			}
			if((e-s+1)==3)
			{
				if(sum==0)
				{
				for(int i=s; i<=e; i++)
				{
					System.out.println(arr[i]);
				}
				}
			}
			e++;
			
		}

		*/		

		
	}
}
