/*9. Count Subarrays of Size K with Avg ≥ Target

Approach: Sliding Window
Example: arr = [2,1,3,4,1,2], k = 3, avg = 2 → Count: 2

10. Minimum Size Subarray with Sum ≥ Target
*/
import java.util.*;
public class CountSubarraysOfSizeKWithAvg
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={2,1,3,4,1,2};
		int k=3,sum=0,count=0;
		
		for(int i=0; i<k; i++)
		{
			sum+=arr[i];
		}
		
		
		if((float)sum/k >=2)
		{
			count++;
		}
		for(int i=k; i<arr.length; i++)
		{
			sum+=arr[i];
			sum=sum-arr[i-k];
			
			if((float)sum/k >=2)
			{
				count++;
			}
			
			
		}
		System.out.println("the count is:"+count);
				
	}
}